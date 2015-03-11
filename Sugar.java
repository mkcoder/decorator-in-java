/**
 * Created by muhammadkhalilullah on 3/8/2015.
 */
public class Sugar extends CoffeeDecorator
{
    public Sugar(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public double GetPrice()
    {
        return super.GetPrice()+0.50;
    }

    @Override
    public String Order()
    {
        return super.Order() + seperator + "Sugar ";
    }
}
