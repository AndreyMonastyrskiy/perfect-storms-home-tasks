package module04.TASK_01;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramTask01_2 {
    public static void main(String[] args) {
        System.out.println("Enter any string with ',' symbols in:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputLine = bufferedReader.readLine();
            if (inputLine != null) {
                CharArrayReader charArrayReader = new CharArrayReader(inputLine.toCharArray());
                int character;
                int counter = 0;
                while ((character = charArrayReader.read()) != -1) {
                    if ((char) character == ',') {
                        counter++;
                    }
                }
                System.out.println("Total number of ',' is: " + counter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
