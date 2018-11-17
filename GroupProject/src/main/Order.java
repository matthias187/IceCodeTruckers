package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Order {
    private User orderingUser;
    private Date dateOrdered;
    private String status;
    private ArrayList<HashMap<InventoryItem, Integer> > itemsOrdered;

    public Order(){}

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<HashMap<InventoryItem, Integer>> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(ArrayList<HashMap<InventoryItem, Integer>> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }
}
