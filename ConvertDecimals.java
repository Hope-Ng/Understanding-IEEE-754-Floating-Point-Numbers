public class ConvertDecimals {

    public static String floatToIEEE754(float value) {
        int bits = Float.floatToIntBits(value);
        String binary = Integer.toBinaryString(bits);

        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        return binary;
    }

    public static void printParts(float value) {
        String bits = floatToIEEE754(value);

        String sign = bits.substring(0, 1);
        String exponent = bits.substring(1, 9);
        String fraction = bits.substring(9);

        System.out.println("Decimal: " + value);
        System.out.println("IEEE 754 binary: " + bits);
        System.out.println("Sign: " + sign);
        System.out.println("Exponent: " + exponent);
        System.out.println("Fraction: " + fraction);
    }

    public static void main(String[] args) {
        printParts(10.5f);
        System.out.println();
        printParts(0.1f);
        System.out.println();
        printParts(-7.25f);
    }
}