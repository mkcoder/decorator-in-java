/**
 * Created by muhammadkhalilullah on 3/8/2015.
 */
public class Milk extends CoffeeDecorator
{
    public Milk(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public double GetPrice()
    {
        return super.GetPrice()+1.75;
    }

    @Override
    public String Order()
    {
        return super.Order() + seperator + "Milk ";
    }


}
