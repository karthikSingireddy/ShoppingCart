import java.util.ArrayList;

public class Catalog {
//    Constructor for ame
    public Catalog(String name) {
        this.name = name;
    }
//    fields for items arraylist and name
    private ArrayList<Item> items = new ArrayList<Item>();
    private String name;
//    adds item to arraylist
    public void add(Item item) {
        items.add(item);
    }
//    returns item from arraylist
    public Item get(int index) {
        return items.get(index);
    }
//    getters for name and size of arraylist
    public String getName() {
        return this.name;
    }
    public int size() {
        return items.size();
    }
}