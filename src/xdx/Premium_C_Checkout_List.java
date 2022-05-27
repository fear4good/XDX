package xdx;
import Classes.Customer;
import main.java.Classes.Order;
import Classes.Order_List;
import Classes.Product;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.jar.Attributes.Name;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.java.Classes.Markets;
import main.java.Classes.MyConnection;



public class Premium_C_Checkout_List extends javax.swing.JFrame {

    /**
     * Creates new form Premium_C_Checkout_List
     */
    public Premium_C_Checkout_List() {
      
        initComponents();
         show_products();
         String showtotal = Integer.toString((int) Order_List.totalcost());
         cost.setText(showtotal);
    }

    
    int orderid = Order.Orderid();
      public int Orderid=0;
      public ArrayList<Product> products(){
        String query = "Select * from orderdetail where orderid='" +orderid+ "'";
    ArrayList<Product> products = new ArrayList<>();
    try{
         PreparedStatement stm = MyConnection.getConnection().prepareStatement(query);
         ResultSet rs = stm.executeQuery();
          Product product; 
          int i = 0;
          while(rs.next()){
              i= i+1;
              Orderid = rs.getInt("orderid");
              product = new Product(i,rs.getString("Name"),rs.getInt("quantity"),rs.getInt("cost"));
              products.add(product);
                }
        }
         catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    return products;
}
    
    public void show_products(){
        ArrayList<Product> list = products();
        DefaultTableModel model = (DefaultTableModel)checkoutTable.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getid();
            row[1] = list.get(i).getproductname();
            row[2] = list.get(i).getquantity();
            row[3] = list.get(i).getprice();
            model.addRow(row);
        }
    }
     
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        log_out = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkoutTable = new javax.swing.JTable();
        Buy = new javax.swing.JButton();
        backToPremium = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        discount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Premium Checkout List");
        jLabel10.setToolTipText("");

        log_out.setBackground(new java.awt.Color(153, 204, 255));
        log_out.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        log_out.setText("Logout");
        log_out.setBorderPainted(false);
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(log_out))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        checkoutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Quantity", "Cost"
            }
        ));
        jScrollPane1.setViewportView(checkoutTable);

        Buy.setBackground(new java.awt.Color(204, 255, 204));
        Buy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buy.setText("Buy");
        Buy.setBorderPainted(false);
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        backToPremium.setBackground(new java.awt.Color(204, 255, 204));
        backToPremium.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backToPremium.setText("Back");
        backToPremium.setBorderPainted(false);
        backToPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToPremiumActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cost:");

        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Discount:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backToPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backToPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
        
    private void buy_now_premiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_now_premiActionPerformed
    }//GEN-LAST:event_buy_now_premiActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        xdx.Main_Class mc= new  xdx.Main_Class();
        mc.setVisible(true);
        mc.pack();
        mc.setLocationRelativeTo(null);
        mc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
         
         int Discount = Integer.parseInt(discount.getText());
         String Email =  Customer.getEmail();
         String name  = "";
         int temp = 0;
        System.out.println(Discount);
        String query = "Select username from customers where email=' "+Email+"'";
        String query2 = "Select points from Premiumpelates where customeremail='"+Email+"'";
        
        try{
         PreparedStatement ps,t;

            Statement  stm = MyConnection.getConnection().createStatement();
            ResultSet   rs = stm.executeQuery(query);
            while(rs.next()){
                name = rs.getString("username");   
                }
         
             stm = MyConnection.getConnection().createStatement();
              ResultSet  rs1 = stm.executeQuery(query2);
            while(rs1.next()){
                 temp = rs1.getInt("points");
                }
           
            System.out.println(temp);
            
             if(temp < Discount){
                  JOptionPane.showMessageDialog(null, "Not enough points");
             }else{
             
   
            java.sql.Date Date =new java.sql.Date(new java.util.Date().getTime());

             Order_List.totalpoints(Discount);
             double total = Order_List.CostafterDiscount(Discount);
             System.out.println(total);
             int id = Markets.getid();
             String query1 = "INSERT INTO orders (businessid,customeremail,customerName,cost,orderDate)Values(?,?,?,?,?)";
                 t = MyConnection.getConnection().prepareStatement(query1);
                 t.setInt(1,id);
                 t.setString(2,Email);
                 t.setString(3, name);
                 t.setDouble(4, total);
                 t.setDate(5, Date);

                 int count = t.executeUpdate();
                 if(count > 0){
                    JOptionPane.showMessageDialog(null, "order registered Successfully");
                    }
                 
                   String query4 = "Select Name,quantity from orderdetail where orderid='"+Orderid+"'";
           
                  
               
                
                String Name = null;
                int quantity = 0;
                int  quantity1 = 0;
                stm = MyConnection.getConnection().createStatement();
                ResultSet   rs3 = stm.executeQuery(query4);
                while(rs3.next()){
                    Name = rs3.getString("Name");
                    quantity = rs3.getInt("quantity");
                    System.out.println(Name);
                    System.out.println(quantity);
                    
                String query5 = "Select quantity from products where ProductName='"+Name+"'";    
                stm = MyConnection.getConnection().createStatement();
                ResultSet   rs4 = stm.executeQuery(query4);
                while(rs4.next()){
                  quantity1 = rs4.getInt("quantity");
                  System.out.println(quantity1);
               
                }
                    int sum = quantity1-quantity;
                    String query6 = "Update products set quantity=? where ProductName='"+Name+"' and market_id='"+id+"'";  
                   
                    t = MyConnection.getConnection().prepareStatement(query6);  
                    t.setInt(1, sum);
                    count = t.executeUpdate();
                    if(count > 0)
                    {
                       // JOptionPane.showMessageDialog(null, "Product values change Successfully");
                    }
                    MyConnection.getConnection().close(); 
                 
                 
                }
                
             }
            
                }catch (SQLException e){e.printStackTrace();}  
        
         
       
    }//GEN-LAST:event_BuyActionPerformed

    private void backToPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToPremiumActionPerformed
        Order_List.totalcost = 0;
        int id = Order.Orderid();
        String query = "DELETE FROM orderdetail  where orderid ='"+id+"'";
        
        try{
            PreparedStatement ps = MyConnection.getConnection().prepareStatement(query);
            ps.execute(query);
            MyConnection.getConnection().close(); 
            }catch (SQLException e){e.printStackTrace();}   
        
        xdx.Premium_Customer pc = new  xdx.Premium_Customer();
        pc.setVisible(true);
        pc.pack();
        pc.setLocationRelativeTo(null);
        pc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backToPremiumActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed

    }//GEN-LAST:event_costActionPerformed

    private void discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Premium_C_Checkout_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Premium_C_Checkout_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Premium_C_Checkout_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Premium_C_Checkout_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Premium_C_Checkout_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buy;
    private javax.swing.JButton backToPremium;
    private javax.swing.JTable checkoutTable;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField discount;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton log_out;
    // End of variables declaration//GEN-END:variables
}
