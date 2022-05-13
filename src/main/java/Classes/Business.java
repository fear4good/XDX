package main.java.Classes;

import java.util.ArrayList;
import java.util.List;

public class Business {

    public static String SendEmail(String Email, String password, String Emailto, String Subject, String Text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String username;
    private String email;
    private String password;
    private List<Order> orderList;
    private List<Product> productList;
    private Double discountPer;
    private Double discount;
    private static int ID;
    
    public Business(String username, String email, String password, Double discountPer){
        this.username = username;
        this.email = email;
        this.password = password;
        this.discountPer = discountPer;
        
        this.orderList = new ArrayList<Order>();
        this.productList = new ArrayList<Product>();        
    }   
    
    public Boolean validateOrder(){
        
        return true;
    }
    public List<Order> getOrder(){
        
        return orderList;
    }
    
    public static void setID(int id){
        ID = id;
    }
    
    public static int getID(){
        return ID;
    }
    
    public String getEmail(){
        
        return email;
    }
    
    public String getPassword(){
        
        return password;
    }
}
