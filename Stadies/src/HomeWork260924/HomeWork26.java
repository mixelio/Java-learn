package HomeWork260924;

public class HomeWork26 {
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
    }
}
