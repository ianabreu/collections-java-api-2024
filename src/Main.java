import list.Pesquisa.BookCatalog;
import list.Pesquisa.SumNumbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SumNumbers n = new SumNumbers();
        n.addNumber(3);
        n.addNumber(5);
        n.addNumber(10);
        n.addNumber(-7);
        System.out.println(n.displayNumbers());
        n.addNumber(53);
        System.out.println(n.calculateSum());
        System.out.println(n.findBiggestNumber());
        System.out.println(n.findSmallestNumber());

    }
}