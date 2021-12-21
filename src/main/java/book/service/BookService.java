package book.service;

import book.model.Author;
import book.model.Book;
import book.model.Publisher;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class BookService {
    public List<Book> filterBooksByAuthor(Author author, List<Book> books)
    {
        System.out.println("Start filtering author: "+ author);
        List<Book> filtered = books.stream().filter(book-> getBookByAuthor(author,book.getAuthor()))
                .collect(Collectors.toList());
        return filtered;
    };
    public List<Book> filterBooksByPublisher(Publisher publisher, List<Book> books)
    {
        System.out.println("Start filtering publisher: "+ publisher);
        List<Book> filtered = books.stream().filter(book-> book.getPublisher().getId()==publisher.getId())
                .collect(Collectors.toList());
        return filtered;
    };

    public List<Book> filterBooksAfterSpecifiedYear(int yearFromInclusively, List<Book> books)
    {
        System.out.println("Start filtering publishing year: "+ yearFromInclusively);
        List<Book> filtered = books.stream().filter(book-> book.getPublisherYear()==yearFromInclusively)
                .collect(Collectors.toList());
        return filtered;
    };

    private boolean getBookByAuthor(Author author, Author[] authors) {
        for (int i = 0; i < authors.length; i++) {
            if (author.getId()==(authors[i].getId())){
                return true;
            }
        }
        return false;
    }
}
