public class Account {
    // TODO fields: id, balance
    private String id;
    private double balance;

    public Account(String id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance)
        {
            throw new InsufficientFundsException("Not enough funds to withdraw");
        }
        else
        {
            this.balance -= amount;
        }
    }
}