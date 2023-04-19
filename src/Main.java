
public class Main {
    public static void main(String[] args) {
        
        House house1 = new House("789 Oak St., Chicago", 400000, 3, 2, true, false);
        House house2 = new House("321 Pine St., San Francisco", 6000, 4, 2, false, true);
        
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
        
        System.out.println(customer1.getName() + " is looking for properties " + (customer1.isBuying() ? "for sale" : "") + (customer1.isRenting() ? "for rent" : "") + " with a budget of $" + customer1.getBudget());
        System.out.println();
        System.out.println("Available properties:");

        for (Agent agent : new Agent[] { agent1, agent2 }) {
            for (Property property : agent.getProperties()) {
                if (property.isForSale() && customer1.isBuying() && customer1.getBudget() >= property.getPrice()) {
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
                } else if (property.isForRent() && customer1.isRenting() && customer1.getBudget() >= property.getPrice()) {
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
    
}