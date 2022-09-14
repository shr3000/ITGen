import java.io.BufferedReader;
import java.io.InputStreamReader;

public class USDtoBitok {
    private static double priceBTC;
    private static double cache;
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("What is Bitcoin price today?");
            try {
                priceBTC = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid price!");;
            }
        }
        while (true){
            System.out.println("How much $ do you have?");
            try {
                cache = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid amount of money!");;
            }
        }
        calculation();
    }
    public static void calculation () {
        double sum = cache / priceBTC;
        System.out.println("You can buy " + sum + " BTC");
    }
}

