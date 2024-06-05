import list.Ordenacao.OrderPeople;
import list.Pesquisa.BookCatalog;
import list.Pesquisa.SumNumbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderPeople p = new OrderPeople();
        p.addPeople("Ian", 30,1.75);
        p.addPeople("Augusto", 90,1.1);
        p.addPeople("Marcia", 29,1.80);
        System.out.println(p.orderByHeight());
        p.addPeople("Mimiu", 55,1.63);
        System.out.println(p.orderByAge());

    }
}