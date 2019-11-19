package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        Menu menu = new Menu ();

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(1, "Tomato Soup", "Soup made from Tomatoes", "Soups", 3.99, new Date());
        menuItems.add(menuItem1);

        MenuItem menuItem2 = new MenuItem(2, "Grilled Cheese Sandwich", "Hot sandwich made from real American cheese", "Sandwiches", 3.99, new Date());
        menuItems.add(menuItem2);

        menu.setMenuItems(menuItems);

        System.out.println(menu);
    }
}
