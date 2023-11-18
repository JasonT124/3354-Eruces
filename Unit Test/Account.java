/**
 * Class to simulate a user's account
 * Used for testing the functionality of withdraw method
 * in Project Deliverable 2
 */
public class Account {

    private int assets;

    /**
     * For simulation purposes: assume the user has $1000 in their account
     */
    public Account() {
        assets = 1000;
    }

    /**
     * Attempts to withdraw the amount given from the user's assets
     * @param amount the amount to withdraw
     * @return true if the user is successfully able to withdraw the amount requested
     */
    public boolean withdraw(int amount) {
        // can't withdraw -- not enough funds
        if (amount > assets) {
            return false;
        }

        // withdraw successful
        assets -= amount;
        return true;
    }
    
}
