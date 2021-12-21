package book;

import book.model.Author;
import book.model.Book;
import book.model.Publisher;
import book.service.BookService;
import data.BookList;

import java.util.List;

public class Application {
    List<Book> bookList = new BookList().getBookList();
    private void displayResult(List<Book> books)
    {
        for (Book book : books) {
            System.out.println("-> Result : "+book.toString());
        }
    }

    private List<Book> findBookByAuthor(Author author){
        return new BookService().filterBooksByAuthor(author,bookList);
    }

    private List<Book> findBookByPublisher(Publisher publisher){
        return new BookService().filterBooksByPublisher(publisher,bookList);
    }

    private List<Book> findBooksAfterSpecifiedYear(int yearFromInclusively){
        return new BookService().filterBooksAfterSpecifiedYear(yearFromInclusively,bookList);
    }

    public static void main(String[] args) {
    List<Book> books = new Application().findBookByAuthor(new Author(4, "Craig", "Gregory"));
    new Application().displayResult(books);

    System.out.println("\n");

    List<Book> books1 = new Application().findBookByPublisher(new Publisher(1, "Publisher_1"));
    new Application().displayResult(books1);

    System.out.println("\n");

    List<Book> books2 = new Application().findBooksAfterSpecifiedYear(2000);
        new Application().displayResult(books2);
    }
}
