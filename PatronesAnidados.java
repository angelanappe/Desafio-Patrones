import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 4 para seleccionar un patrón, donde:\n 1: Cuadrados\n 2: Z\n 3: X\n 4: Helicoidal\n Elija su opción: ");
        int nr = sc.nextInt();

        switch (nr) {
            case 1:
                System.out.println("Ingrese el tamaño del patrón Cuadrado: ");
                int tamanioC = sc.nextInt();
                patronC(tamanioC);
                break;
            case 2:
                System.out.println("Ingrese el tamaño del patrón Z:");
                int tamanioZ = sc.nextInt();
                patronZ(tamanioZ);
                break;
            case 3:
                System.out.println("Ingrese el tamaño del patrón X:");
                int tamanioX = sc.nextInt();
                patronX(tamanioX);
                break;
            case 4:
                System.out.println("Ingrese el número de vueltas para el patrón helicoidal:");
                int tamanioH = sc.nextInt();
                patronH(tamanioH);
                break;
            default:
                System.out.println("Número de patrón no válido. Por favor, seleccione un número del 1 al 3.");
        }
    }

    //fx para el patron de cuadrado vacío
    public static void patronC(int tamanio) {
        for (int i = 0; i < tamanio; i++) {  //filas
            for (int j = 0; j < tamanio; j++) { // columnas
                if (i == 0 || i == tamanio - 1) {
                    System.out.printf("*");
                } else if (j == 0 || j == tamanio - 1) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    //fx para patrón de Z
    public static void patronZ(int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == tamanio - 1 || j == tamanio - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // fx para el patrón de X
    public static void patronX(int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (j == i || j == tamanio - 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // fx para patrón """helicoidal"""
    public static void patronH(int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < tamanio - 1; i++) {
            System.out.print(" ");
            for (int j = 1; j < tamanio - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.print(" ");

        for (int i = 1; i < tamanio; i++) {
            System.out.print("*");
        }
        System.out.println("*");
    }

}
