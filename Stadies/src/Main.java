public class Main {
    public static void main(String[] args) {
        char ch = 'G';
        int in = 89;
        byte by = 4;
        short sh = 56;
        float fl = 4.7333436F;
        double dd = 4.355453532;
        long lo = 12121;

        Character cha = 'G';
        Integer i = 89;
        Byte byt = 4;
        Short sho = 56;
        Float flo = 4.7333436F;
        Double ddo = 4.355453532;
        Long lib = 12121L;

        System.out.printf("%c, %d, %d, %d, %.7f, %.9f, %d, %c, %d, %d, %d, %.7f, %.9f, %d", ch, in, by, sh, fl, dd, lo, cha, i, byt, sho, flo, ddo, lib);
        System.out.println(" ");

        int digit = 345;
        int lastDigit = 345 % 10;
        int middleDigit = ((digit - lastDigit) / 10) % 10;
        int firtsDigit = (((digit - lastDigit) / 10) - middleDigit) / 10;
        System.out.printf("Число %d -> %d, %d, %d",digit, firtsDigit, middleDigit, lastDigit);
    }
}