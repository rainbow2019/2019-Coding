import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 工具类
 */
public class MyFileUtil {

    private static Integer BUFFER_SIZE = 1024 * 1024;

    /**
     * 确保文件夹的存在
     *
     * @param dirPath
     */
    public static File ensureDir(String dirPath) {
        File dir = new File(dirPath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        return dir;
    }

    /**
     * 确保文件的存在
     *
     * @param file
     * @throws IOException
     */
    public static void ensureFile(File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
    }


    /**
     * 读取操作并关闭IO流
     *
     * @param is
     * @param os
     * @throws IOException
     */
    private static void doWrite(InputStream is, OutputStream os) throws IOException {
        try {
            byte[] buffer = new byte[BUFFER_SIZE];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
                os.flush();
            }
        } finally {
            close(is);
            close(os);
        }
    }


    /**
     * 关闭输入流
     */
    public static void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                //logger.info("读取IO流关闭失败");
            }
        }
    }

    /**
     * 关闭输出流
     */
    public static void close(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
//            logger.info("写入IO流关闭失败");
            }
        }
    }

}
