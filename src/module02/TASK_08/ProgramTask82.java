package module02.TASK_08;

public class ProgramTask82 {
    public static void main(String[] args) {
        String str = "12 var3 34 2%^i 90";
        System.out.println(getNumbersFromString(str));
        System.out.println(getWordsOfNumbers(str));
    }

    public static String getNumbersFromString(String inputStr) {
        return inputStr.replaceAll("[^0-9]", "");
    }

    public static String getWordsOfNumbers(String inputStr) {
        String result = "";
        String[] words = inputStr.split(" ");
        for (String word: words) {
            if (word.matches("\\d+")) {
                result += word;
            }
        }
        return result;
    }
}
