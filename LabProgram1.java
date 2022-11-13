// Invoice Check Program
Create a class called invoice that a hardware store might use to represent an invoice for an item sold at the store.An invoice should include four pieces of 
information as instance variables, a part number(type string), a part description (type string), a quantity of the item being purchased (type int) and
a price per item(double).Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. 
In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount 
as a double value .If the quantity is not positive, it should be set to 0.If the price per item is not positive ,it should be set to 0.0.

Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.


// Main Class which prints invoice data
public class InvoiceTest {
    public static void main(String[] args) {
        // Creating an invoice Obj by calling parameterized constructor
        Invoice invoiceObj = new Invoice("62", "Fruit", 12, 2.5);
        // Printing the values of first item
        System.out.println("Part number: " + invoiceObj.getPartNumber() + "; Part description: " + invoiceObj.getPartDescription() +
                "; Sold: " + invoiceObj.getQuantityPurchased() + "; Price: " + invoiceObj.getItemPrice() + "; Invoice amount: " +
                invoiceObj.getInvoiceAmount());
        // Setting the new values
        invoiceObj.setPartNumber("65");
        invoiceObj.setPartDescription("Car");
        invoiceObj.setQuantityPurchased(2);
        invoiceObj.setItemPrice(150000.00);
        // Printing the new values
        System.out.println("After Updating the values:");
        System.out.println("Part number: " + invoiceObj.getPartNumber() + "; Part description: " + invoiceObj.getPartDescription() +
                "; Sold: " + invoiceObj.getQuantityPurchased() + "; Price: " + invoiceObj.getItemPrice() + "; Invoice amount: " +
                invoiceObj.getInvoiceAmount());
    }
}
class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double itemPrice;

    public Invoice(String partNumber, String partDescription, int quantityPurchased, double itemPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityPurchased = quantityPurchased;
        this.itemPrice = itemPrice;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        if (quantityPurchased > 0) {
            this.quantityPurchased = quantityPurchased;
        } else {
            this.quantityPurchased = 0;
        }
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setItemPrice(double itemPrice) {
        if (itemPrice > 0) {
            this.itemPrice = itemPrice;
        } else {
            this.itemPrice = 0;
        }
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getInvoiceAmount() {
        return itemPrice * quantityPurchased;
    }
}
