public class Roll {
    public static void main(String[] args) {
        String[] argSplit = args[0].split("d", 2);
        String arg1 = argSplit[0];
        String arg2 = argSplit[1];
        System.out.println("Roll " + arg1 + " d" + arg2 + "s.");
    }
}


