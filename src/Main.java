import list.OperacoesBasicas.Cart;
import list.OperacoesBasicas.Item;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.displayItems();
        //cart.addItemToCart("Coca-cola", 9.3, 2);
        cart.displayItems();
        cart.addItemToCart("Pizza", 35, 1);
        cart.displayItems();
        //cart.addItemToCart("Coca-cola", 9.3, 1);
        cart.displayItems();
        System.out.println("O valor total do carrinho é: " + cart.calculateTotalPrice());
        cart.displayItems();
        cart.removeItemToCart("Coca-cola");
        cart.displayItems();



    }
}