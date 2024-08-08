package d2_recusion;

import java.io.File;
import java.io.IOException;

public class FindFile {
    public static void main(String[] args) {
        getFileAddress(new File("C:\\Users\\Red\\Desktop\\New Folder"), "Git.md");
        System.out.println(getFileAddress2(new File("C:\\Users\\Red\\Desktop\\New Folder"), "111.md"));
    }

    public static void getFileAddress(File fileDir, String fileName) {
        // 检查传入的文件夹是否有效
        if (fileDir != null && fileDir.isDirectory()) {
            File[] fileList = fileDir.listFiles();
            if (fileList != null && fileList.length > 0) {
                for (File file : fileList) {
                    if (file.isDirectory()) {
                        getFileAddress(file, fileName);
                    } else {
                        if (file.getName().equals(fileName)) {
                            System.out.println(file.getAbsolutePath());
                        }
                    }
                }
            }
        }
    }

    public static String getFileAddress2(File fileDir, String fileName) {
        String result = null;

        // 检查传入的文件夹是否有效
        if (fileDir != null && fileDir.isDirectory()) {
            File[] fileList = fileDir.listFiles();
            if (fileList != null && fileList.length > 0) {
                for (File file : fileList) {
                    if (file.isDirectory()) {
                        result = getFileAddress2(file, fileName);
                        if (result != null) {

//                            try {
//                                Runtime r = Runtime.getRuntime();
//                                r.exec(file.getAbsolutePath());
//                            } catch (IOException e) {
//                                throw new RuntimeException(e);
//                            }

                            return result;  // Find
                        }
                    } else {
                        if (file.getName().equals(fileName) && result == null) {
                            return file.getAbsolutePath();  // Find
                        }
                    }
                }
            }
        }
        return result;
    }

}
