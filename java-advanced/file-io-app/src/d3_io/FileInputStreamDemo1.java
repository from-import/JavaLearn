package d3_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("file-io-app\\src\\data.txt");

        byte[] buffer = new byte[3];
        int len ;
        while((len = is.read(buffer)) != -1){
            System.out.print(new String(buffer,0,len));
        }


    }
}
