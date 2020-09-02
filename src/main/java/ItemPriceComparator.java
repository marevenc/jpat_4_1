import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
    public int compare(Item i1, Item i2){
        return i1.getPrice() - i2.getPrice();
    }
}
