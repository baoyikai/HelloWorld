import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class creatNewFileWithabctxt {
    public static void main(String[] args) throws IOException {
        String path = "/Users/baoyikai/Documents/file for java/abc.txt";
        String words = "Hello world";

        //创建文件
        File file = new File(path);

        //写入
        FileOutputStream output = new FileOutputStream(path);
        byte[] wordsBytes = words.getBytes();
        output.write(wordsBytes);
        output.close();

        //读取
        FileInputStream input = new FileInputStream(path);
        int i = 0;
        while ((i = input.read()) != -1){
            System.out.print((char)i);
        }
        input.close();
    }
}