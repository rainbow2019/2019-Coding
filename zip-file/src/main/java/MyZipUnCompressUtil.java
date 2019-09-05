import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipInputStream;


/**
 * @Description 注释
 * @Author zhaohong
 * @Time 2019-09-04 21:16
 */
public class MyZipUnCompressUtil {
    /**
     * 方法1：利用ZipFile的getEntries获取ZipEntry的枚举
     * org.apache.tools.zip.ZipFile
     * org.apache.tools.zip.ZipEntry
     *
     * @param zip
     * @param desDirPath
     * @throws IOException
     */
    public static void unCompress(File zip, String desDirPath) throws IOException {
        MyFileUtil.ensureDir(desDirPath);//确保目的目录存在
        ZipFile zipFile = new ZipFile(zip);
        Enumeration<ZipEntry> entries = zipFile.getEntries();
        ZipEntry zipEntry;
        while (entries.hasMoreElements()) {
            zipEntry = entries.nextElement();
            String zipEntryName = zipEntry.getName();
            InputStream is = zipFile.getInputStream(zipEntry);
            String outFilePath = desDirPath + zipEntryName;
            System.out.println("outFilePath = " + outFilePath);
            String outPath = outFilePath.replaceAll("\\*", "/");//将\转换成/
            //若是目录肯定是以"/"结尾的
            String outDirPath = outPath.substring(0, outPath.lastIndexOf("/"));
            MyFileUtil.ensureDir(outDirPath);//创建目录
            File outFile = new File(outPath);
            if (outFile.isDirectory()) {
                continue;
            }
            System.out.println(outPath);
            OutputStream os = new FileOutputStream(outFile);
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) != -1) {//使用read(buf),不是read(),导致读取的文件特别大
                os.write(buf, 0, len);
                os.flush();
            }
            is.close();
            os.close();
        }
        System.out.println("解压缩完毕！！！");
    }

    /**
     * 方法2：利用ZipInputStream读取，getNextEntry获取ZipEntry
     * java.util.zip.ZipInputStream
     * java.util.zip.ZipEntry
     *
     * @param zip
     * @param desDirPath
     * @throws IOException
     */
    public static void unZipCompress(File zip, String desDirPath) throws IOException {
        MyFileUtil.ensureDir(desDirPath);//确保目的目录存在
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zip));
        java.util.zip.ZipEntry zipEntry;
        while ((zipEntry = zis.getNextEntry()) != null) {
            String zipEntryName = zipEntry.getName();
            String outFilePath = desDirPath + zipEntryName;
            System.out.println("outFilePath = " + outFilePath);
            String outPath = outFilePath.replaceAll("\\*", "/");//将\转换成/
            //若是目录肯定是以"/"结尾的
            String outDirPath = outPath.substring(0, outPath.lastIndexOf("/"));
            MyFileUtil.ensureDir(outDirPath);//创建目录
            File outFile = new File(outPath);
            if (outFile.isDirectory()) {
                continue;
            }
            System.out.println(outPath);
            OutputStream os = new FileOutputStream(outFile);
            byte[] buf = new byte[1024];
            int len;
            while ((len = zis.read(buf)) != -1) {//使用read(buf),不是read(),导致读取的文件特别大
                os.write(buf, 0, len);
                os.flush();
            }
            zis.closeEntry();
            os.close();
        }
        zis.close();
        System.out.println("解压缩完毕！！！");
    }
}
