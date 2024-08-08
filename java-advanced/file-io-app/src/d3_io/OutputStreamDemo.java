package d3_io;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("file-io-app\\src\\data.txt");
        os.write('a');
        os.write(79);

        byte[] buffer1 = {'a','c','d'};
        os.write(buffer1);

        byte[] buffer2 = "hahahhahh".getBytes();
        os.write(buffer2);

    }
}
