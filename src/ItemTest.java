import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item item1 = new Item(1, "someName", true);
    Item item2 = new Item(1, "chocolate", false);
    Item item3 = new Item(1, "chocolate", true);
    Item item4 = new Item(1.3, "someName", true);

    @org.junit.jupiter.api.Test
    void getNetPrice() {
        assertEquals(1, item1.getNetPrice());

    }

    @org.junit.jupiter.api.Test
    void getGrossPrice() {
        item1.setGrossPrice();
        assertEquals(1.15, item1.getGrossPrice());
        item2.setGrossPrice();
        assertEquals(1, item2.getGrossPrice());
        item3.setGrossPrice();
        assertEquals(1.05, item3.getGrossPrice());
        item4.setGrossPrice();
        assertEquals(1.5, item4.getGrossPrice());
    }

    @org.junit.jupiter.api.Test
    void getName() {

        assertEquals("someName", item1.getName());
    }

    @org.junit.jupiter.api.Test
    void isImported() {
        assertTrue(item1.isImported());
    }

}