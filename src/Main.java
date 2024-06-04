import list.Pesquisa.BookCatalog;

public class Main {
    public static void main(String[] args) {
        BookCatalog saraiva = new BookCatalog();
        saraiva.addBook("O Senhor dos Aneis - As Duas Torres", "Tolkien", 1937);
        saraiva.addBook("A Arte da Guerra", "Sun Tzu", 1981);
        saraiva.addBook("A Arte da Guerra", "Sun Tzu", 1979);
        saraiva.addBook("O Senhor dos Aneis - 2", "Tolkien", 1940);
        System.out.println(saraiva.findByAuthor("tolkien"));
        System.out.println(saraiva.findByYearInterval(1903, 1912));
        System.out.println(saraiva.findByTitle("a Arte da Guerra"));



    }
}