public class Building
{
   //instance fields for the Building class.
   private String address;
   private double size;
   
   /*
      Constructor without args.
   */
   public Building()
   {
      address = "";
      size = 0;
   }
   
   /*
      Constructor with args.
      
      @param address The address of the building.
      @param size The square footage of the building.
   */
   public Building(String address, double size)
   {
      this.size = size;
      this.address = address;
   }
   
   /*
      Constructor for creating a copy of a Building object.
      
      @param copy The Building object to be copied.
   */
   public Building(Building copy)
   {
      this.address = copy.address;
      this.size = copy.size;
   }
   
   /*
      Mutator method for setting the address.
      
      @param address The buildings new address.
   */
   public void setAddress(String address)
   {
      this.address = address;
   }
   
   /*
      Mutator method for setting the size.
      
      @param size The buildings new size.
   */
   public void setSize(int size)
   {
      this.size = size;
   }
   
   /*
      Accessor method for getting the address.
      
      @return address The buildings address. 
   */
   public String getAddress()
   {
      return address;
   }
   
   /*
      Accessor method for getting the size.
      
      @return size The buildings size.
   */
   public double getSize()
   {
      return size;
   }
   
   /*
      Method for converting a Building objects data into a string format.
      
      @return str The Building objects data in a string format.
   */
   public String toString()
   {
      String str;
      
      str = "Address: " + address +
            "\nSize: " + size + "^2 ft";
      
      return str;
   }
}