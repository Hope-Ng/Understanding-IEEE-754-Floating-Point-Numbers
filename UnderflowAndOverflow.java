public class UnderflowAndOverflow {

    public static String floatToIEEE754(float value) {
        int bits = Float.floatToIntBits(value);
        String binary = Integer.toBinaryString(bits);

        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        return binary;
    }

    public static void main(String[] args) {
        float big = 3.4e38f;
        float overflow = big * 10.0f;

        float small = 1.4e-45f;
        float underflow = small / 10.0f;

        System.out.println("Big value: " + big);
        System.out.println("Overflow result: " + overflow);
        System.out.println("IEEE 754: " + floatToIEEE754(overflow));
        System.out.println();

        System.out.println("Small value: " + small);
        System.out.println("Underflow result: " + underflow);
        System.out.println("IEEE 754: " + floatToIEEE754(underflow));
    }
}