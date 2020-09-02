public class Toy extends Item {
    int suitableAge;
    public Toy(String name, int price, int rating, int suitableAge){
        super(name, price, rating);
        this.suitableAge = suitableAge;
    }
}
