package main.java;

import main.java.list.Ordenacao.OrderNumber;

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