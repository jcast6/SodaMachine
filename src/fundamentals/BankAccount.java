package fundamentals;

/**
 * Encapsulation helps to make our code more robust and easier to
 * maintain, by reducing the possibility of bugs and making it
 * easier to make changes to the code without affecting other parts
 * of the system.
 */
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Current balance: " + account.getBalance());
    }
}

/*
  we define a BankAccount class with a balance variable
  that is private, meaning it can only be accessed within the
  BankAccount class.

   two public methods, deposit and withdraw, that allow us to
   modify the balance of the account. We also provide a
   getBalance method that allows us to retrieve the current balance.

  making the balance variable private and only allowing
  access to it through methods, we are encapsulating the
  data and hiding it from outside classes. This ensures that the balance can only be
  modified in a controlled manner, through the deposit and
  withdraw methods.

  In the main method, we create a BankAccount object and use its
  methods to deposit and withdraw money. We can retrieve the current balance
  using the getBalance method. The fact that we can only modify the balance
  through the public methods ensures that we don't accidentally
  modify the balance in an unintended way.
 */
