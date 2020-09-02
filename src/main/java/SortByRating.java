import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByRating implements Sorting {
    Comparator ratingComparator = new ItemRatingComparator();
    @Override
    public void sorting(List<Item> list){
        Collections.sort(list, ratingComparator);
    }
}