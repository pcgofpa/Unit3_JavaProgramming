/*
 * This is the account class which has two subclasses Supplies and Services
 */
package cs226.philipginter.cs226_u3_submission2_philipginter;

/**
 *
 * @author Philip Ginter
 */
public class Account {
    
    protected double accountID;
    protected String name;
    protected String customerType;

    public Account() {
    }

    public Account(double accountID, String name, String customerType) {
        this.accountID = accountID;
        this.name = name;
        this.customerType = customerType;
    }

    public double getAccountID() {
        return accountID;
    }

    public void setAccountID(double accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Account(" + "accountID: " + accountID + ", Name: " + name + ", Customer Type: " + customerType + ')';
    }
    
    
     
    
            
    public static void main(String[] args) {
        Account[] a = new Account[4];
        a[0] = new Supplies(100, 99.99, 1, "Drone Team Challenge", "Supplies");
        a[1] = new Services(150, 15.50, 2, "HSU Educational Foundation", "Services");
        a[2] = new Supplies(5, 269.99, 3, "Choctaw Robotics", "Supplies");
        a[3] = new Supplies(25, 269.99, 4, "HSU Educational Foundation", "Supplies");
        
        for (int i=0; i<a.length; i++){
            System.out.println(a[i].toString());
        }
        
    }
    
}
