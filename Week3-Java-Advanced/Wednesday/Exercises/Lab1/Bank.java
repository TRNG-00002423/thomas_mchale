import java.util.HashMap;
import java.util.Map;

public class Bank {
    // TODO HashMap<String, Account>
    private Map<String,Account> bankAccounts = new HashMap<>();

    public Bank() {
        this.bankAccounts = new HashMap<>();
    }

    public Bank(HashMap<String,Account> bankAccounts)
    {
        this.bankAccounts = bankAccounts;
    }

    public void openAccount(String id, double initialDeposit) throws InvalidAccountException {
        if (id == null || id.trim().isEmpty()) {
            throw new InvalidAccountException("Account ID cannot be null or blank.");
        }
        if (this.bankAccounts.containsKey(id)) {
            throw new InvalidAccountException("Account ID '" + id + "' already exists.");
        }  
        bankAccounts.put(id, new Account(id, initialDeposit));
        
    }

    public Account getAccount(String id) throws InvalidAccountException {
        if (!this.bankAccounts.containsKey(id)) {
            throw new InvalidAccountException("Account ID '" + id + "' does not exist.");
        }
        return this.bankAccounts.get(id);
    }

    public void transfer(String fromId, String toId, double amount)
            throws InvalidAccountException, InsufficientFundsException {
        if (!bankAccounts.containsKey(toId) || !bankAccounts.containsKey(fromId))
        {
            throw new InvalidAccountException("Account ID does not exist");
        }
        if (bankAccounts.get(fromId).getBalance() < amount)
        {
            throw new InsufficientFundsException("Insufficient Funds to make that transition");
        }
        bankAccounts.get(fromId).withdraw(amount);
        bankAccounts.get(toId).deposit(amount);
    }
}