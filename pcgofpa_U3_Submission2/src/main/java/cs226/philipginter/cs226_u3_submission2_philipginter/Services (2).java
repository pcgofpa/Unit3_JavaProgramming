/*
 * This is a child class of the Account class.
 */
package cs226.philipginter.cs226_u3_submission2_philipginter;

/**
 *
 * @author Philip Ginter
 */
public class Services extends Account {
    
    private double numberOfHours;
    private double ratePerHour;
    

    public Services() {
    }

    
    public Services(double numberOfHours, double ratePerHour, double accountID, String name, String customerType) {
        super(accountID, name, customerType);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double calculateSales(double ratePerHour, double numberOfHours){
        return ratePerHour * numberOfHours;
    }
    

    
    @Override
    public String toString() {
        return (super.toString() + " used our services " + "Services{" +  numberOfHours + " hours were billed" + ", at a rate of $" + ratePerHour + " per hour" + "}");
    }
    
    
    
    
    
    
}
