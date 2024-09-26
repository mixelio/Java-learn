package HomeWork260924;

public class HomeWork26 {
    public static int addition (int a, int b) {
        return a + b;
    };
    public static int substruction (int a, int b) {
        return a - b;
    };
    public static int multiplication (int a, int b) {
        return a * b;
    };
    public static double divide (int a, int b) {
        return a / b;
    };

    public static void main(String[] args) {
        String myString = new String("I study Basic Java!");
        System.out.println(myString.charAt(myString.length() - 2));
        if (myString.contains("Java")) {
            System.out.println("string Java exist");
        }
        String cutJava = myString.substring(myString.length() - 5, myString.length() -1);
        System.out.println(cutJava);
        System.out.println(myString.replace("a", "o"));
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());

        int x = 25;
        int y = 5;

        System.out.println(addition(x, y));
        System.out.println(substruction(x, y));
        System.out.println(multiplication(x, y));
        System.out.println(divide(x, y));
    }
}
