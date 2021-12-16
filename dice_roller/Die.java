public class Die {

    private int amount;
    private int numSides;


    public Die (int initAmount, int initNumSides) {
        amount = initAmount;
        numSides = initNumSides;
    }


    public int getAmount() {
        return amount;
    }

    public int getNumSides() {
        return numSides;
    }
}
