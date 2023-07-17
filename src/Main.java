
public class Main {

    public static String decimalToAnyBase(int A, int B){
        String result = "";
        while (A > 0){
            result += A%B;
            A /= B;
        }
        StringBuilder stringBuilder = new StringBuilder(result);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToAnyBase(4, 2));
    }
}