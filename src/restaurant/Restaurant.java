package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem chips = new MenuItem(1, "Potato Chips", "Snack");
        MenuItem iceCream = new MenuItem(5, "Ice Cream", "Dinner");

        Menu sweetAndSalty = new Menu();
        sweetAndSalty.addItem(chips);
        sweetAndSalty.addItem(iceCream);

        System.out.println(sweetAndSalty);
    }
}
