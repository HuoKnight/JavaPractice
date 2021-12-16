public class Main {
    public static int sides;
    public static int amount;

    public static void main(String[] args) {
        String[] argSplit = args[0].split("d", 2);
        String arg1 = argSplit[0];
        String arg2 = argSplit[1];
        System.out.println("Roll " + arg1 + " d" + arg2 + "s.");

        amount = Integer.parseInt(arg1);
        sides = Integer.parseInt(arg2);

        new Roll();
    }
}


