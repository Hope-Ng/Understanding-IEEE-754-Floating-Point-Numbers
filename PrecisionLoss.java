public class PrecisionLoss {
    public static void main(String[] args) {
        float tiny = 1.0e-7f;
        float result = (1.0f + tiny) - 1.0f;

        System.out.println("Very small value: " + tiny);
        System.out.println("(1.0 + tiny) - 1.0 = " + result);
        System.out.println("This shows loss of precision.");
    }
}