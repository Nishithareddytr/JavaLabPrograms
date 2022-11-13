// Invoice Check Program

// Main Class which prints invoice data
public class InvoiceCheck {
    public static void main(String[] args) {
        // Creating an invoice Obj
        Invoice invoiceObj = new Invoice("62", "Fruit", 12, 2.5);
        System.out.println("Part number: " + invoiceObj.getPartNumber() + "; Part description: " + invoiceObj.getPartDescription() +
                "; Sold: " + invoiceObj.getQuantityPurchased() + "; Price: " + invoiceObj.getItemPrice() + "; Invoice amount: " +
                invoiceObj.getInvoiceAmount());
        invoiceObj.setPartNumber("65");
        invoiceObj.setPartDescription("Car");
        invoiceObj.setQuantityPurchased(2);
        invoiceObj.setItemPrice(150000.00);
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
