
public abstract class Person implements Contactable, Presentable{
    private String name;
    private String email;
    private String phone;
    
    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhoneNo() {
        return phone;
    }
    
    public void setPhoneNo(String phone) {
        this.phone = phone;
    }
}
