package module03.TASK_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action = "";
        String title = "";
        ArrayList<String> booksDb = new ArrayList<>();

        System.out.println("Welcome to the book titles database.");
        System.out.println("Type \"help\" to get a description of the available commands.");
        System.out.println();

        while (!action.equals("exit")) {
            System.out.println("Please enter one of the available commands (help, add, delete, edit, show, check, sort, exit):");
            System.out.print("> ");
            action = scanner.nextLine();
            switch (action) {
                case "help":
                    System.out.println("\"add\" command - adds the title of the book to the database, provided that there is no such title yet.");
                    System.out.println("\"delete\" command - removes the book title from the database, provided that such a title exists.");
                    System.out.println("\"edit\" command - allows you to change the title of a book in the database, provided that it exists.");
                    System.out.println("\"show\" command - displays all book titles from the database.");
                    System.out.println("\"check\" command - allows you to check if the book title exists in the database.");
                    System.out.println("\"sort\" command - sorts the titles of the books in the database alphabetically.");
                    System.out.println("\"exit\" command - allows you to exit the program.");
                    System.out.println();
                    break;
                case "add":
                    System.out.println("Please enter book title:");
                    System.out.print("> ");
                    title = scanner.nextLine();
                    if (title.equals("")) {
                        System.out.println("No title has been added, entered blank.");
                        break;
                    }
                    if (booksDb.contains(title)) {
                        System.out.println("The title of the book is already in the database!");
                        break;
                    }
                    booksDb.add(title);
                    System.out.println(String.format("Book title \"%s\" has been successfully added to the database.", title));
                    break;
                case "delete":
                    System.out.println("Please enter book title to delete:");
                    System.out.print("> ");
                    title = scanner.nextLine();
                    if (!booksDb.contains(title)) {
                        System.out.println(String.format("Book with title \"%s\" not found in database.", title));
                        break;
                    }
                    booksDb.remove(title);
                    System.out.println(String.format("Book title \"%s\" has been removed from the database.", title));
                    break;
                case "edit":
                    System.out.println("Please enter book title to edit:");
                    System.out.print("> ");
                    title = scanner.nextLine();
                    if (booksDb.contains(title)){
                        System.out.println("Please enter new book title");
                        System.out.print("> ");
                        String newBookTitle = scanner.nextLine();
                        if (!newBookTitle.equals("")) {
                            booksDb.set(booksDb.indexOf(title), newBookTitle);
                            System.out.println("Book title updated.");
                        } else {
                            System.out.println("Book title cannot be empty!");
                        }
                    } else {
                        System.out.println(String.format("Book with title \"%s\" not found in database.", title));
                    }
                    break;
                case "show":
                    if (booksDb.size() < 1) {
                        System.out.println("There are no book titles in the database.");
                    }
                    for (int i = 0; i < booksDb.size(); i++) {
                        System.out.println(booksDb.get(i));
                    }
                    break;
                case "check":
                    System.out.println("Please enter book title:");
                    System.out.print("> ");
                    title = scanner.nextLine();
                    if (booksDb.contains(title)) {
                        System.out.println(String.format("Book title \"%s\" found in the database", title));
                    } else {
                        System.out.println(String.format("Book title \"%s\" not found in the database", title));
                    }
                    break;
                case "sort":
                    Collections.sort(booksDb);
                    System.out.println("Book titles are sorted.");
                    break;
                case "exit":
                    break;
                default:
                    System.out.println(String.format("Command \"%s\" not found!", action));
                    break;
            }
        }

        scanner.close();
    }
}
