public class ItemOrder {
//    constructor for an item and quantity
    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
//    fields for item and quantity
    private Item item;
    private int quantity;
//    getters for price through items priceFor() method
    public double getPrice() {
        return item.priceFor(quantity);
    }
//    returns Item
    public Item getItem() {
        return item;
    }
}
