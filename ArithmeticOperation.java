public class ArithmeticOperation {

    public static String floatToIEEE754(float value) {
        int bits = Float.floatToIntBits(value);
        String binary = Integer.toBinaryString(bits);

        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        return binary;
    }

    public static void main(String[] args) {
        float a = 0.1f;
        float b = 0.2f;
        float sum = a + b;

        float c = 1.0f;
        float d = 3.0f;
        float division = c / d;

        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("IEEE 754: " + floatToIEEE754(sum));
        System.out.println();

        System.out.println("1.0 / 3.0 = " + division);
        System.out.println("IEEE 754: " + floatToIEEE754(division));
        System.out.println();

    }
}