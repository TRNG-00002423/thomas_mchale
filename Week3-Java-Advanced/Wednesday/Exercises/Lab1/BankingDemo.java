public class BankingDemo {
    public static void main(String[] args) throws Exception {
        // TODO: demonstrate success path + catch InsufficientFundsException + InvalidAccountException
        // TODO: trigger IllegalArgumentException on bad deposit
        Bank bank = new Bank();
        try {
            bank.openAccount("101", 500.00);
            bank.openAccount("102", 200.00);
            bank.transfer("101", "102", 150.00);
            bank.transfer("101", "999", 50.00);
        }
        catch (InsufficientFundsException e)
        {
            System.out.println(e);
        }
        catch (InvalidAccountException e)
        {
            System.out.println(e);
        }
        
    }
}