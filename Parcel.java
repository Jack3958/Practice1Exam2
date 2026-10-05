public class Parcel
{
   //instance fields for the Parcel class.
   private int idNumber;
   private double size;
   private String zoning;
   private Building structure;
   // variable to track the number of parcel objects created.
   private static int parcelTracker = 0;
   
   /*
      Constructor without args.
   */
   public Parcel()
   {
      idNumber = 0;
      size = 0;
      zoning = "";
      structure = new Building();
      parcelTracker++;
   }
   
   /*
      Constructor with args.
      
      @param idNumber The parcels ID number.
      @param size The parcels Size in acres.
      @param zoning The parcels zoning type(commercial/residential)
      @param structure The Building object representing the building located on the parcel.
   */
   public Parcel(int idNumber, double size, String zoning, Building structure)
   {
      this.idNumber = idNumber;
      this.size = size;
      this.zoning = zoning;
      this.structure = new Building(structure);
      parcelTracker++;
   }
   
   /*
      Mutator method for setting the parcel ID number.
      
      @param idNumber The parcels new ID number.
   */
   public void setIdNumber(int idNumber)
   {
      this.idNumber = idNumber;
   }
   
   /*
      Mutator method for setting the parcels size.
      
      @param size The parcels new size.
   */
   public void setSize(double size)
   {
      this.size = size;
   }
   
   /*
      Mutator method for setting the parcels zoning.
      
      @param zoning The parcels new zoning.
   */
   public void setZoning(String zoning)
   {
      this.zoning = zoning;
   }
   
   /*
      Mutator method for setting the Building object representing the building on the parcel.
      
      @param structure The new Building object.
   */
   public void setBuilding(Building structure)
   {
      this.structure = new Building(structure);
   }
   
   /*
      Accessor method for getting the parcels ID number.
      
      @return idNumber The parcels ID number.
   */
   public int getIdNumber()
   {
      return idNumber;
   }
   
   /*
      Accessor method for getting the parcels size.
      
      @return size The parcels size.
   */
   public double getSize()
   {
      return size;
   }
   
   /*
      Accessor method for getting the parcels zoning.
      
      @return zoning The parcels zoning.
   */
   public String getZoning()
   {
      return zoning;
   }
   
   /*
      Accessor method for getting the building object attached to the parcel.
      
      @return returnBuilding A copy of the building object attached to the parcel.
   */
   public Building getBuilding()
   {
      Building returnBuilding = new Building(structure);
      return returnBuilding;
   }
   
   /*
      A method for calculating and getting the property tax of the parcel.
      
      @return ((size * baseTax) + ((structure.getSize())*additionalTax)) The property tax of the parcel.
   */
   public double getPropertyTax()
   {
      double baseTax = 0;
      double additionalTax = 0;
      if (zoning.toUpperCase().equals("COMMERCIAL"))
         {
            baseTax = 2000;
            if (size < 4000)
               additionalTax = 1;
            else
               additionalTax = 1.5;
         }
      else
         {
            baseTax = 500;
            if (size < 2000)
               additionalTax = .5;
            else
               additionalTax = .75;
         }
      return ((size * baseTax) + ((structure.getSize())*additionalTax));
   }
   
   /*
      A method for converting the Parcel objets data into a string format.
      
      @return str The Parcel objects data in a string format.
   */
   public String toString()
   {
      String str;
      
      str = "IdNumber: " + idNumber + 
            "\nAcres: " + size +
            "\nZoning: " + zoning +
            "\n" + structure +
            "\nProperty Tax: " + this.getPropertyTax();
            
      return str;
   }
   
   /*
      Accessor memthod for getting the number of Parcel objects created.
      
      @param parcelTracker The number of parcels created. 
   */
   public static int getParcelTracker()
   {
      return parcelTracker;
   }
}