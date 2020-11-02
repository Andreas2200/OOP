public abstract class Item implements Expirable
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

    @Override
    public boolean isExpired() {
        throw new UnsupportedOperationException("Itemdoes not support this operation.");
    }
}
