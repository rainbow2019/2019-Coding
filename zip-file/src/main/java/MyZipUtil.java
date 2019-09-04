import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;

import java.io.*;


/**
 * 压缩文件
 */
public class MyZipUtil {
    private static Integer BUFFER_SIZE = 1024 * 1024;

    /**
     * 压缩文件或 目录至zipFile中
     *
     * @param src
     * @param zipDesFile
     */
    public static void compress(File src, File zipDesFile) {
        ZipOutputStream zos = null;
        try {
            //压缩文件的输出流
            zos = new ZipOutputStream(new FileOutputStream(zipDesFile));
            compress(zos, src, "");
        } catch (Exception ex) {
            System.out.println("压缩compress出现异常：" + ex);
        } finally {
            MyFileUtil.close(zos);
        }
    }

    public static void compress(String srcPath, String zipDesPath)
            throws IOException {
        File src = new File(srcPath);
        if (!src.exists()) {
            return;
        }
        File zipDesFile = new File(zipDesPath);
        MyFileUtil.ensureFile(zipDesFile);
        compress(src, zipDesFile);

    }


    /**
     * 处理目录
     */
    public static void compress(ZipOutputStream zos, File src, String baseDir) {
        try {
            if (src.isDirectory()) {
                File[] files = src.listFiles();
                baseDir = baseDir + "/" + src.getName() + "/";//必须以"/"结尾否则是文件
                zos.putNextEntry(new ZipEntry(baseDir));//添加目录(无论是否是空目录)
                for (File file : files) {
                    compress(zos, file, baseDir);//递归调用
                }
            } else {
                doCompressFile(zos, src, baseDir + "/");//压缩某个文件
            }
        } catch (Exception ex) {
            throw new RuntimeException("压缩文件夹出现异常：" + ex.getMessage());
        }
    }

    /**
     * 具体压缩某个文件
     *
     * @param zos
     * @param file
     * @param baseDir
     */
    public static void doCompressFile(ZipOutputStream zos, File file, String baseDir) {
        BufferedInputStream bis = null;
        byte[] buffer = new byte[BUFFER_SIZE];
        int len;
        try {
            bis = new BufferedInputStream(new FileInputStream(file));
            //必须putNextEntry
            zos.putNextEntry(new ZipEntry(baseDir + file.getName()));
            while ((len = bis.read(buffer)) != -1) {
                zos.write(buffer, 0, len);
            }
        } catch (IOException ex) {
            System.out.println("压缩文件时出现异常：" + ex);
        } finally {
            try {
                zos.closeEntry();
            } catch (Exception ex) {
                System.out.println("关闭zos出现异常：" + ex);
            } finally {
                MyFileUtil.close(bis);//一定不要忘记关闭
            }
        }
    }
}
