
public class Main {
    public static void main(String[] args) {
        
    	final RealEstate realEstate = new RealEstate();
    	
        House house1 = new House("789 Oak St., Chicago", 400000, 3, 2, true, false, true);
        House house2 = new House("321 Pine St., San Francisco", 6000, 4, 2, false, true, false);
        
        Land land1 = new Land("111 Main St., Boston", 200000, 20, "Commercial", true, false);
        Land land2 = new Land("222 Elm St., Seattle", 1000, 10, "Agricultural", false, true);
        
        Apartment apartment1 = new Apartment("333 Center St., Miami", 2500, 2, 1, false, true);
        Apartment apartment2 = new Apartment("444 Smith St., Denver", 200000, 2, 2, true, false);
        
        Customer customer1 = new Customer("Adam Smith", "adams@gmail.com", "123-456-7890", 500000, true, false);
        
        Agent agent1 = new Agent("Tina Lee", "tina@realestate.com", "888-888-8888");
        Agent agent2 = new Agent("Mike Brown", "mike@realestate.com", "777-777-7777");
        
        agent1.addProperty(house1);
        agent1.addProperty(land1);
        agent1.addProperty(apartment1);
        
        agent2.addProperty(house2);
        agent2.addProperty(land2);
        agent2.addProperty(apartment2);
        
//        // list matching properties based on the customer's preferences:
//        realEstate.findMatchingProperties(customer1); 
        
//        // toString() override:
//        System.out.println(Agent.getAgentList());       
        
//        // equals() override:
//        System.out.println(house1.equals(house2)); 
        
//        // hashCode() override:
        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        
        
//        //interface implementation:      
//        house1.sell(customer1); 
//        customer1.call(agent1);
//        customer1.email(agent1, "Hi, please give me an update on the property on Pine St.");
//        land1.getInfo();
//		  realEstate.getInfo();
    }
    
}