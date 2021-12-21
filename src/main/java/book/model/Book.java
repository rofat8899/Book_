package book.model;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private Author[] author;
    private Author author1;
    private Publisher publisher;
    private int publisherYear;
    private int amountOfPage;
    private BigDecimal price;
    private CoverType coverType;

    public Book(int id, String name, Author[] author, Publisher publisher, int publisherYear, int amountOfPage, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publisherYear = publisherYear;
        this.amountOfPage = amountOfPage;
        this.price = price;
        this.coverType = coverType;
    }

    public boolean getByAuthor(Author _author){
        int i = 0;
        boolean condition=false;
       if( i < author.length)
        {
           author[i]=_author;
            condition=true;
        }
        return condition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }



    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public int getAmountOfPage() {
        return amountOfPage;
    }

    public void setAmountOfPage(int amountOfPage) {
        this.amountOfPage = amountOfPage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publisher=" + publisher +
                ", publisherYear=" + publisherYear +
                ", amountOfPage=" + amountOfPage +
                ", price=" + price +
                ", coverType=" + coverType +
                '}';
    }
}
