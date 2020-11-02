import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();

        FoodItem[] foodItems = new FoodItem[10];

        NonFoodItem[] nonFoodItems = new NonFoodItem[10];

        for (int i = 0; i < foodItems.length; i++)
        {
            foodItems[i] = new FoodItem("Apple",i*2, new Date(2020-1900, Calendar.OCTOBER,15));
        }

        for (int i = 0; i < nonFoodItems.length; i++)
        {
            String[] mats = {"CPU","PSU","GPU","SSD","Battery","Keyboard","Screen"};
            nonFoodItems[i] = new NonFoodItem("Computer",5000d, mats);
        }

        for (FoodItem element: foodItems)
        {
            System.out.println(element);
        }

        for (NonFoodItem element: nonFoodItems)
        {
            System.out.println(element);
        }

        for (int i = 0; i < nonFoodItems.length; i++)
        {
            inventory.addItem(nonFoodItems[i]);
        }

        for (int i = 0; i < foodItems.length; i++)
        {
            inventory.addItem(foodItems[i]);
        }

        inventory.printInventory();

        inventory.removeExpiredFoods();

        inventory.printInventory();
    }
}
