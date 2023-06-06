import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        calc(str);
    }
    public static String calc(String input) {
        String[] split = input.split(" ");
        if (split.length != 3) {
            throw new ArithmeticException("В операции участвуют не 3 составляющих");
        }
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[2]);
        int z = 0;
        if (split[1].equals("+")){
            z = x + y;
        } else if (split[1].equals("-")) {
            z = x - y;
        } else if (split[1].equals("/")) {
            z = x / y;
        } else if (split[1].equals("*")) {
            z = x * y;
        }
        String str = String.valueOf(z);
        System.out.println(str);
        return str;

    }
}