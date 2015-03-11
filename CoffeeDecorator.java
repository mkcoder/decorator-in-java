/**
 * Created by muhammadkhalilullah on 3/10/2015.
 */
public class CoffeeDecorator extends SimpleCoffee
{
    protected final ICoffee coffee;
    String seperator = ", ";


    public CoffeeDecorator(ICoffee coffee)
    {
        this.coffee = coffee;
    }

    public double GetPrice()
    {
        return coffee.GetPrice();
    }

    public String Order()
    {
        return coffee.Order();
    }
}
