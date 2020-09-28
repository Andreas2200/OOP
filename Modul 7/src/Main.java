public class Main {

    public static int costumerCount = 0;

    public static void main(String[] args)
    {
        CustomerDatabase cosDB = new CustomerDatabase();
        Customer cos1 = new Customer("Dave",costumerCount);
        Customer cos2 = new Customer("Liza", costumerCount, 1000);

        cosDB.addCustomer(cos1);
        cosDB.addCustomer(cos2);

        cos1.deposit(100000000);
        cosDB.getNames();

        cosDB.returnCustomers();

        cosDB.removeCustomer(1);

        cosDB.getNames();
    }
}
