package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> itemsCart;

    public Cart() {
        this.itemsCart = new ArrayList<>();
    }
    public void addItemToCart(String name, double price, int amount) {
        Item item = new Item(name, price, amount);
        this.itemsCart.add(item);
    }
    public void removeItemToCart(String name){
        List<Item> itensForRemove = new ArrayList<>();
        if (!itemsCart.isEmpty()) {
            for (Item item : itemsCart) {
                if (item.getName().equalsIgnoreCase(name)) {
                    itensForRemove.add(item);
                }
            }
            itemsCart.removeAll(itensForRemove);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calculateTotalPrice() {
        double totalPrice = 0d;
        for (Item item: itemsCart) {
            totalPrice += item.getPrice() * item.getAmount();
        }
        return totalPrice;

    }
    public void displayItems() {
        System.out.println(this.itemsCart);
    }


}
