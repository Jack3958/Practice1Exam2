//import statements for the java API Scanner & ArrayList classes.
import java.util.Scanner;
import java.util.ArrayList;

public class DoerrDemo
{
   public static void main(String[] args) {
      
      //variables to temporarily hold data
      int parcelID;
      double acres = 0;
      double sqft = 0;
      String zoneType;
      String buildingAddress;
      Building building;
      String next = "Y";
      double avgTax = 0;
      
      //ArrayList to hold the Parcel objects created by the user
      ArrayList <Parcel> parcelList = new ArrayList<>();
      
      //Scanner object to gather user input
      Scanner keyboard = new Scanner(System.in);
      
      //While loop to gather the data for an unkown amount of Parcel & Building objects 
      while (next.equals("Y"))
      {
         System.out.print("Enter Parcel ID Number: ");
         parcelID = keyboard.nextInt();
         keyboard.nextLine();
         
         // A do-while statment to ensure the user doesn't enter a number below 0
         do
         {
            System.out.print("Enter Parcel Size in Acres(must be above 0): ");
            acres = keyboard.nextDouble();
            keyboard.nextLine();
         } while (acres < 0);
         
         System.out.print("Enter Parcel Zoning: ");
         zoneType = keyboard.nextLine();
         
         System.out.print("Enter Address of the Buiding: ");
         buildingAddress = keyboard.nextLine();
         
         // A do-while statment to ensure the user doesn't enter a number below 0
         do
         {
            System.out.print("Enter Building Size in Square Feet(must be above 0): ");
            sqft = keyboard.nextInt();
            keyboard.nextLine();
         } while (sqft < 0);
         
         //creates a new Building object using the previously gathered user input
         building = new Building(buildingAddress, sqft);
         
         //adds a new Parcel object to the parcelList ArrayList generated using previously gathered user input.
         parcelList.add(new Parcel(parcelID, acres, zoneType, building));
         
         //checks if the user wants to add another parcel.
         System.out.print("Do you want to add another parcel?(Y/N): ");
         next = keyboard.nextLine().toUpperCase();
      }
      
      //Gets  ready to print all the Parcel objects in a String format.
      System.out.println("\nParcels: ");
      
      //Prints each Parcel object in the parcelList ArrayList in a string format.
      for (Parcel parcel : parcelList)
      {
         System.out.println("\n" + parcel);
         //adds the property tax of the parcel to avgTax
         avgTax = (avgTax + parcel.getPropertyTax());
      }
      //devides avgTax by the amount of Parcel objects in order to calculate the average property tax.
      avgTax = (avgTax/Parcel.getParcelTracker());
      System.out.printf("\nThe average property tax is: %.2f%n", avgTax);
   }   
}