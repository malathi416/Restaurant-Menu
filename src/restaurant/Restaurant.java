package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem chips = new MenuItem(1, "Potato Chips", "Snack");
        MenuItem iceCream = new MenuItem(5, "Ice Cream", "Dinner");
        MenuItem drinks = new MenuItem(3,"sprite","Dessert");
        Menu menu = new Menu();
        menu.addItem(chips);
        menu.addItem(iceCream);
        menu.addItem(drinks);

        for(MenuItem items: menu.getMenuitems()){
            System.out.println("Category: "+items.getCategory() + "; Description: "+items.getDescription() +"; Price: "+items
            .getPrice()+ "; LastUpdated: "+menu.getLastUpdated());
        }
//        System.out.println(menu);
    }
}
