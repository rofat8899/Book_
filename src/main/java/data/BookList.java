package data;

import book.model.Author;
import book.model.Book;
import book.model.CoverType;
import book.model.Publisher;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookList {
    public List<Book> getBookList() {
        List<Book> books = new ArrayList<>();

        books.add(new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.Paperback));
        books.add(new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.Paperback));
        books.add(new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.hardcover));
        books.add(new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.hardcover));
       // System.out.println(books);

        return books;
    }
}
