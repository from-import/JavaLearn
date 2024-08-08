package d1_file;

import java.io.File;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Red\\Pictures\\image.jpg");
        long size = f.length();
        System.out.println(size);

        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());

        System.out.println(f.lastModified());
        System.out.println("last changed time "+ new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(f.lastModified()));

        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        File f2 = new File("C:/");
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.exists());
    }
}
    