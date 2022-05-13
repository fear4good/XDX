
package Classes;


public class Customer {
    private String name;
    private String surname;
    private static String email;
    private String password;
    private static String Member;
   

    public  Customer(String Email) {
      this.email = Email;
   
    }

    
    public static void setMember(String member){
        Member = member;
    }

    public static String getMember(){
        return Member;
    }
    
    public static String getEmail(){
          
          System.out.println(email);
          return email; }
    
    public String getPassword(){
        return password;
    }
    

    
}

    
