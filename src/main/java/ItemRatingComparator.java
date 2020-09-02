import java.util.Comparator;

public class ItemRatingComparator implements Comparator<Item> {
    public int compare(Item i1, Item i2){
        return i1.getRating() - i2.getRating();
    }
}
