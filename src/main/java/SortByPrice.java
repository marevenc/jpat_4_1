import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPrice implements Sorting {
    Comparator priceComparator = new ItemPriceComparator();
    @Override
    public void sorting(List<Item> list){
        Collections.sort(list, priceComparator);
    }
}
