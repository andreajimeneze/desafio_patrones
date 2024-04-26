import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Patrones {
    public static void main(String[] args) {
    // Patrón 1
        int num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if(i%2 == 1) {
                System.out.printf("*");
            } else {
                System.out.printf(".");
            }

        }
        System.out.println("\n");

    // Patrón 2
        int num2 = 0;

        System.out.println("Ingrese un número");
        num2 = sc.nextInt();

        for (int i = 1; i <= num2; i++) {
            for(int j = 1; j <=4; j++){
                System.out.print(j);
            }

        }
        System.out.println("\n");

    // Patrón 3
        int num3 = 0;

//        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num3 = sc.nextInt();

        for (int i = 1; i <= num3; i++) {
            if(i%3 == 0) {
                System.out.printf("*");
            } else {
                System.out.printf("|");
            }
        }
    }
}