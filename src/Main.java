import customExceptions.CustomerNotFoundException;
import customExceptions.InvalidNameException;
import customExceptions.InvalidOperationException;
import customExceptions.InvalidPropertyTypeException;
import customExceptions.NegativeNumberException;
import java.io.*;
import org.apache.logging.log4j.*;

public class Main {
	private static Logger logger = LogManager.getLogger(Main.class.getName());

	public static void main(String[] args) throws NegativeNumberException, InvalidNameException, InvalidOperationException, CustomerNotFoundException, InvalidPropertyTypeException {

		final RealEstate realEstate = new RealEstate();

		House house1 = new House("789 Oak St., Chicago", 400000, 3, 2, true, false, true);
		House house2 = new House("321 Pine St., San Francisco", 6000, 4, 2, false, true, false);

		Land land1 = new Land("111 Main St., Boston", 200000, 20, "Commercial", true, false);
		Land land2 = new Land("222 Elm St., Seattle", 1000, 10, "Agricultural", false, true);
		Land land3 = null;

		Apartment apartment1 = new Apartment("333 Center St., Miami", 2500, 2, 1, false, true);
		Apartment apartment2 = new Apartment("444 Smith St., Denver", 200000, 2, 2, true, false);

		Customer customer1 = new Customer("Adam Smith", "adams@gmail.com", "123-456-7890", 500000, true, false);
		Customer customer2 = new Customer("John Doe", "jdoe@gmail.com", "897-156-7890", 5000, false, true);

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
//        System.out.println(house1.hashCode());
//        System.out.println(house2.hashCode());

//        //interface implementation:      
//        house1.sell(customer1); 
//        customer1.call(agent1);
//        customer1.email(agent1, "Hi, please give me an update on the property on Pine St.");
//        land1.getInfo();
//		  realEstate.getInfo();

//        //custom exception with throws
//        apartment1.setNumBathrooms(-5);
//        Customer customer3 = new Customer("", "ams@gmail.com", "727-456-7890", 400000, true, false);
//        System.out.println(Customer.getCustomerById(1505));
//		  agent1.addProperty(land3);
//		  Land land4 = new Land("222 Elm St., Seattle", 1000, 10, "Resale", false, true);
		
//		   //custom exception with try catch block
//		  try {
//		  	  Apartment apartment3 = new Apartment("234 Cedar St., Phoenix", 350000, 3, -2, true, false);
//			  System.out.println(apartment3.getNumBathrooms());
//		  } catch (NegativeNumberException e) {
//			  logger.error("Error occurred: ", e);
//		  }
		
//		  try {
//			  Land land4 = new Land("222 Elm St., Seattle", 1000, 10, "Resale", false, true);
//		  } catch (InvalidPropertyTypeException e) {
//			  logger.error("Error occurred: ", e);
//		  }

//		  // try catch with resources:        
//        String filename = "src/pest.txt";
//        //String filename = "src/test.txt";
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
//            String firstLine = bufferedReader.readLine();
//            System.out.println(firstLine);
//        } catch (IOException e) {
//        	logger.error("File doesn't exist: " + e.getMessage(), e);
//        }

	}

}