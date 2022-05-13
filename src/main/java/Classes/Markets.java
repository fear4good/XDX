/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.Classes;

/**
 *
 * @author Michalis
 */
public class Markets {
    private  static int id;
    private String BusinessName;
    
    
        public Markets(int Id,String businessName){
        id = Id;
        this.BusinessName = businessName;
     
        }

    public Markets(int prefer) {
         id = prefer;//To change body of generated methods, choose Tools | Templates.
    }
    
    public void setid(int Id){
        id = Id;
    }
        
    public  static  int getid(){
            return id;
        }
    
    
     public String getBusinessname(){
            return BusinessName;
        }
}
