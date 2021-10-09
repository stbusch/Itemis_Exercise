import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    Cart cart = new Cart();
    Item item0 = new Item(1.6, "stuff", true);
    Item item1 = new Item (1.3, "different stuff", true);

    @Test
    void addItem() {
        cart.addItem(item0);
        cart.addItem(item1);
        assertEquals(item0,cart.getItems().get(0));
        assertEquals(item1,cart.getItems().get(1));
    }

    @Test
    void calcTotals() {
        cart.addItem(item0);
        cart.addItem(item1);
        cart.calcTotals();
        //item0 :
        // grossPrice 1.85
        // tax 0.25
        //item1:
        //grossPrice 1.5
        //tax 0.2

        assertEquals(3.35,cart.getTotalSum());
        assertEquals(0.45,cart.getTotalTax());

    }

    @Test
    void printReceipt() {
        cart.addItem(item0);
        cart.addItem(item1);
        cart.calcTotals();
        cart.printReceipt();
    }
}