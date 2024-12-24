
package example2;

import example1.ExceptionTest;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ozgun Yilmaz
 * 13.Mar.2024 14:33:01
 */
public class BankDemo {

    public static void main(String [] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);

        try {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Balance amount  : " + e.getBalance());
            System.out.println("Withdraw request: " + e.getWithdrawn());
            System.out.println("Sorry, but you are short $" + e.getShort());
            Logger.getLogger(ExceptionTest.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}