import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {

        int numPatron;
        int continuar;

        do {
            System.out.println("Comience la selección de patrones. Seleccione un número entre 1 y 4:");
            numPatron = ingresarNumero();
            if(numPatron <=4 ) {
                elegirPatron(numPatron);
            } else {
                System.out.println("Ingrese un número dentro del rango");
            }
            System.out.println("Quiere elegir otro patrón? Elija 1 para Sí / 2 para No");
            continuar = ingresarNumero();
        } while (continuar == 1);
            System.out.println("El programa ha finalizado");

        }

   public static void elegirPatron(int numPatron) {
   System.out.println("Ingrese un número");
    int num = ingresarNumero();
        if(numPatron == 1) {
            System.out.println("----- Patrón cuadrado -----");
            mostrarPatron1(num);
        } else if (numPatron == 2) {
            System.out.println("----- Patrón Z -----");
            mostrarPatron2(num);
        } else if (numPatron == 3) {
            System.out.println("----- Patrón X -----");
            mostrarPatron3(num);
        } else if (numPatron == 4) {
            System.out.println("----- Patrón S al revés -----");
            mostrarPatron4(num);
        }
   }

   public static void mostrarPatron1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }

    public static void mostrarPatron2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == num - (i - 1)) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }

    public static void mostrarPatron3 (int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j || i == num  - (j - 1) ||  j == num - (i - 1))  {
                    System.out.printf("X");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }

    public static void mostrarPatron4(int num) {
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if((i == 1 && j < num) || (i == num && j > 1)) {
                    System.out.printf("*");
                } else if (i > 1 && i < num && j > 1 && j < num)  {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }


    public static int ingresarNumero() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

}



