import java.io.*;
public class outputFileCHUSHIBIAO{
    public static void main(String[] args) throws IOException{
        String path = "/Users/baoyikai/Documents/file for java/出师表 output.rtf";
        FileOutputStream output = new FileOutputStream(path);
        String outputText = " Life Is a Journey   Jack London\n" +
                "From the hell to the heaven,\n" +
                "\n" +
                "There's no straight way to walk.\n" +
                "\n" +
                "Sometimes up, sometimes down.\n" +
                "\n" +
                "Hope creates a heaven for us,\n" +
                "\n" +
                "Despair makes a hell for us.\n" +
                "\n" +
                "Some choices are waiting for me,\n" +
                "\n" +
                "Which one on earth is better?\n" +
                "\n" +
                "No God in the world can help me,\n" +
                "\n" +
                "Choosing is the byname of freedom,\n" +
                "\n" +
                "Different choice makes different future.\n" +
                "\n" +
                "It's stupid to put eyes on others.\n" +
                "\n" +
                "I have to make up my own mind,\n" +
                "\n" +
                "Going my way to the destination.\n" +
                "\n" +
                "Facing success or failure,\n" +
                "\n" +
                "It's no need to care too much.\n" +
                "\n" +
                "Only if I've tried my best,\n" +
                "\n" +
                "It's enough for my simple life.";
        byte[] outputTextBytes = outputText.getBytes();
        output.write(outputTextBytes);
        output.close();
        FileInputStream input = new FileInputStream(path);
        int i = 0;
        while ((i = input.read()) != -1){
            System.out.print((char)i);
        }
        input.close();

    }
}