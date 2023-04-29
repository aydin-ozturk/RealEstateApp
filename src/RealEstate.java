
public class RealEstate implements Presentable{
	public static final String companyName;
	public static final String companyAddress;
	
	static {
		companyName = "Urban Realty LLC";
		companyAddress = "587 Linden Ave., Atlanta";
	}
	
	public RealEstate () {
	}
	
	public void findMatchingProperties(Customer customer) {
        System.out.println(customer.getName() + " is looking for properties " + (customer.isBuying() ? "for sale" : "") + (customer.isRenting() ? "for rent" : "") + " with a budget of $" + customer.getBudget());
        System.out.println();
        System.out.println("Matching properties:");
        
		for (Agent agent : Agent.getAgentList()) {
            for (Property property : agent.getProperties()) {
                if (property.isForSale() && customer.isBuying() && customer.getBudget() >= property.getPrice()) {
                    if (property instanceof House) {
                        House house = (House) property;
                        System.out.print(property.getClass().getSimpleName() + " - " + house.getNumBedrooms() + " bed / " + house.getNumBathrooms() + " bath - " + "Price: $" + property.getPrice() + " - Adress: " + property.getAddress() +  " - Agent: " + agent.getName());
                    } else if (property instanceof Apartment) {
                        Apartment apartment = (Apartment) property;
                        System.out.print(property.getClass().getSimpleName() + " - " + apartment.getNumBedrooms() + " bed / " + apartment.getNumBathrooms() + " bath - " + "Price: $" + property.getPrice() + " - Adress: " + property.getAddress() +  " - Agent: " + agent.getName());
                    } else if (property instanceof Land) {
                        Land land = (Land) property;
                        System.out.print(property.getClass().getSimpleName() + " - Type: " + land.getType() + " - " + "Size: " + land.getSize() + " Acres - " +  "Price: $" + property.getPrice() + " - Adress: " + property.getAddress() +  " - Agent: " + agent.getName());
                    }
                    System.out.println();
                } else if (property.isForRent() && customer.isRenting() && customer.getBudget() >= property.getPrice()) {
                    if (property instanceof House) {
                        House house = (House) property;
                        System.out.print(property.getClass().getSimpleName() + " - " + house.getNumBedrooms() + " bed / " + house.getNumBathrooms() + " bath - " + "Price: $" + property.getPrice() + "/month" + " - Adress: " + property.getAddress() +  " - Agent: " + agent.getName());
                    } else if (property instanceof Apartment) {
                        Apartment apartment = (Apartment) property;
                        System.out.print(property.getClass().getSimpleName() + " - " + apartment.getNumBedrooms() + " bed / " + apartment.getNumBathrooms() + " bath - " + "Price: $" + property.getPrice() + "/month"  + " - Adress: " + property.getAddress() +  " - Agent: " + agent.getName());
                    } else if (property instanceof Land) {
                        Land land = (Land) property;
                        System.out.print(property.getClass().getSimpleName() + " - Type: " + land.getType() + " - " + "Size: " + land.getSize() + " Acres - " +  "Price: $" + property.getPrice() + "/month"  + " - Adress: " + property.getAddress() +  " - Agent: " + agent.getName());
                    }
                    System.out.println();
                }
            }
        }	
	}
	
	
	@Override
	public final void getInfo() {
    	System.out.println("Company Name: " + RealEstate.companyName);
		System.out.println("Company Address: " + RealEstate.companyAddress);
	}
	
}