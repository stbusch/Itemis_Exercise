import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items=new ArrayList<Item>();
    private double totalTax = 0;
    private double totalSum = 0;


public void addItem(Item item)
{
  items.add(item);
}
public void calcTotals()
{
for (Item item:items){
    item.setGrossPrice();
    totalSum = totalSum+item.getGrossPrice();
    totalTax = totalTax+item.getTax();
}
}
public void printReceipt()
{
    for (Item item:items){
    System.out.println("1 "+item.getName()+": "+item.getGrossPrice());
}
    System.out.println("Sales Taxes: "+this.totalTax);
    System.out.println("Total: "+this.totalSum);
}}