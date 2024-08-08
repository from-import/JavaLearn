package d2_recusion;

import java.io.File;

public class FindFile {
    public static void main(String[] args) {
        System.out.println(getFileAddress(new File("C:\\Users\\Red\\Desktop\\New Folder"), "Git.md"));
    }

    public static String getFileAddress(File fileDir, String fileName) {
        // 检查传入的文件夹是否有效
        if (fileDir == null || !fileDir.isDirectory()) {
            return null;
        }

        File[] fileList = fileDir.listFiles();
        if (fileList == null) {
            return null; // 如果无法获取文件列表，返回 null
        }

        for (File file : fileList) {
            if (file.isDirectory()) {
                // 递归查找子目录
                String result = getFileAddress(file, fileName);
                if (result != null) {
                    return result;
                }
            } else if (file.getName().equals(fileName)) {
                // 找到匹配的文件
                return file.getAbsolutePath();
            }
        }
        return null;
    }
}
