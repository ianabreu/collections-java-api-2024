package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderPeople {
    List<People> listPeople;

    public OrderPeople() {
        this.listPeople = new ArrayList<>();
    }
    public void addPeople(String name, int age, double height) {
        this.listPeople.add(new People(name, age, height));
    }
    public List<People> orderByAge() {
    List<People> listByAge = new ArrayList<>(this.listPeople);
        Collections.sort(listByAge);
        return listByAge;
    }
    public List<People> orderByHeight() {
        List<People> listByHeight = new ArrayList<>(this.listPeople);
        Collections.sort(listByHeight, new ComparatorByHeight());
        return listByHeight;

    }
}
