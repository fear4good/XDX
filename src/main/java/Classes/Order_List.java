package Classes;

import java.util.List;
import java.util.ArrayList;

public class Order_List {
    private List<Product> itemList;
    private Boolean listValidation;
    public static double totalcost;
    public static int points;
    
    
    public void  Order_List(double Totalcost){
       
        totalcost = totalcost+ Totalcost;
    }
    

    public static double productcost(double price,int quantity){
        double cost=0;
        
        cost= quantity*price;
        
        return cost;
    
    }
    
     public static double totalcost(){return totalcost; }
    
     
     public void points(int Points){
         this.points =this.points +Points;
     }
     
     public static void totalpoints(int Points){
         points =  points - Points;
     }
     
     public static double CostafterDiscount(int Points){
        double CostafterDiscount = totalcost - Points/100;
        totalcost =0;
        return CostafterDiscount;
        
     }
}
