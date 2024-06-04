package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> catalog;

    public BookCatalog() {
        this.catalog = new ArrayList<>();
    }
    public void addBook(String title, String author, int yearPublication) {
        Book book = new Book(title, author, yearPublication);
        this.catalog.add(book);
    }
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        if (!this.catalog.isEmpty()) {
            for (Book book : this.catalog) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }
    public List<Book> findByYearInterval(int inicialYear, int finalYear) {
        List<Book> booksByYear = new ArrayList<>();
        if (!this.catalog.isEmpty()) {
            for (Book book: this.catalog){
                if (book.getYearPublication() >= inicialYear && book.getYearPublication() <= finalYear){
                    booksByYear.add(book);
                }
            }
        }
        return booksByYear;
    }
    public Book findByTitle(String title) {
        Book bookByTitle = null;
        if (!this.catalog.isEmpty()){
            for (Book book : this.catalog){
                if (book.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = book;
                }
            }
        }
        return bookByTitle;
    }
}
