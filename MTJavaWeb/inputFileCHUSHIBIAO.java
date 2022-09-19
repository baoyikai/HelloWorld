import java.io.*;
public class inputFileCHUSHIBIAO{
    public static void main(String[] args) throws IOException{
        String path = "/Users/baoyikai/Documents/file for java/出师表.rtf";
        FileInputStream input = new FileInputStream(path);
        int i = 0;
        while((i = input.read()) != -1){
            System.out.print((char)i);
        }
        input.close();
    }
}