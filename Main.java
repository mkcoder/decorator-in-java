import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Coffee coffee = new SimpleCoffee();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose what you would like to add to your coffee: ");
        System.out.println("1. Milk\t $1.75");
        System.out.println("2. Creme\t $0.85");
        System.out.println("3. Sugar\t $0.50");
        String userChoiceString = scanner.nextLine();
        char []userChoiceArray = userChoiceString.toCharArray();
        for ( char ignored : userChoiceArray  )
        {
            switch (ignored) {
                case '1':
                    System.out.println("Milk!");
                    coffee = new Milk(coffee);
                    break;
                case '2':
                    System.out.println("Creme!");
                    coffee = new Creme(coffee);
                    break;
                case '3':
                    System.out.println("Sugar!!");
                    coffee = new Sugar(coffee);
                    break;
                default:
            }
        }

        System.out.println("Price: " + coffee.GetPrice());
        System.out.println("Price: " + coffee.Order());
    }
}
