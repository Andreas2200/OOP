import java.util.ArrayList;
import java.util.Arrays;

public class NonFoodItem extends Item
{
    ArrayList<String> materials = new ArrayList<String>();

    NonFoodItem(String name, Double price, String[] materials)
    {
        super(name,price);
        ArrayList<String> mats = new ArrayList<String>(Arrays.asList(materials));
        this.materials = mats;
    }

    public String getMaterials() {
        String result = "";
        for (int i = 0; i < materials.size(); i++)
        {
            if(materials.get(i) != null && i != materials.size() - 1)
            {
                result += materials.get(i) + ", ";
            }
            if(materials.get(i) != null && i == materials.size() - 1)
            {
                result += materials.get(i);
            }
        }
        return result;
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() + "\n Price: " + getPrice() + "\n Materials: " + getMaterials();
    }
}
