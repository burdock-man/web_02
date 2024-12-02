package a1201.bookstore;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {

    Scanner scan = new Scanner(System.in);

    private ArrayList<BookDTO> books = new ArrayList<>();

    public BookDAO() {
        books.add(new BookDTO(1, "Java Programming", "Author A", 2020));
        books.add(new BookDTO(2, "Python Basics", "Author B", 2019));
        books.add(new BookDTO(3, "Data Structures", "Author C", 2018));
    }

    public void bookList() {
        System.out.println();
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

}
