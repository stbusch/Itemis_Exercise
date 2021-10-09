import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Cart {
    private ArrayList<Item> items = new ArrayList<Item>();
    private double totalTax = 0;
    private double totalSum = 0;


    public void addItem(Item item) {
        items.add(item);
    }

    public void calcTotals() {
        for (Item item : items) {
            item.setGrossPrice();
            totalSum = totalSum + item.getGrossPrice();
            totalTax = totalTax + item.getTax();
        }


    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotalSum() {
        return this.totalSum;
    }

    public double getTotalTax() {
        return this.totalTax;
    }

    public void printReceipt() {
        for (Item item : items) {
            System.out.println("1 " + item.getName() + ": "+String.format(Locale.ENGLISH,"%.2f", item.getGrossPrice()));
        }
        System.out.println("Sales Taxes: " +String.format(Locale.ENGLISH,"%.2f", this.totalTax));
        System.out.println("Total: " +String.format(Locale.ENGLISH,"%.2f", this.totalSum));

    }

    //fo
}