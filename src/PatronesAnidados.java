import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {

        int num = ingresarNumero();
//        mostrarPatron1(num);
//        mostrarPatron2(num);
//        mostrarPatron3(num);
//        mostrarPatron4(num);
          mostrarPatron5(num);
    }

//    public static void elegirPatron() {
//        Scanner sc = new Scanner(System.in);
//
//    }

    public static void mostrarPatron5(int num) {
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
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == num || j == 1 || i > 1 && i < num || j >= num - 1) {
                    System.out.printf("*");
                } else if (i == num && j == i) {
                    System.out.printf("");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
            }

                }




    public static int ingresarNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();
        return num;
    }

}



