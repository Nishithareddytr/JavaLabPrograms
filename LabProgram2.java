Develop a Java application to generate Electricity bill. Create a class with the following members: Consumer no., consumer name,
Develop a Java application to generate Electricity bill. Create a class with the following members: Consumer no., consumer name, previous month reading, 
current month reading, type of EB connection (i.e domestic or commercial). Compute the bill amount using the following tariff.
If the type of the EB connection is domestic, calculate the amount to be paid as follows:
 First 100 units - Rs. 1 per unit
 101-200 units - Rs. 2.50 per unit
 201 -500 units - Rs. 4 per unit
 > 501 units - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to be paid as follows:
 First 100 units - Rs. 2 per unit
 101-200 units - Rs. 4.50 per unit
 201 -500 units - Rs. 6 per unit
 > 501 units - Rs. 7 per unit


// import required classes and package if any  
// create class ElectricityBillExample1 to calculate electricity bill  
class ElectricityBillExample1   
{   
    // main() method start  
    public static void main(String args[])   
    {     
        // declare and initialize variable units  
        int units = 900;  
        // variable to calculate electricity bill to pay  
        double billToPay = 0;  
        // check whether units are less than 100  
        if(units < 100)  
        {  
            billToPay = units * 1.20;  
        }  
        // check whether the units are less than 300  
        else if(units < 300){  
            billToPay = 100 * 1.20 + (units - 100) * 2;  
        }  
        // check whether the units are greater than 300  
        else if(units > 300)  
        {  
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;  
        }  
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);   
    }   
}  


