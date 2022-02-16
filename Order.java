import java.util.ArrayList;

/**
 * Order
 */
public class Order {

    public String name;
    public Double total = 0.0;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();

    public void showVarsAndVals() {
        String str = "";
        System.out.printf("Nombre: %s\n", this.name);
        System.out.printf("Total: %s\n", this.total);
        System.out.printf("Listo: %s\n", this.ready);
        
        for (int i = 0; i < this.items.size(); i++) {
            str += this.items.get(i).name + ", ";
        }
        if (str.length() == 0) {
            str = "[]";
        } else {
            str = "[" + str.substring(0, str.length() - 2) + "]";            
        }
        System.out.printf("Items: %s\n", str);
    }

    public void addItem(Item item) {
        items.add(item);
    }
}