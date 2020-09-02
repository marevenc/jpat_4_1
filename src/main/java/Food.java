public class Food extends Item {
    boolean spicy;
    public Food(String name, int price, int rating, boolean spicy){
        super(name, price, rating);
        this.spicy = spicy;
    }
}
