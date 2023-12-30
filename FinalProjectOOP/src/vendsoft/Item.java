package vendsoft; // Package declaration

import java.io.File; // Import statements for file handling
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.io.*;
import java.time.LocalDate;

// Class representing an item
public class Item {
    // Attributes of the item
    public String name; //name of products
    public String qtyStock; // number of stocks
    public String boughtPrice; // supplier price
    public String soldPrice; // marketPrice
    public String itemCode; // product Code
    public String itemType; // product type
    public String searchName; // search item for delete and update method
    public int originalStock; // to store in the file
    public LinkedList<Item> items = new LinkedList<Item>(); // Linked list to store items

      // Setter methods for item attributes
    public void setSearchName(String value) {
        searchName = value;
    }
  
    public void setItemName(String value) {
        name = value;
    }

    public void setItemqtyStock(String value) {
        qtyStock = value;
    }

    public void setBoughtPrice(String value) {
        boughtPrice = value;
    }

    public void setSoldPrice(String value) {
        soldPrice = value;
    }

    public void setItemCode(String value) {
        itemCode = value;
    }

    public void setItemType(String value) {
        itemType = value;
    }

    public void setOriginalStock(int value) {
        originalStock = value;
    }

    // Getter methods for item attributes
    public int getOriginalStock() {
        return originalStock;
    }

    public String getSearchName() {
        return searchName;
    }

    public String getName() {
        return name;
    }

    public String getQtyStock() {
        return qtyStock;
    }

    public String getBoughtPrice() {
        return boughtPrice;
    }

