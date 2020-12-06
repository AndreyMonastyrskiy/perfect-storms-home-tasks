package module04.TASK_05;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Song song1 = new Song("Song1", 10d, new Author("Author1", 20, "Num1"));
        Song song2 = new Song("Song2", 20d, new Author("Author2", 30, "Num2"));
        Song song3 = new Song("Song3", 30d, new Author("Author3", 40, "Num3"));

        try (ObjectOutputStream objectOut = new ObjectOutputStream( new FileOutputStream("songs.out", false));
             ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("songs.out"))) {
            objectOut.writeObject(song1);
            objectOut.writeObject(song2);
            objectOut.writeObject(song3);
            Song song4 = (Song) objectIn.readObject();
            Song song5 = (Song) objectIn.readObject();
            Song song6 = (Song) objectIn.readObject();

            System.out.println(song4);
            System.out.println(song5);
            System.out.println(song6);


        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }


    }
}
