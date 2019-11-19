package restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private Integer id;
    private String name;
    private double price ;
    private String description;
    private String category;
    private Date lastUpdateDate;

    public MenuItem(Integer id, String name,  String description, String category,double price, Date lastUpdateDate){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
