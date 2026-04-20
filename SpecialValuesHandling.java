public class SpecialValuesHandling {

    public static String floatToIEEE754(float value) {
        int bits = Float.floatToIntBits(value);
        String binary = Integer.toBinaryString(bits);

        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        return binary;
    }

    public static void main(String[] args) {
        float positiveInfinity = 1.0f / 0.0f;
        float negativeInfinity = -1.0f / 0.0f;
        float nanValue = 0.0f / 0.0f;

        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("IEEE 754: " + floatToIEEE754(positiveInfinity));
        System.out.println("Is infinite? " + Float.isInfinite(positiveInfinity));
        System.out.println();

        System.out.println("Negative Infinity: " + negativeInfinity);
        System.out.println("IEEE 754: " + floatToIEEE754(negativeInfinity));
        System.out.println("Is infinite? " + Float.isInfinite(negativeInfinity));
        System.out.println();

        System.out.println("NaN: " + nanValue);
        System.out.println("IEEE 754: " + floatToIEEE754(nanValue));
        System.out.println("Is NaN? " + Float.isNaN(nanValue));
        System.out.println("NaN == NaN ? " + (nanValue == nanValue));
    }
}