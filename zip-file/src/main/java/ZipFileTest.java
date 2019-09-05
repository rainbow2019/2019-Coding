import java.io.File;
import java.io.IOException;


public class ZipFileTest {
    public static void main(String[] args) throws IOException {
        compress();
        upCompress();
    }

    public static void compress() throws IOException {
        File dir = new File("D:\\export");
        try {
            File zipFile = new File("E:\\" + dir.getName().split("\\.")[0] + ".zip");
            MyFileUtil.ensureFile(zipFile);
            MyZipCompressUtil.compress(dir, zipFile);
        } catch (Exception ex) {
            System.out.println("压缩失败！");
        }
    }

    public static void upCompress() throws IOException {
        File zip = new File("E://export.zip");
//        MyZipUnCompressUtil.unCompress(zip, "E://");
        MyZipUnCompressUtil.unZipCompress(zip, "E://");

    }
}
