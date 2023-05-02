import customExceptions.CustomerNotFoundException;
import customExceptions.InvalidNameException;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private double budget;
    private boolean isBuying;
    private boolean isRenting;
    private static int nextId = 1500;
    private int id;
    private static List<Customer> customers = new ArrayList<>();
    
    public Customer(String name, String email, String phone, double budget, boolean isBuying, boolean isRenting) throws InvalidNameException {
        super(name, email, phone);
        if (name.length() < 1) {
            throw new InvalidNameException("Name cannot be blank");
        }
        this.budget = budget;
        this.isBuying = isBuying;
        this.isRenting = isRenting;
        this.id = nextId++;
        customers.add(this);
    }  
    
    public int getId() {
        return id;
    }
    
    public static List<Customer> getAllCustomers() {
        return customers;
    }
    
    public static String getCustomerById(int customerId) throws CustomerNotFoundException {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer.getName();
            }
        }
        throw new CustomerNotFoundException("Customer with ID " + customerId + " not found.");
    }
    
    public double getBudget() {
        return budget;
    }
    
    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    public boolean isBuying() {
        return isBuying;
    }
    
    public void setBuying(boolean isBuying) {
        this.isBuying = isBuying;
    }
    
    public boolean isRenting() {
        return isRenting;
    }
    
    public void setRenting(boolean isRenting) {
        this.isRenting = isRenting;
    }

	@Override
	public void call(Person person) {
		if (this.getName() != person.getName()) {
			System.out.println(this.getName() + " is calling " + person.getName() + " at " + person.getPhoneNo()+" ...");
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
		System.out.println("Interested in: " + (this.isRenting ? "Renting" : "Buying"));
		System.out.println("Budget: " + this.getBudget());
	}
	
	@Override
	public void email(Person person, String message) {
		System.out.println("Name of the receipent: " + person.getName());
		System.out.println("Email Address: " + person.getEmail());
		System.out.println("Email Body: " + message);
		
    }
}