import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

         // Initialize a boolean variable to control the loop
        boolean continueloop = true;

         // Start the do-while loop
        do {

              // Display the currency conversion menu
            System.out.println("Currency Converter");
            System.out.println("1. Yen (JPY)");
            System.out.println("2. Pound (GBP)");
            System.out.println("3. Australian Dollar (AUD)");
            System.out.println("4. Indian Rupees (INR)");
            System.out.println("5. US Dollar (USD)");
            System.out.println("6. Euro (EUR)");
            System.out.println("7. Canadian Dollar (CAD)");
            System.out.println("8. Singapore Dollar (SGD)");

            System.out.println("9. Exit");

             
            // Ask the user to choose a currency
            System.out.println("Choose the currency: ");
            int choice = sc.nextInt();

             // Check if the user wants to exit
            if (choice == 9) {
                System.out.println("Thank you for using Currency Converter!");
                continueloop = false;
            } else {

                // Ask the user to enter the amount
                System.out.println("Enter the amount: ");
                double amount = sc.nextDouble();

                // Perform the currency conversion based on the user's choice
                switch (choice) {
                    case 1:
                        Yen_to_other(amount);
                        break;
                    case 2:
                        Pound_to_other(amount);
                        break;
                    case 3:
                        Australian_to_other(amount);
                        break;
                    case 4:
                        Indian_to_other(amount);
                        break;
                    case 5:
                        US_to_other(amount);
                        break;
                    case 6:
                        Euro_to_other(amount);
                        break;
                    case 7:
                        Canadian_to_other(amount);
                    case 8:
                        Singapore_to_other(amount);  
                        break;     

                    default:
                        System.out.println("Invalid option please try again...");
                        break;
                }

                // Ask the user if they want to continue
                System.out.println("Do you want to continue? (yes/no)");
                String input = sc.next();
                if (input.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using Currency Converter!");
                    continueloop = false;
                }
            }
        } while (continueloop);
        sc.close();  //close the scanner
    }


 
    // Method to convert Yen to other currencies
    public static void Yen_to_other(double amount)
    {
        System.out.println("1 JPY= " + 0.0092 + " USD");
        System.out.println(amount +"JPY=" + (amount * 0.0092) + " USD");
        System.out.println();

        System.out.println("1 JPY= " + 0.0078 + " EUR");
        System.out.println(amount+ "JPY=" + (amount * 0.0078) + " EUR");
        System.out.println();

        System.out.println("1 JPY= " + 0.74+ " INR");
        System.out.println(amount+ "JPY=" + (amount* 0.74) +" INR");
         System.out.println();

    }
    // Method to convert Pound to other currencies
    public static void Pound_to_other(double amount)
    {
        System.out.println("1 GBP= " + 1.31 + " USD");
        System.out.println(amount +"GBP=" +(amount * 1.31) + " USD");
        System.out.println();

        System.out.println("1 GBP= " + 1.18 + " EUR");
        System.out.println(amount + "GBP=" +(amount* 1.18) + " EUR");
        System.out.println();

        System.out.println("1 GBP= " + 96.53 + " INR");
        System.out.println(amount + "GBP=" +(amount* 96.53) + " INR");
        System.out.println();
    }
    // Method to convert Australian Dollar to other currencies
    public static void Australian_to_other(double amount)
    {
        System.out.println("1 AUD= " + 0.69 + " GBP");
        System.out.println(amount +"AUD=" +(amount * 0.69) + " GBP");
        System.out.println();

        System.out.println("1 AUD= " + 0.62 + " EUR");
        System.out.println(amount + "AUD=" +(amount* 0.62) + " EUR");
        System.out.println();

        System.out.println("1 AUD= " + 50.43 + " INR");
        System.out.println(amount + "AUD=" +(amount* 50.43) + " INR");
        System.out.println();
    }
    // Method to convert Indian Rupees to other currencies
    public static void Indian_to_other(double amount)
    {
        
        System.out.println("1 INR= " + 0.013 + " Dollar");
        System.out.println(amount + "INR=" +(amount* 0.013) + " Dollar");
        System.out.println();

        System.out.println("1 INR= " + 0.012 + " EUR");
        System.out.println(amount + "INR=" +(amount* 0.012 ) + " EUR");
        System.out.println();

        System.out.println("1 INR= " + 1.35 + " JPY");
        System.out.println(amount + "INR=" +(amount* 1.35) + "JPY");
        System.out.println();

        System.out.println("1 INR= " + 0.0104 + " GBP");
        System.out.println(amount + "INR=" +(amount* 0.0104) + " GBP");
        System.out.println();

        System.out.println("1 INR= " + 0.0198 + " AUD");
        System.out.println(amount + "INR=" +(amount* 0.0198) + " AUD");
        System.out.println();
    }

    // Method to convert US dollar to other currencies
    public static void US_to_other(double amount) {

        System.out.println("1 USD = " + 0.88 + " EUR");
        System.out.println(amount + " USD = " + (amount * 0.88) + " EUR");
        System.out.println();
        
        System.out.println("1 USD = " + 1.32 + " CAD");
        System.out.println(amount + " USD = " + (amount * 1.32) + " CAD");
        System.out.println();
        
        System.out.println("1 USD = " + 1.48 + " AUD");
        System.out.println(amount + " USD = " + (amount * 1.48) + " AUD");
        System.out.println();
        
        System.out.println("1 USD = " + 109.32 + " JPY");
        System.out.println(amount + " USD = " + (amount * 109.32) + " JPY");
        System.out.println();
        
        System.out.println("1 USD = " + 74.83 + " INR");
        System.out.println(amount + " USD = " + (amount * 74.83) + " INR");
        System.out.println();
    }   
    
    // Method to convert Euro to other currencies
    public static void Euro_to_other(double amount) {
        System.out.println("1 EUR = " + 1.12 + " USD");
        System.out.println(amount + " EUR = " + (amount * 1.12) + " USD");
        System.out.println();
        
        System.out.println("1 EUR = " + 1.50 + " AUD");
        System.out.println(amount + " EUR = " + (amount * 1.50) + " AUD");
        System.out.println();
        
        System.out.println("1 EUR = " + 1.31 + " CAD");
        System.out.println(amount + " EUR = " + (amount * 1.31) + " CAD");
        System.out.println();
        
        System.out.println("1 EUR = " + 123.45 + " JPY");
        System.out.println(amount + " EUR = " + (amount * 123.45) + " JPY");
        System.out.println();
        
        System.out.println("1 EUR = " + 84.92 + " INR");
        System.out.println(amount + " EUR = " + (amount * 84.92) + " INR");
        System.out.println();
    }   
    
    // Method to convert Canadian dollar  to other currencies
    public static void Canadian_to_other(double amount) {
        System.out.println("1 CAD = " + 0.77 + " USD");
        System.out.println(amount + " CAD = " + (amount * 0.77) + " USD");
        System.out.println();
        
        System.out.println("1 CAD = " + 0.67 + " EUR");
        System.out.println(amount + " CAD = " + (amount * 0.67) + " EUR");
        System.out.println();
        
        System.out.println("1 CAD = " + 0.58 + " GBP");
        System.out.println(amount + " CAD = " + (amount * 0.58) + " GBP");
        System.out.println();
        
        System.out.println("1 CAD = " + 93.45 + " JPY");
        System.out.println(amount + " CAD = " + (amount * 93.45) + " JPY");
        System.out.println();
        
        System.out.println("1 CAD = " + 64.92 + " INR");
        System.out.println(amount + " CAD = " + (amount * 64.92) + " INR");
        System.out.println();
    }    

    // Method to convert Singapore dollar to other currencies
    public static void Singapore_to_other(double amount) {
        System.out.println("1 SGD = " + 0.74 + " USD");
        System.out.println(amount + " SGD = " + (amount * 0.74) + " USD");
        System.out.println();
        
        System.out.println("1 SGD = " + 0.65 + " EUR");
        System.out.println(amount + " SGD = " + (amount * 0.65) + " EUR");
        System.out.println();
        
        System.out.println("1 SGD = " + 0.57 + " GBP");
        System.out.println(amount + " SGD = " + (amount * 0.57) + " GBP");
        System.out.println();
        
        System.out.println("1 SGD = " + 88.42 + " JPY");
        System.out.println(amount + " SGD = " + (amount * 88.42) + " JPY");
        System.out.println();
        
        System.out.println("1 SGD = " + 61.35 + " INR");
        System.out.println(amount + " SGD = " + (amount * 61.35) + " INR");
        System.out.println();

    }    
}
