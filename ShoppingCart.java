/*
Karthik Singireddy
Period 5 APCS
Shopping cart program, Chapter 10 Project
 */

import java.util.ArrayList;

public class ShoppingCart {
//    constructor that initializes ItemOrder ArrayList
    public ShoppingCart() {
        items = new ArrayList<ItemOrder>();
    }
//    field ArrayList
    private ArrayList<ItemOrder> items;
//    boolean for discount
    private boolean discount;
//    sets discount variable to apply discount
    public void setDiscount(boolean value) {
        this.discount = value;
    }
//    purpose of method it to add an itemorder to the arraylist, but keep no duplicates
//    for loop iterates through the arraylist, and if an item is a duplicate it removes the item
//    at the end it adds the new ItemOrder to the ArrayList
    public void add(ItemOrder io) {
        for(int i = 0; i < items.size(); i++) {
                if(items.get(i).getItem().equals(io.getItem())){
                items.remove(i);
            }
        }
        items.add(io);
    }
//    returns total of the cart
    public double getTotal() {
//        iterates through arraylist to find the total price of all items
        double total = 0;
        for(ItemOrder io : items) {
            total+=io.getPrice();
        }
//        applies discount if needed
        if(discount) total *= 0.9;
        return total;
    }
}