/*
 * This is a child class of the Account class.
 */
package cs226.philipginter.cs226_u3_submission2_philipginter;

/**
 *
 * @author Philip Ginter
 */
public class Supplies extends Account {
    private int numberOfItems;
    private double pricePerItem;
    

    public Supplies() {
    }

    public Supplies(int numberOfItems, double pricePerItem, double accountID, String name, String customerType) {
        super(accountID, name, customerType);
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    
    public double calculateSales(){
        return numberOfItems * pricePerItem;
    }

    @Override
    public String toString() {
        return (super.toString() + " ordered " + "Supplies{" +  numberOfItems + " items were ordered" + ", at a price of $" + pricePerItem + " per item" + '}');
    }
  
    
}
