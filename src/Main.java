import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency =  NumberFormat.getCurrencyInstance();
        String result = currency.format(123445345.23423);
        System.out.println(result);
    }
}