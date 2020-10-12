import java.util.ArrayList;

public class Inventory extends Item
{
    private ArrayList<Item> items = new ArrayList<Item>();

    Inventory(String name, double price) {
        super(name, price);
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
}
