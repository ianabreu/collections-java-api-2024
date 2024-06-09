package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{
    //atributos

    private long barCode;
    private String name;
    private double price;
    private int amount;

    //metodos

    public Product( long barCode, String name, double price, int amount) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getBarCode() == product.getBarCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBarCode());
    }

    @Override
    public String toString() {
        return '\n' + "{" + "barCode=" + barCode + ", name='" + name + '\'' + ", price=" + price +  ", amount=" + amount + '}';
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}

class ComparatorByPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
