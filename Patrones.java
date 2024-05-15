import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nr.: ");
        int nr = sc.nextInt();

        for (int i = 0; i < nr; i++) {
            if (i % 2 == 0) {
                System.out.printf("*");
            } else {
                System.out.printf(".");
            }
        }
        System.out.println();

        for (int i = 0; i <= nr + 1; i++) {
            if(i % 5 != 0) {
                System.out.printf("%d", i % 5);
            }
        }
        System.out.println();

        for (int i = 0; i < nr; i++) {
            if (i % 2 == 0) {
                System.out.print("||");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
