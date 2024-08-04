import java.util.*;

public class currency_converter{
    public static void main(String[] args) {       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter!");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.print("Enter your choice (1 or 2 or 3 or 4): ");
        int choice = s.nextInt();

        if (choice == 1) {
            System.out.print("Enter the amount in USD: ");
            double USD = s.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("Amount in Rupee: " + Rupee);
        } 
        else if (choice == 2) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = s.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Amount in USD: " +USD);
        }
        else if (choice == 3) {
            System.out.print("Enter the amount in EURO: ");
            double EURO= s.nextDouble();
            double Rupee = euroToRupee(EURO);
            System.out.println("Amount in USD: " +Rupee);
        } 
        else if (choice == 4) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = s.nextDouble();
            double EURO = RupeeToEuro(Rupee);
            System.out.println("Amount in USD: " +EURO);
        }
       
        else {
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4.");
        }

        s.close();
    }

    public static double usdToRupee(double USD) {
        return USD * 83.59;  
    }
    public static double RupeeToUsd(double Rupee) {
        return Rupee * 0.012;   
    }
    public static double euroToRupee(double EURO) {
        return EURO *91.13;   
    }
    public static double RupeeToEuro(double Rupee) {
        return Rupee *0.011;   
    }  
}