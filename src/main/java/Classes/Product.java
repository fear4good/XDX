
package Classes;


public class Product {
    private int id;
    private String productName;
    private int quantity;
    private double price;
    
    public Product(int id,String productName, int quantity, double price){
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        
        }

    public Product(String productName, int quantity, double price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price; 
        
    }
    
    
        public int getid(){
            return id;
        }
        
        public String getproductname(){
            return productName;
        }
        
        public int getquantity(){
            return quantity;
        }
        
        public double getprice()
        {
            return price;
        }
        
   

}
