
package vendsoft;


public class ProgramInfo_Frame extends javax.swing.JFrame {

    public ProgramInfo_Frame() {
        initComponents();
        displayEssay();
    }
    //method that will display in the jTextArea
    private void displayEssay() {
        String essayContent = """
                   
                            ===PROGRAM INFORMATION===

                -----------VENDSOFT INVENTORY SOFTWARE-----------   

                   The VendSoft Inventory Software is to provide 
                   an efficient  and  user-friendly solution for 
                   managing and  monitoring  the  inventory of a 
                   vending  machine. This software is focused on 
                   simplifying the management  of  product data, 
                   sales  transactions  and   report generation. 
                   With functions such  as  product information 
                   search, addition,  deletion,  updating,  and 
                   display,  along  with  a comprehensive sales 
                   and  reporting  system,  VendSoft  aims   to 
                   improve the overall administration of vending
                   machine inventory.

                    *******************GOALS********************

                       • Efficient Inventory Management
                         •   Accurate Sales Transaction
                         •   Comprehensive Reporting 
                          •       Profit Analysis

                    VendSoft aims to revolutionize vending machine
                    inventory  management  by  addressing   manual 
                    inefficiencies,  ensuring  accuracy  in  sales 
                    transactions, and providing insightful reports
                        to empower decision-makers to optimize 
                            inventory and maximize profits.         


                   *******************Features********************

                                Product Information

                    • Search: Enter the product name to view 
                                  its information
                    • Add: Allows you to add the desired item
                    • Delete: Enables removal of specified items
                    • Update: Modify information such as price, 
                                  stock quantity, etc.
                    • Display: View the list of available items

                     *******************SALES********************
                              
                       • You can choose the product you wish to
                         purchase  and  accurately  input  the 
                         required amount of coins.

                    *******************REPORTS********************
                              
                       • View the units of products sold   by 
                         date and visualize it using   graphs.
                              
                       • Check the remaining stock for drinks
                         and snacks using graphs.
                              
                       • Showcasing the best and worst selling
                         products.
                              
                       • Examine the daily profit by selecting 
                         the desired date to  view  the  units 
                           sold and the profit.
                              
                       • Review  the  total  profit  based  on 
                         specific  dates, along with the units
                         sold and  the total profit.
                             
                       • Displaying available stock.
                    *********************************************
            """;

        jTextArea1.setText(essayContent);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(10);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.setBackground(new java.awt.Color(57, 94, 125));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(backButton)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        setVisible(false);

        new Home_Frame().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

  
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramInfo_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
