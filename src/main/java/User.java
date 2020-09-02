import java.util.*;

public class User {
    String name;
    int id;
    int orderNumber;
    List<Item> cart = new ArrayList<>();

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addToCart(Item i){
        cart.add(i);
    }
    public void printCart(){
        for(Item i : cart){
            System.out.println(i);
        }
    }
    public int sumCost(){
        int cost = 0;
        for(Item i : cart){
            cost += i.getPrice();
        }
        return cost;
    }
}
