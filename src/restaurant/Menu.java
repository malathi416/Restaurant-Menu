package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items ;
    private Date lastUpdated;

    public Menu(){
        this.items = new ArrayList<>();
        this.lastUpdated = new Date();
    }
    public void addItem(MenuItem aItem) {
        items.add(aItem);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
        this.lastUpdated = new Date();
    }
    public ArrayList<MenuItem> getMenuitems() {
        return items;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.items = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuitems=" + items +
                ", lastUpdated=" + lastUpdated +
                '}';
    }


}
