import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 1, count = 0; count < a; i +=2, count++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
