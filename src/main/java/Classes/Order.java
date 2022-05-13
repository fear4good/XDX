package main.java.Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Integer productListID;
    private String customerName;
    private String itemListName;
    private String customerEmail;
    private List<Product> itemList;
    private int quantityPerItam;
    private Double cost;
    private Date OrderDate;
    private static int id;

  public  Order(int orderid){
      this.id = orderid;
      
     
  }

    public Order() {
        
    }

   
    public void setID(Integer product_id){
        productListID = product_id;
    }
    
    public void setProductName(String product_name){
        itemListName = product_name;
    }
    
    public void setQuantity(Integer quntity){
        quantityPerItam = quntity;
    }
    
    public void setPrice(Double product_cost){  
        cost = product_cost;
    }

    

   public static int Orderid(){
       // System.out.print(id);
       return id;}

}        
    
 

