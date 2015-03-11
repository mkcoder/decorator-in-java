/**
 * Created by muhammadkhalilullah on 3/8/2015.
 */
public class Creme extends CoffeeDecorator {
    public Creme(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public double GetPrice()
    {
        return super.GetPrice()+0.85;
    }

    @Override
    public String Order()
    {
        return super.Order() + seperator + "Creme ";
    }
}
