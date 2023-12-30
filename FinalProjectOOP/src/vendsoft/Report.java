package vendsoft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * the report class manages and processes sales and stock data to generate various reports.
 */
public class Report {

    // properties to store various report data
    public String bestProduct; // stores the best-selling product name
    public int maxSold; // stores the quantity of the best-selling product
    public String worstProduct; // stores the worst-selling product name
    public int minSold; // stores the quantity of the worst-selling product
    public String lowStockProductName; // stores the name of products with low stock
    public int lowStockProductQty; // stores the quantity of products with low stock
    public String dateReport; // stores the selected date for the sales report
    public double profit; // stores the daily profit
    public double totalProfit; // stores the total profit
    public double soldQuantity; // stores the quantity of sold products
    public int totalSales; // stores the total sales
    public double sales; // stores the daily sales
    public int totalSoldQty; // stores the total quantity of sold products
    public String weekDate; // stores the date range for weekly reports
    public int weeklySales; // stores the weekly sales
    public double weeklyProfit; // stores the weekly profit

    // method to set the week date
    public void setWeekDate(String value) {
        weekDate = value;
    }

    // method to set total sales
    public void setTotalSales(int value) {
        totalSales = value;
    }

    // method to set total sold quantity
    public void setTotalSoldQty(int value) {
        totalSoldQty = value;
    }

    // method to set daily sales
    public void setSales(double value) {
        sales = value;
    }

    // method to set daily profit
    public void setProfit(double value) {
        profit = value;
    }

    // method to set the best-selling product
    public void setBestProduct(String value) {
        bestProduct = value;
    }

    // method to set the quantity of the best-selling product
    public void setMaxSold(int value) {
        maxSold = value;
    }

    // method to set the worst-selling product
    public void setWorstProduct(String value) {
        worstProduct = value;
    }

    // method to set the quantity of the worst-selling product
    public void setMinSold(int value) {
        minSold = value;
    }

    // method to set the low stock product name
    public void setLowStockProductName(String value) {
        lowStockProductName = value;
    }

    // method to set weekly sales
    public void setWeeklySales(int value) {
        weeklySales = value;
    }

    // method to set weekly profit
    public void setWeeklyProfit(double value) {
        weeklyProfit = value;
    }

    // method to set total profit
    public void setTotalProfit(double value) {
        totalProfit = value;
    }

    // method to set the quantity of sold products
    public void setSoldQuantity(double value) {
        soldQuantity = value;
    }

    // method to get total sales
    public int getTotalSales() {
        return totalSales;
    }

    // method to get daily sales
    public double getSales() {
        return sales;
    }

    // method to get daily profit
    public double getProfit() {
        return profit;
    }

    // method to get the week date
    public String getWeekDate() {
        return weekDate;
    }

    // method to get total sold quantity
    public int getTotalSoldQty() {
        return totalSoldQty;
    }

    // method to get total profit
    public double getTotalProfit() {
        return totalProfit;
    }

    // method to get the best-selling product
    public String getBestProduct() {
        return bestProduct;
    }

    // method to get the worst-selling product
    public String getWorstProduct() {
        return worstProduct;
    }

    // method to get the quantity of the best-selling product
    public int getMaxSold() {
        return maxSold;
    }

    // method to get the quantity of the worst-selling product
    public int getMinSold() {
        return minSold;
    }

    // method to get the quantity of sold products
    public double getSoldQuantity() {
        return soldQuantity;
    }

    // method to get weekly profit
    public double getWeeklyProfit() {
        return weeklyProfit;
    }

    // method to get weekly sales
    public double getWeeklySales() {
        return weeklySales;
    }

