import java.text.NumberFormat;

public class Item {
//    declaration of fields
    private String name;
    private double price;
    private double bulk;
    private double bulkPrice;
    private boolean hasBulk;
//    constructor for no bulk products
    public Item(String name, double price) {
        if(price < 0) throw new IllegalArgumentException();
        this.name = name;
        this.price = price;
        this.hasBulk = false;
    }
//    constructor for bulk products, initializes builk variables after the first constructor finishes.
    public Item(String name, double price, double bulk, double bulkPrice) {
        this(name, price);
        hasBulk = true;
        this.bulk = bulk;
        this.bulkPrice = bulkPrice;
        if(bulk < 0 || bulkPrice < 0) throw new IllegalArgumentException();
    }
//    returns the regular price * quantity if the quantity is less than the required bulk
//    or if there is no bulk pricing
//    else finds how much bulk can be applies, and returns the corresponding cost
    public double priceFor(int quantity) {
        if(quantity < 0) throw new IllegalArgumentException();
        if(!hasBulk || quantity < bulk) return price*quantity;
        int amountInBulk = (int) (quantity/bulk);
        double total = amountInBulk * bulkPrice;
        total += (quantity%bulk) * price;
        return total;
    }
//    toString() method that returns name & price if there is no bulk pricing,
//    but adds bulk pricing if bulk pricing is available
    @Override
    public String toString() {
        String out = name + ", " + price;
        if(!hasBulk) return out;
        out+= " (" + NumberFormat.getCurrencyInstance().format(bulkPrice) + " for " + (int)bulk + ")";
        return out;
    }
}
