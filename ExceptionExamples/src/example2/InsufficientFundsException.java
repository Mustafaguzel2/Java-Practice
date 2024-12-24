
package example2;

/**
 * @author Ozgun Yilmaz
 * 13.Mar.2024 14:28:18
 */
public class InsufficientFundsException extends Exception {
    private double balance, withdrawn;

    public InsufficientFundsException(double balance, double withdrawn) {
        this.balance = balance;
        this.withdrawn = withdrawn;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawn() {
        return withdrawn;
    }
    
    public double getShort() {
        return withdrawn-balance;
    }
}