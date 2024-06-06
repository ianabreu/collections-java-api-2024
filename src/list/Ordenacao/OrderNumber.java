package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderNumber {
    List<Integer> listNumbers;

    public OrderNumber() {
        this.listNumbers = new ArrayList<>();
    }
    public  void addNumber(int number) {
        this.listNumbers.add(number);
    }
    public List<Integer> orderAscending() {
        List<Integer> listAscending = new ArrayList<>(this.listNumbers);
        Collections.sort(listAscending);

        return listAscending;
    }
    public List<Integer> orderDescending() {
        List<Integer> listDescending = new ArrayList<>(this.listNumbers);
        Collections.sort(listDescending);
        Collections.reverse(listDescending);
        return listDescending;
    }

}
