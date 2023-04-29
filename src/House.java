
public class House extends Property {
    private int numBedrooms;
    private int numBathrooms;
    private boolean hasPrivatePool;
    
    public House(String address, double price, int numBedrooms, int numBathrooms, boolean isForSale, boolean isForRent, boolean hasPrivatePool) {
        super(address, price, isForSale, isForRent);
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
    
    protected void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }
    
    public boolean hasPrivatePool() {
        return hasPrivatePool;
    }

    public void setHasPrivatePool(boolean hasPrivatePool) {
        this.hasPrivatePool = hasPrivatePool;
    }
    
    @Override
    public boolean equals(Object o) {
        House house = (House) o;
        return super.getAddress() == house.getAddress();
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
	
    @Override
    public int hashCode() {
        return this.getAddress().hashCode() * this.getNumBathrooms() * this.getNumBedrooms() + (hasPrivatePool ? 1 : 0);
    }
}
