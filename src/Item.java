public class Item {
    private float price;
  /*  private enum Category
    {
        book, musicCD,chocolateBar, boxOfChocolates,
        bottleOfPerfume, packetOfHeadachePills

    private Category category;*/
    private String name;
    private boolean imported;

    public Item (float pr, String name, boolean imp)
    {
        this.price = pr;
        this.name= name;
        this.imported = imp;
    }

//setter
public float getPrice()
 {
     return this.price;
 }
 public String getName()
 {
     return this.name;

 }

 public boolean isImported()
 {
 return this.imported;
 }

}
