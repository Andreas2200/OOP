public class Item
{
    private String name;
    private double price;

    Item (String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
