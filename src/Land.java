import customExceptions.InvalidPropertyTypeException;

public class Land extends Property {
    private double size;
    private String type; // Can be set to commercial, agricultural or residential
    
    public Land(String address, double price, double size, String type, boolean isForSale, boolean isForRent) throws InvalidPropertyTypeException{
        super(address, price, isForSale, isForRent);
        if (!type.equals("Commercial") && !type.equals("Agricultural") && !type.equals("Residential")) {
            throw new InvalidPropertyTypeException("Invalid property type: " + type + ". Property type should be either Commercial, Agricultural or Residential");
        }
        
        this.size = size;
        this.type = type;
    }
    
    public double getSize() {
        return size;
    }
    
    protected void setSize(double size) {
        this.size = size;
    }
    
    public String getType() {
        return type;
    }
    
    protected void setType(String type) {
        this.type = type;
    }

    @Override
	public void sell(Customer customer) {
    	System.out.println(this.getClass().getSimpleName() + " on "+ this.getAddress() + " is sold to " + customer.getName());
	}
    
    private static class LandUtils {
        private static String listingType(boolean isForRent) {
            return (isForRent ? "For rent" : "For sale");
        }
    }
    @Override
    public void getInfo() {
        System.out.println("Property type: " + this.getClass().getSimpleName());
        System.out.println("Listing type: " + LandUtils.listingType(this.isForRent()));
        System.out.println("Land type: " + this.getType());
        System.out.println("Price: $" + this.getPrice() + (this.isForRent() ? "/month" : ""));
    }
    }