import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int fac = 1;

        while (num != -1) {
            System.out.print("Ingrese un num: ");
            num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                fac *= i;
            }
            System.out.println(fac % 10);
        }

    }
}
