import java.util.ArrayList;

public class Agent extends Person {
    private ArrayList<Property> properties;
    private static ArrayList<Agent> agentList = new ArrayList<>();
    
    public Agent(String name, String email, String phone) {
        super(name, email, phone);
        this.properties = new ArrayList<Property>();
        agentList.add(this);
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
    
    public static ArrayList<Agent> getAgentList() {
    	return agentList;
    }
    
    @Override
    public String toString(){
    	return this.getName();
    }

	@Override
	public void call(Person person) {
		if (this.getName() != person.getName()) {
			System.out.println(this.getName() + " is calling " + person.getName() + " at " + person.getPhoneNo());
		}
		else {
			System.out.println("Invalid operation, cannot call self");
		}
	}
	
	@Override
	public void getInfo() {
    	System.out.println("Name: " + this.getName());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Phone number: " + this.getPhoneNo());
	}

	@Override
	public void email(Person person, String message) {
		System.out.println("Name of the receipent: " + person.getName());
		System.out.println("Email Address: " + person.getEmail());
		System.out.println("Email Body: " + message);
		
	}
}