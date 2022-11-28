import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        String title;
        int pages, year;
        
        
        while (true) {
            System.out.println("Title: ");
            title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
        
        
        
        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();

        for (Book book : books) {
            if (information.equals("everything")) {
                System.out.println(book);
            } else if (information.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
