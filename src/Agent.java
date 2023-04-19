import java.util.ArrayList;

public class Agent extends Person {
    private ArrayList<Property> properties;
    
    public Agent(String name, String email, String phone) {
        super(name, email, phone);
        this.properties = new ArrayList<Property>();
    }
    
    public ArrayList<Property> getProperties() {
        return properties;
    }
    
    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
    
    public void addProperty(Property property) {
        this.properties.add(property);
    }
    
    public void removeProperty(Property property) {
        this.properties.remove(property);
    }
}