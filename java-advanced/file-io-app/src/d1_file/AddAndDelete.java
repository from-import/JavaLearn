package d1_file;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AddAndDelete {
    public static void main(String[] args) throws IOException {
        // 1.create new file
        File f = new File("file-io-app\\src\\data.txt");
        f.createNewFile();

        // 2. create new dir
        File f2 = new File("file-io-app\\src\\testDir");
        f2.mkdir();

        // 3. create new dirs
        File f3 = new File("file-io-app\\src\\testDir\\xxxxxx");
        f3.mkdirs();

        // 4. delete file/dir
        File f4 = new File("file-io-app\\src\\testDir\\xxxxxx");
        f4.delete();

        // 5. for(File f : files)
        File f5 = new File("C:/");
        File[] files = f5.listFiles();
        for(File f1 : files){
            System.out.println(f1);
        }



    }
}
