
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
}