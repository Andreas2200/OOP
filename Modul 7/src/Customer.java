public class Customer {
    public String name;
    public int id;
    private double balance;

    public Customer(String newName,int newId)
    {
        name = newName;
        id = newId;
        balance = 0;
        Main.costumerCount++;
    }
    public Customer(String newName, int newId, double startBalance)
    {
        name = newName;
        id = newId;
        balance = startBalance;
        Main.costumerCount++;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        if(amount > 0) {
            if (amount > balance) {
                System.out.println("Balance is not high enough.");
            } else {
                balance -= amount;
                System.out.println(amount + " withdrawn.");
            }
        }
    }
    public double getBalance()
    {
        return balance;
    }
}
