
public class Customer extends Person {
    private double budget;
    private boolean isBuying;
    private boolean isRenting;
    
    public Customer(String name, String email, String phone, double budget, boolean isBuying, boolean isRenting) {
        super(name, email, phone);
        this.budget = budget;
        this.isBuying = isBuying;
        this.isRenting = isRenting;
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