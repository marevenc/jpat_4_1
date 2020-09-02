import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Item>> goods = new HashMap<>();
        List<Item> foods = new ArrayList<>();
        foods.add(new Food("рис", 80, 4, false));
        foods.add(new Food("карри", 120, 3, true));
        List<Item> toys = new ArrayList<>();
        toys.add(new Toy("Барби", 3000, 2, 12));
        toys.add(new Toy("Лего", 5000, 5, 8));

        goods.put("продукты", foods);
        goods.put("игрушки", toys);

        User user = new User("Петр", 123);

        while(true){
            System.out.println("Список доступных категорий товара:");
            printCategory(goods);

            System.out.println("Введите наименование катергории");
            Scanner scanner = new Scanner(System.in);
            String categoryStr = scanner.nextLine();

            if (!goods.keySet().contains(categoryStr)){
                System.out.println("Данная категория отсутствует");
            } else{
                System.out.println("Список товаров, доступных к покупке: ");
                printGoods(goods, categoryStr);
            }

            System.out.println("Если хотите отфильтровать товары, введите 1, если нет, то нажмите enter");
            String needToFilter = scanner.nextLine();
            if(needToFilter.equals("1")){
                System.out.println("Введите номер фильтра");
                System.out.println("1 - фильтр по наименованию");
                System.out.println("2 - фильтр по цене");
                System.out.println("3 - фильтр по рейтингу");
                String filterNumber = scanner.nextLine();
                switch (filterNumber){
                    case "1": SortByName byName = new SortByName();
                        byName.sorting(goods.get(categoryStr));
                        printGoods(goods, categoryStr);
                        break;
                    case "2": SortByPrice byPrice = new SortByPrice();
                        byPrice.sorting(goods.get(categoryStr));
                        printGoods(goods, categoryStr);
                        break;
                    case "3": SortByRating byRating = new SortByRating();
                        byRating.sorting(goods.get(categoryStr));
                        printGoods(goods, categoryStr);
                }
            }

            System.out.println("Для добавления товара в корзину введите его наименование");
            String good = scanner.nextLine();

            user.addToCart(findGood(goods, categoryStr, good));

            System.out.println("Хотите закончить выбор товаров? Введите да/нет");
            String cont = scanner.nextLine();
            if(cont.equals("да")){
                break;
            }
        }


        System.out.println("Ваша корзина:");
        user.printCart();
        System.out.println("Общая стоимость: " + user.sumCost());
    }

    public static void printCategory(Map<String, List<Item>> goods){
        int i = 0;
        for(String s : goods.keySet()){
            i++;
            System.out.println(i + " " + s);
        }
    }

    public static void printGoods(Map<String, List<Item>> goods, String category) {
        int number = 0;
        for (Item i : goods.get(category)) {
            number++;
            System.out.println(number + " " + i);
        }
    }

    public static Item findGood(Map<String, List<Item>> goods, String category, String good){
        Item item = null;
        for (Item i : goods.get(category)){
            if(i.getName().equals(good)) return i;
        }
        return item;
    }
}
