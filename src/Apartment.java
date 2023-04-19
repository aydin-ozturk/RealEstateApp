
public class Apartment extends Property {
    private int numBedrooms;
    private int numBathrooms;
     
    public Apartment(String address, double price, int numBedrooms, int numBathrooms, boolean isForSale, boolean isForRent) {
        super(address, price, isForSale, isForRent);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }
    
    public int getNumBedrooms() {
        return numBedrooms;
    }
    
    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }
    
    public int getNumBathrooms() {
        return numBathrooms;
    }
    
    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }
}
