public class Main {
    public static void main(String[] args) {
        Cart cart1 = new Cart();
        Item item0 = new Item(12.49, "book", false);
        Item item1 = new Item(14.99, "music CD", false);
        Item item2 = new Item(0.85, "chocolate bar", false);
        cart1.addItem(item0);
        cart1.addItem(item1);
        cart1.addItem(item2);
        cart1.calcTotals();
        System.out.println("Output 1:");
        cart1.printReceipt();
        System.out.println();
        Cart cart2 = new Cart();
        Item item3 = new Item(10.00, "imported box of chocolates", true);
        Item item4 = new Item(47.50, "imported bottle of perfume", true);
        cart2.addItem(item3);
        cart2.addItem(item4);
        cart2.calcTotals();
        System.out.println("Output 2:");
        cart2.printReceipt();
        System.out.println();
        Cart cart3 = new Cart();
        Item item5 = new Item(27.99, "imported bottle of perfume", true);
        Item item6 = new Item(18.99, "bottle of perfume", false);
        Item item7 = new Item(9.75, "packet of headache pills", false);
        Item item8 = new Item(11.25, "box of imported chocolates", true);
        cart3.addItem(item5);
        cart3.addItem(item6);
        cart3.addItem(item7);
        cart3.addItem(item8);
        cart3.calcTotals();
        System.out.println("Output 3:");
        cart3.printReceipt();
    }
}

