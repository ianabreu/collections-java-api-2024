package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    private Set<Product> productSet;

    public ProductRegistration() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long barCode, String name, double price, int amount) {
        this.productSet.add(new Product(barCode, name, price, amount));
    }

    public Set<Product> getProductsByName() {
        return new TreeSet<>(productSet);
    }

    public Set<Product> getProductsByPrice() {
        Set<Product> productByPrice = new TreeSet<>(new ComparatorByPrice());
        productByPrice.addAll(productSet);
        return productByPrice;
    }

    public static void main(String[] args) {
        ProductRegistration p = new ProductRegistration();
        p.addProduct(1771, "AÇÚCAR CRISTAL PÉROLA 2KG",7.9,30);
        p.addProduct(14050, "IOGURTE NATURAL DANONE 170G",3.99,50);
        p.addProduct(772, "AÇÚCAR CRISTAL PÉROLA 2KG",7.9,30);
        p.addProduct(3124, "CAFÉ BRUMADO 250G",8,65);
        p.addProduct(3124, "CAFÉ MARCOLINO MOURA 250G",7.3,20);
        //System.out.println(p.getProductsByName());
        System.out.println(p.getProductsByPrice());
    }
}
