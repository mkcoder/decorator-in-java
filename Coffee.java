/**
 * Created by muhammadkhalilullah on 3/8/2015.
 */
public abstract class Coffee implements ICoffee
{
    static double price;
    static String order;

    public abstract double GetPrice();
    public abstract String Order();
}
