
package Classes;


public class Offers {

 
    private String itemListName;
    private double discount;
    private Double Cost;
    public Offers(String itemListName, double discount,Double cost){
        this.itemListName = itemListName;
        this.discount = discount;
        this.Cost = cost;
    }
    

      public static double  NewCost(double discount,double cost){
        double newCost = 0; 
        newCost = cost - (cost*(discount/100));
        return newCost;  

    

    }

}

