import java.util.Random;

public class Roll {
    public Roll() {
        Die die = new Die(Main.amount, Main.sides);
        Random rand = new Random();

        int result = rand.nextInt(die.getNumSides());
        result += 1;

        System.out.println(result);
    }
}
