package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("사이다", 1500, 2);
        Item item2 = new Item("콜라", 1400, 6);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
