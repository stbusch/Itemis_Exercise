import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item item = new Item(1, "someName", true);

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(1, item.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getCategory() {

        assertEquals("someName",item.getName());
    }

    @org.junit.jupiter.api.Test
    void isImported() {
        assertTrue(item.isImported());
    }
}