import java.util.Comparator;

public class ItemNameComparator implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2){
        return i1.getName().compareTo(i2.getName());
    }
}
