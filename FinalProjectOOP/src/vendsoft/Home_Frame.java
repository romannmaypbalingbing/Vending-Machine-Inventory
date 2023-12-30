
package vendsoft;

public class Home_Frame extends javax.swing.JFrame {

 
    public Home_Frame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vendsoftIcon = new javax.swing.JLabel();
        productPanel01 = new javax.swing.JPanel();
        productInfoLabel = new javax.swing.JLabel();
        salesPanel = new javax.swing.JPanel();
        salesLabel = new javax.swing.JLabel();
        reportPanel = new javax.swing.JPanel();
        reportLabel = new javax.swing.JLabel();
        progInfoPanel = new javax.swing.JPanel();
        programInfoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        vendsoftIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vendsoft.png"))); // NOI18N

        productPanel01.setBackground(new java.awt.Color(68, 107, 138));
        productPanel01.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        productPanel01.setName("Products"); // NOI18N

        productInfoLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        productInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
        productInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productInfoLabel.setText("Product Information");
        productInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productInfoLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout productPanel01Layout = new javax.swing.GroupLayout(productPanel01);
        productPanel01.setLayout(productPanel01Layout);
        productPanel01Layout.setHorizontalGroup(
            productPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productPanel01Layout.setVerticalGroup(
            productPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        salesPanel.setBackground(new java.awt.Color(68, 107, 138));
        salesPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        salesLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        salesLabel.setForeground(new java.awt.Color(255, 255, 255));
        salesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salesLabel.setText("Sales");
        salesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout salesPanelLayout = new javax.swing.GroupLayout(salesPanel);
        salesPanel.setLayout(salesPanelLayout);
        salesPanelLayout.setHorizontalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );
        salesPanelLayout.setVerticalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        reportPanel.setBackground(new java.awt.Color(68, 107, 138));
        reportPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        reportLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        reportLabel.setForeground(new java.awt.Color(255, 255, 255));
        reportLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportLabel.setText("Report");
        reportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        progInfoPanel.setBackground(new java.awt.Color(68, 107, 138));
        progInfoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        programInfoLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        programInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
        programInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        programInfoLabel.setText("Program Info");
        programInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programInfoLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout progInfoPanelLayout = new javax.swing.GroupLayout(progInfoPanel);
        progInfoPanel.setLayout(progInfoPanelLayout);
        progInfoPanelLayout.setHorizontalGroup(
            progInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(programInfoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        progInfoPanelLayout.setVerticalGroup(
            progInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(programInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productPanel01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vendsoftIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(vendsoftIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productPanel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
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

    private void productInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productInfoLabelMouseClicked
        
       setVisible(false);
       Productinfo_frame prfr = new  Productinfo_frame();
        prfr.setVisible(true);
        
    }//GEN-LAST:event_productInfoLabelMouseClicked

    private void salesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesLabelMouseClicked
        
        setVisible(false);
        Sales_Frame salesfr = new Sales_Frame();
        salesfr.setVisible(true);
        
    }//GEN-LAST:event_salesLabelMouseClicked

    private void reportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseClicked
        
        setVisible(false);
        Report_Frame reportfr = new Report_Frame();
        reportfr.setVisible(true);
       
    }//GEN-LAST:event_reportLabelMouseClicked

    private void programInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programInfoLabelMouseClicked
        setVisible(false);
        ProgramInfo_Frame progfr = new ProgramInfo_Frame();
        progfr.setVisible(true);
       
    }//GEN-LAST:event_programInfoLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Home_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel productInfoLabel;
    private javax.swing.JPanel productPanel01;
    private javax.swing.JPanel progInfoPanel;
    private javax.swing.JLabel programInfoLabel;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JLabel salesLabel;
    private javax.swing.JPanel salesPanel;
    private javax.swing.JLabel vendsoftIcon;
    // End of variables declaration//GEN-END:variables
}
