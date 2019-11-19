package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuitems = new ArrayList<>();
    private Date lastUpdated;

    public Menu(){
        this.menuitems = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuitems() {
        return menuitems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuitems = menuItems;
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
                "menuitems=" + menuitems +
                ", lastUpdated=" + lastUpdated +
                '}';
    }


}
