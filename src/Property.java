
public class Property {
    private String address;
    private double price;
    private boolean isForSale;
    private boolean isForRent;
    
    public Property(String address, double price, boolean isForSale, boolean isForRent) {
        this.address = address;
        this.price = price;
        this.isForSale = isForSale;
        this.isForRent = isForRent;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public boolean isForSale() {
        return isForSale;
    }
    
    public void setForSale(boolean isForSale) {
        this.isForSale = isForSale;
    }
    
    public boolean isForRent() {
        return isForRent;
    }
    
    public void setForRent(boolean isForRent) {
        this.isForRent = isForRent;
    }
}
