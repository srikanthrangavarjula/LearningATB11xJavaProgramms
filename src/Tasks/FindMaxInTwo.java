package Tasks;

public class FindMaxInTwo {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Max value is:"+ ((num1>num2)?num1:num2));
    }
}
