import list.Ordenacao.OrderNumber;
import list.Ordenacao.OrderPeople;
import list.Pesquisa.BookCatalog;
import list.Pesquisa.SumNumbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderNumber n = new OrderNumber();
        n.addNumber(3);
        n.addNumber(17);
        n.addNumber(22);
        n.addNumber(15);
        n.addNumber(9);
        System.out.println(n.orderAscending());
        System.out.println(n.orderDescending());

    }
}