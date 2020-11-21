package module04.TASK_01;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ProgramTask01_1 {
    public static void main(String[] args) {
        String inputString = "Hell world!";
        try {
            System.setIn(new ByteArrayInputStream(inputString.getBytes("UTF-8")));
            int currentChar;
            while ((currentChar = System.in.read()) != -1)  {
                System.out.print((char) currentChar);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