    /**
     * analyzes sales data to determine the best and worst-selling items.
     */
    public void BestWorstItem() {
        // map to store product sales data
        Map<String, Integer> productSales = new HashMap<>();

        try (BufferedReader readfile = new BufferedReader(new FileReader("sale.txt"))) {
            String line;
            // read each line from the sale file
            while ((line = readfile.readLine()) != null) {
                String[] in = line.split("\t");
                String itemName = in[3];
                int qty = Integer.parseInt(in[4]);

                // update the product sales map
                productSales.put(itemName, productSales.getOrDefault(itemName, 0) + qty);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // sort the product sales map by quantity in descending order
        List<Map.Entry<String, Integer>> sortedProductSales = new ArrayList<>(productSales.entrySet());
        sortedProductSales.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("sales report (best to worst):");
        int rank = 1;
        // iterate over the sorted product sales and print the results
        for (Map.Entry<String, Integer> entry : sortedProductSales) {
            String itemName = entry.getKey();
            int qty = entry.getValue();
            rank++;
        }

        // set the best and worst-selling product and their quantities
        String bestSellingProduct = sortedProductSales.get(0).getKey();
        setBestProduct(bestSellingProduct);
        int maxSales = sortedProductSales.get(0).getValue();
        setMaxSold(maxSales);
        String worstSellingProduct = sortedProductSales.get(sortedProductSales.size() - 1).getKey();
        setWorstProduct(worstSellingProduct);
        int minSales = sortedProductSales.get(sortedProductSales.size() - 1).getValue();
        setMinSold(minSales);

        // print the best and worst-selling products and their quantities
        System.out.println(bestSellingProduct + " with " + maxSales + " units sold.");
        System.out.println(worstSellingProduct + " with " + minSales + " units sold.");
    }

    /**
     * identifies and prints products with low stock.
     */
    public static void LowStockProducts() {
        // map to store product stock data
        Map<String, Integer> productStocks = new HashMap<>();

        try (BufferedReader readStockFile = new BufferedReader(new FileReader("products.txt"))) {
            String stockLine;
            // read each line from the products file
            while ((stockLine = readStockFile.readLine()) != null) {
                String[] stockData = stockLine.split("\\s+");
                String stockItemName = stockData[1];
                int stockQty = Integer.parseInt(stockData[2]);

                // update the product stocks map
                productStocks.put(stockItemName, stockQty);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nproducts with low stocks:");
        // iterate over the product stocks map and print products with low stock
        for (Map.Entry<String, Integer> entry : productStocks.entrySet()) {
            String itemName = entry.getKey();
            int currentStock = entry.getValue();
            if (currentStock < 10) {
                System.out.println(itemName + " has low stock: " + currentStock + " units");
            }
        }
    }

    /**
     * analyzes sales data for a given date and sets relevant properties.
     * @param selectedDate the date for which the sales data is analyzed.
     */
    public void SalesData(String selectedDate) {
        String fileName = "sale.txt";

        LocalDate firstDate = null;
        LocalDate lastDate = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int dailySold = 0;
            double dailyProfit = 0.0;

            // read each line from the sale file
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 9) {
                    String dateStr = parts[0] + "/" + parts[1] + "/" + parts[2];
                    int quantity = Integer.parseInt(parts[4]);
                    double soldPrice = Double.parseDouble(parts[5]);
                    double boughtPrice = Double.parseDouble(parts[7]);
                    double originalStock = Double.parseDouble(parts[8]);

                    // parse the date and convert it to localdate
                    Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateStr);
                    LocalDate currentDate = LocalDate.of(date.getYear() + 1900, date.getMonth() + 1, date.getDate());

                    // update the first and last date based on the current date
                    if (firstDate == null || currentDate.isBefore(firstDate)) {
                        firstDate = currentDate;
                    }

                    if (lastDate == null || currentDate.isAfter(lastDate)) {
                        lastDate = currentDate;
                    }

                    String formattedDate = new SimpleDateFormat("MM/dd/yyyy").format(date);

                    // check if the current line's date matches the selected date
                    if (formattedDate.equals(selectedDate)) {
                        // calculate sales and profit for the selected date
                        double sales = quantity * soldPrice;
                        double profit = (soldPrice - boughtPrice) * (originalStock - quantity);

                        // set properties with the calculated values
                        setProfit(profit);
                        setSoldQuantity(quantity);

                        // update daily sold and daily profit
                        dailySold += quantity;
                        dailyProfit += profit;
                    }
                }
            }

            // set total sales and total profit
            setTotalSales((int) dailySold);
            setTotalProfit(dailyProfit);

            // set the week date range based on the first and last date
            if (firstDate != null && lastDate != null) {
                setWeekDate(firstDate + " To " + lastDate);
            } else {
                System.out.println("no valid dates found in the file.");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}