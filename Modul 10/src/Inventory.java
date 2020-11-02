import java.util.ArrayList;

public class Inventory
{
    private ArrayList<Item> items = new ArrayList<Item>();

    Inventory(ArrayList<Item> items)
    {
        this.items = items;
    }

    Inventory()
    {
        this(new ArrayList<Item>());
    }

    public void addItem(Item item)
    {
        items.add(item);
    }

    public void removeItem(Item item)
    {
        items.remove(item);
    }

    public double getInventoryValue()
    {
        double tempValue = 0;

        for (int i = 0; i < items.size(); i++)
        {
            tempValue += items.get(i).getPrice();
        }

        return tempValue;
    }

    public void printInventory()
    {
        String tempNameString = "";

        for (int i = 0; i < items.size(); i++)
        {
            tempNameString += items.get(i).getName() + " ";
        }

        System.out.println(tempNameString);
    }

    public void removeExpiredFoods()
    {
        for (int i = 0; i < items.size(); i++)
        {
            Item item = items.get(i);
            try
            {
                boolean isExpired = item.isExpired();
                if(isExpired)
                {
                    items.remove(i);
                    i--;
                }
            }
            catch (UnsupportedOperationException e) {}
        }
    }
}
