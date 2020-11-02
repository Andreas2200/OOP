import java.time.LocalDateTime;
import java.util.Date;

public class FoodItem extends Item
{
    private Date expires;

    FoodItem(String name, double price, Date expireDate)
    {
        super(name,price);
        expires = expireDate;
    }

    public Date getExpires() {
        return expires;
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() + "\n Price: " + getPrice() + "\n Expires: " + getExpires();
    }

    @Override
    public boolean isExpired() {
        return expires.compareTo(new Date()) < 0;
    }
}
