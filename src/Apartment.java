import customExceptions.NegativeNumberException;
import org.apache.logging.log4j.*;

public class Apartment extends Property {
    private int numBedrooms;
    private int numBathrooms;
    private static Logger logger = LogManager.getLogger(Main.class.getName());
     
    public Apartment(String address, double price, int numBedrooms, int numBathrooms, boolean isForSale, boolean isForRent) throws NegativeNumberException {
    	super(address, price, isForSale, isForRent);
    	if (numBathrooms < 0 || numBedrooms < 0) {
        	throw new NegativeNumberException("Number of rooms cannot be negative.");
        }        
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }
    
    public final int getNumBedrooms() {
        return numBedrooms;
    }
    
    protected final void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }
    
    public int getNumBathrooms() {
        return numBathrooms;
    }
    
    protected void setNumBathrooms(int numBathrooms) throws NegativeNumberException {
    	if (numBathrooms < 0) {
    	logger.error("Number of bathrooms cannot be negative.", new NegativeNumberException());
        throw new NegativeNumberException("Number of bathrooms cannot be negative.");
    }
    this.numBathrooms = numBathrooms;
    }


    @Override
    public void sell(Customer customer) {
    	System.out.println(this.getClass().getSimpleName() + " on "+ this.getAddress() + " is sold to " + customer.getName());
	}

	@Override
	public void getInfo() {
    	System.out.println("Property type: " + this.getClass().getSimpleName());
		System.out.println("Listing type: " + (this.isForRent() ? "For rent" : "For Sale"));
		System.out.println("Number of bedrooms: " + this.getNumBedrooms());
		System.out.println("Number of bathrooms: " + this.getNumBathrooms());
		System.out.println("Price: $" + this.getPrice() + (this.isForRent() ? "/month" : ""));

	}
    
}
