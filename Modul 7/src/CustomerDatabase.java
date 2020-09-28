public class CustomerDatabase
{
    Customer[] customers;

    public CustomerDatabase()
    {
        customers = new Customer[10];
    }

    public void addCustomer(Customer customerToAdd)
    {
        customers[customerToAdd.id] = customerToAdd;
    }

    public void removeCustomer(int idToRemove)
    {
        for (int i = 0; i < customers.length; i++)
        {
            if(customers[i] != null && customers[i].id == idToRemove)
            {
                customers[i] = null;
            }
        }
    }

    public void returnCustomers()
    {
        for (int i = 0; i < customers.length; i++)
        {
            if(customers[i] != null) {
                System.out.println("");
                System.out.println("Name: " + customers[i].name);
                System.out.println("ID: " + customers[i].id);
                System.out.println("Balance: " + customers[i].getBalance());
            }
        }
    }

    public void getNames()
    {
        for (int i = 0; i < customers.length; i++)
        {
            if(customers[i] != null)
            {
                System.out.println("");
                System.out.println(customers[i].name);
            }
        }
    }
}
