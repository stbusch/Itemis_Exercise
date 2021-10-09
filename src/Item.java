public class Item {
    private double netPrice = 0;
    private double grossPrice = 0;
    private double tax = 0;
    /*  private enum Category
      {
          book, musicCD,chocolateBar, boxOfChocolates,
          bottleOfPerfume, packetOfHeadachePills

      private Category category;*/
    private String name;
    private boolean imported;

    public Item(double npr, String name, boolean imp) {
        this.netPrice = npr;
        this.name = name;
        this.imported = imp;
    }

    //getter
    public double getNetPrice() {
        return this.netPrice;
    }

    public double getGrossPrice() {
        return this.grossPrice;
    }

    public double getTax() {
        return this.tax;
    }

    public String getName() {
        return this.name;

    }

    public boolean isImported() {
        return this.imported;
    }

    //calculates item's sales tax
    public void calcTax() {
        double basicTax = 0;
        double importTax = 0;
        if (!((this.getName().equals("book")) |
                (this.getName().contains("chocolate")) |
                (this.getName().contains("pills"))
        )) {
            basicTax = this.netPrice * 0.1;
        }
        if (this.isImported()) {
            importTax = this.netPrice * 0.05;
        }
        tax = roundTax(basicTax + importTax);

    }

    //implements the desired rounding to nearest 0.05
//(taken from https://stackoverflow.com/questions/9256005/java-rounding-to-nearest-0-05)
    private double roundTax(double unrounded) {
        double rounded = Math.ceil(unrounded * 20.0) / 20.0;
        return rounded;
    }

    public void setGrossPrice() {
        calcTax();
        grossPrice = netPrice + tax;
    }
}