public class NonFoodItem extends Item
{
    String[] materials;

    NonFoodItem(String name, Double price, String[] materials)
    {
        super(name,price);
        this.materials = materials;
    }

    public String getMaterials() {
        String result = "";
        for (int i = 0; i < materials.length; i++)
        {
            if(materials[i] != null && i != materials.length - 1)
            {
                result += materials[i] + ", ";
            }
            if(materials[i] != null && i == materials.length - 1)
            {
                result += materials[i];
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
