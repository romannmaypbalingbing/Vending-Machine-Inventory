package vendsoft;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;

public class BestWorstGraph_Interface extends javax.swing.JInternalFrame {
String result;
    public BestWorstGraph_Interface() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);

        File file = new File("sale.txt");

        
       
       try {
    Scanner scan = new Scanner(file);

    // Map to store unique dates
    Map<String, Boolean> uniqueDates = new HashMap<>();

    while (scan.hasNext()) {
        String line = scan.nextLine();
        String[] temp = line.split("\t");

        // Check if the concatenated date is unique
        String concatenatedDate = temp[0] + "/" + temp[1] + "/" + temp[2];
        if (!uniqueDates.containsKey(concatenatedDate)) {
            jComboBox1.addItem(concatenatedDate);
            uniqueDates.put(concatenatedDate, true);
        }
    }

} catch (FileNotFoundException ex) {
    Logger.getLogger(BestWorstGraph_Interface.class.getName()).log(Level.SEVERE, null, ex);
}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        displayBarChartButton = new javax.swing.JButton();
        panelChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(638, 378));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(68, 107, 138));
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 1, 139, -1));

        displayBarChartButton.setText("Display Bar Chart");
        displayBarChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBarChartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(displayBarChartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 0, -1, -1));

        panelChart.setBackground(new java.awt.Color(153, 153, 255));
        panelChart.setNextFocusableComponent(panelChart);
        panelChart.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 33, 410, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //GEN-FIRST:event_displayBarChartButtonActionPerformed
    private void displayBarChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBarChartButtonActionPerformed
        //instantiations
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        File file = new File("sale.txt");

        try {
            Scanner scan = new Scanner(file);

            // Get the selected date from the JComboBox
            String selectedDate = (String) jComboBox1.getSelectedItem();

            // Map to store cumulative unit sold for each product on the selected date
            Map<String, Integer> cumulativeUnitSold = new HashMap<>();

            while (scan.hasNext()) {
                String line = scan.nextLine();
                String[] temp = line.split("\t");

                // Assuming temp[0], temp[1], and temp[2] represent day, month, and year respectively
                String currentDate = temp[0] + "/" + temp[1] + "/" + temp[2];

                // Check if the date matches the selected date
                if (selectedDate.equals(currentDate)) {
                    // Assuming temp[3] contains the product name and temp[4] contains the quantity
                    String name = temp[3];
                    int qty = Integer.parseInt(temp[4]);

                    // Update or initialize the cumulative unit sold for the product
                    if (cumulativeUnitSold.containsKey(name)) {
                        cumulativeUnitSold.put(name, cumulativeUnitSold.get(name) + qty);
                    } else {
                        cumulativeUnitSold.put(name, qty);
                    }
                }
            }

            // Add data to the dataset
            for (Map.Entry<String, Integer> entry : cumulativeUnitSold.entrySet()) {
                barChartData.addValue(entry.getValue(), "Unit Sold", entry.getKey());
            }

            // Create the bar chart
            JFreeChart barChart = ChartFactory.createBarChart(
                "Products Distribution",
                "Product",
                "Unit Sold",
                barChartData,
                PlotOrientation.HORIZONTAL,
                false,
                true,
                false
            );

            // Customize appearance if needed
            CategoryPlot barchrt = barChart.getCategoryPlot();
            barchrt.setRangeGridlinePaint(Color.BLUE);

            // Create a panel for the chart
            ChartPanel barPanel = new ChartPanel(barChart);
            
             // Customize appearance if needed
            panelChart.removeAll();
            panelChart.add(barPanel, BorderLayout.CENTER);
            panelChart.validate();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BestWorstGraph_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }//GEN-LAST:event_displayBarChartButtonActionPerformed

    }//GEN-LAST:event_displayBarChartButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BestWorstGraph_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayBarChartButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelChart;
    // End of variables declaration//GEN-END:variables
}
