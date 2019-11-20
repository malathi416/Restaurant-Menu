package restaurant;

import java.util.Objects;

public class MenuItem {
    private double price ;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price,String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }


    public double getPrice(){
        return price;
    }
    public void setPrice(double aPrice){
        this.price = aPrice;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String aDescription){
        this.description=aDescription;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category);
    }
}
