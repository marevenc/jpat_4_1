import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements Sorting {
    Comparator nameComparator = new ItemNameComparator();
    @Override
    public void sorting(List<Item> list){
        Collections.sort(list, nameComparator);
    }
}
