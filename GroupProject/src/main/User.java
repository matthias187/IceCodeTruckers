package main;

import java.util.ArrayList;

public class User {

    private int userID;
    private String firstName;
    private String lastName;
    private String userName;
    private ArrayList<Order> orders;
    private Address address;
    private String password;
    private PaymentMethod paymentMethod;
    private String email;
    private boolean isAdmin;

    public User(){}

    public User(int userID, String firstName, String lastName, String userName, String password, String email, boolean isAdmin){
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirsName() {
        return firstName;
    }

    public String getLastName() { return lastName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    private void placeOrder(Order orderToPlace){
        // Do stuff
    }
    public String getPassword() {
        return password;
    }
}
