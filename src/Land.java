
public class Land extends Property {
    private double size;
    private String type; // Can be set to commercial, agricultural or residential
    
    public Land(String address, double price, double size, String type, boolean isForSale, boolean isForRent) {
        super(address, price, isForSale, isForRent);
        this.size = size;
        this.type = type;
    }
    
    public double getSize() {
        return size;
    }
    
    public void setSize(double size) {
        this.size = size;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}