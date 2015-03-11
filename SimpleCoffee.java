/**
 * Created by muhammadkhalilullah on 3/10/2015.
 */
public class SimpleCoffee extends Coffee
{

    @Override
    public double GetPrice() {
        return 3.75;
    }

    @Override
    public String Order() {
        return "Simple Coffee";
    }
}