    public String getSoldPrice() {
        return soldPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemType() {
        return itemType;
    }

    // Method to add an item to the file and linked list
    public void AddItem(String type, String name, String qtyStock, String boughtPrice, String soldPrice) {
        try {
            // Check if the item already exists in the file
            File file = new File("products.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                String line = scan.nextLine();
                String[] arr = line.split(" ");
                if (arr[1].equals(name)) {
                    System.out.println("Item Already Exists");
                    return;
                }
            }

            Item newItem = new Item(); // Create a new item

            // Set item attributes
            newItem.setItemType(type); 
            newItem.setItemName(name);
            newItem.setItemqtyStock(qtyStock);
            newItem.setBoughtPrice(boughtPrice);
            newItem.setSoldPrice(soldPrice);
            newItem.setOriginalStock(Integer.parseInt(qtyStock));
            items.add(newItem); // Add the item to the linked list

            try {
                // Write the item to the file
                PrintWriter writer = new PrintWriter(new FileWriter("products.txt", true));
                writer.println(type + " " + name + " " + qtyStock + " " + boughtPrice + " " + soldPrice + " " + qtyStock);
                writer.close();
                JOptionPane.showMessageDialog(null, "Succesfully Added!", " Ok!  ", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "An Error Occur!", "Oops!", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File Not Found!", "Oops!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    // Method to update an item in the file
    public void UpdateItem(String name, String newQtyStock, String newBoughtPrice, String newSoldPrice) {
        try {
            LinkedList<String> itemList = new LinkedList<>();

            File file = new File("products.txt");
            Scanner scan = new Scanner(file);
            boolean found = false;

            // Populate the linked list and search for the item
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] temp = line.split("\\s+");

                if (getSearchName().equalsIgnoreCase(temp[1])) {
                    found = true;
                    line = temp[0] + " " + name + " " + newQtyStock + " " + newBoughtPrice + " " + newSoldPrice;
                }

                itemList.add(line);
            }
            scan.close();

            if (!found) {
                // Item is not in the list
                JOptionPane.showMessageDialog(null, "Item Not Found!", "Oops!", JOptionPane.ERROR_MESSAGE);
            } else {
                // Update the file with the modified linked list
                PrintWriter wrfile = new PrintWriter(new FileWriter("products.txt"));
                for (String item : itemList) {
                    wrfile.println(item);
                }
                wrfile.close();

                // Item successfully updated
                JOptionPane.showMessageDialog(null, "Succesfully Updated!", " Ok!", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    // Method to delete an item from the file by name
    public void DeleteItem() {
        try {
            LinkedList<String> itemList = new LinkedList<>();
            File file = new File("products.txt");
            Scanner scan = new Scanner(file);

            boolean found = false;

            // Populate the linked list and search for the item
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] temp = line.split("\\s+");

                if (getSearchName().equalsIgnoreCase(temp[1])) {
                    found = true;
                } else {
                    itemList.add(line);
                }
            }
            scan.close();

            if (!found) {
                // Item is not in the list
                JOptionPane.showMessageDialog(null, "Item Already NOt on the List!", "Oops!", JOptionPane.ERROR_MESSAGE);
            } else {
                // Update the file with the modified linked list
                PrintWriter wrfile = new PrintWriter(new FileWriter("products.txt"));
                for (String item : itemList) {
                    wrfile.println(item);
                }
                wrfile.close();

                // Item successfully deleted
                JOptionPane.showMessageDialog(null, "Succesfully Deleted!", " Ok!  ", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    // Method to sell an item
    public void SellItem(String name, int qty) {
        try {
            //intialize variable 
            int qty_prv = 0;
            String[] itemline = new String[100];
            String str;
            double price = 0.0, total = 0.0;
            int qty_new = 0;
            boolean found = false, edited = false;
            
            // getting the data in the file
            BufferedReader rdfile = new BufferedReader(new FileReader("products.txt"));
            
            //reading the data in the file
            for (int x = 0; (str = rdfile.readLine()) != null; x++) {
                itemline[x] = str;
            }
            rdfile.close();
            // getting the dates to day
            LocalDate dateToday = LocalDate.now();
            int yearToday = dateToday.getYear();
            int monthToday = dateToday.getMonthValue();
            int dayToday = dateToday.getDayOfMonth();
            
            //iterating through the data in the file
            for (int i = 0; itemline[i] != null; i++) {
                String[] arr = itemline[i].split(" ");
                //condition if the there's an item exist 
                if (name.equalsIgnoreCase(arr[1])) {
                    found = true;
                    qty_prv = Integer.parseInt(arr[2]);
                    price = Double.parseDouble(arr[4]);

                    if ((qty > qty_prv) && (qty_prv != 0)) {
                        JOptionPane.showMessageDialog(null, "Item Shortage!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                    if (qty_prv == 0) {
                        JOptionPane.showMessageDialog(null, "Out of Stock!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                    if ((qty <= qty_prv) && (qty_prv != 0)) {
                        // preparing the item to store in the file
                        qty_new = qty_prv - qty;
                        itemline[i] = arr[0] + " " + arr[1] + " " + qty_new + " " + arr[3] + " " + arr[4] + " " + arr[5];
                        // getting the total of price  multiply the bought quantity
                        total = qty * price;
                        double sprice = Double.parseDouble(arr[4]);
                        double bprice = Double.parseDouble(arr[3]);
                        int orig = Integer.parseInt(arr[5]);
                        // calling the sale method
                        sale(monthToday, dayToday, yearToday, arr[1], qty, sprice, total, bprice, orig);
                        edited = true;
                        break;
                    }
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Item Not Found!", "Oops!", JOptionPane.ERROR_MESSAGE);
            }

            if (edited) {
                // storing the updated qty
                PrintWriter wrfile = new PrintWriter(new FileWriter("products.txt"));
                for (int i = 0; itemline[i] != null; i++) {
                    wrfile.println(itemline[i]);
                }
                wrfile.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!", "Oops!", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to record a sale in a separate file
    public void sale(int monthToday, int dayToday, int yearToday, String name, int qty, double price, double total, double bPrice, int originalStock) {
        try {
            //opening the file sale.txt
            BufferedReader readfile = new BufferedReader(new FileReader("sale.txt"));
            String[] itemline = new String[100];
            int x = 0;
            // iterating through the file
            while ((itemline[x] = readfile.readLine()) != null) {
                x++;
            }
            readfile.close();
            
            //items that will store in the file
            itemline[x] = monthToday + "\t" + dayToday + "\t" + yearToday + "\t" + name + "\t" + qty + "\t" + price + "\t" + total + "\t" + bPrice + "\t" + originalStock;

            PrintWriter wrfile = new PrintWriter(new FileWriter("sale.txt"));

            for (int j = 0; itemline[j] != null; j++) {
                // storing this in the file sale.txt
                wrfile.println(itemline[j]);
            }

            wrfile.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
}
