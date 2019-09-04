import java.io.File;


public class ZipFileTest {
    public static void main(String[] args) {
        File dir = new File("D:\\export");
        try {
            File zipFile = new File("E:\\" + dir.getName().split("\\.")[0] + ".zip");
            MyFileUtil.ensureFile(zipFile);
            MyZipUtil.compress(dir, zipFile);
        } catch (Exception ex) {

        }
    }
}
