package module02.FINAL_TASK;

public class Coordinates {
    private byte number;
    private char letter;

    public Coordinates( char letter, byte number) {
        setNumber(number);
        setLetter(letter);
    }

    public Coordinates(String coordinates) {
        if (validate(coordinates)) {
            setLetter(coordinates.charAt(0));
            setNumber(Byte.parseByte(Character.toString(coordinates.charAt(1))));
        } else {
            throw new IllegalArgumentException(
                    String.format("Coordinates %s is not valid for Chess board!", coordinates)
            );
        }

    }

    public void setLetter(char letter) {
        if (letter >= 'a' && letter <= 'h') {
            this.letter = letter;
        } else {
            throw new IllegalArgumentException(
                    String.format("Argument letter \"%s\" isn't valid. It must range from 'a' to 'h'", letter)
            );
        }

    }

    public void setNumber(byte number) {
        if (number >= 1 && number <= 8){
            this.number = number;
        } else {
            throw new IllegalArgumentException(
                    String.format("Argument Number \"%d\" isn't valid. It must range from 1 to 8.", number));
        }

    }

    public byte getNumber() {
        return this.number;
    }

    public byte getNumberForArray() {
        return (byte) (this.number - 1);
    }

    public char getLetter() {
        return this.letter;
    }

    public byte getLetterForArray() {
        return (byte) (this.letter - 97);
    }

    public static Boolean validate( char letter, byte number) {
        if ((letter >= 'a' && letter <= 'h') && (number >= 1 && number <= 8)) {
            return true;
        }
        return false;
    }

    public static Boolean validate(String coordinates) {
        if (coordinates.length() == 2) {
            char letter = coordinates.charAt(0);
            byte number = Byte.parseByte(Character.toString(coordinates.charAt(1)));
            if ((letter >= 'a' && letter <= 'h') && (number >= 1 && number <= 8)) {
                return true;
            }
        }
        return false;
    }
}
