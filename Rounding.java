import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("2.675");

        System.out.println("Original value: " + value);
        System.out.println("Round up or normal rounding: " + value.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Round to the nearest even number: " + value.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println("Round towards zero: " + value.setScale(2, RoundingMode.DOWN));
        System.out.println("Round away from zero: " + value.setScale(2, RoundingMode.UP));
    }
}