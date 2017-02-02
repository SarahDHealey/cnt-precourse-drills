public class Address {
    //instance variables
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(string street, string city, string state, string zip) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
    }


   public String getStreet() {
      return street;
   }

   public String getCity() {
      return city;
   }

   public String getState() {
      return state;
   }

   public String getZip() {
      return zip;
   }

   public void setStreet( int newStreet) {
      this.street = street;
   }

   public void setCity(String newCity) {
      this.city = city;
   }

   public void setState( String newState) {
      this.state = state;
   }
   
   public void setZip( String newZip) {
      this.zip = zip;
   }
}

  