package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    List<Integer> listNumbers;

    public SumNumbers() {
        this.listNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.listNumbers.add(number);
    }
    public int calculateSum() {
        if (!this.listNumbers.isEmpty()) {
            int sum = 0;
        for (int number: listNumbers) {
          sum += number;
        }
        return sum;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public int findBiggestNumber() {
        if (!this.listNumbers.isEmpty()) {
            int bigNumber = this.listNumbers.get(0);
            for (int number: listNumbers) {
                if (number > bigNumber){
                    bigNumber = number;
                }
            }
            return bigNumber;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public int findSmallestNumber() {
        if (!this.listNumbers.isEmpty()) {
            int smallNumber = this.listNumbers.get(0);
            for (int number: listNumbers) {
                if (number < smallNumber){
                    smallNumber = number;
                }
            }
            return smallNumber;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> displayNumbers() {
        return this.listNumbers;
    }
}
