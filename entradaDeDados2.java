import java.util.Scanner;

public class entradaDeDados2 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o 2º numero: ");
        double n2 = sc.nextDouble();

        System.out.println(n1+" + " +n2+ " = "+ (n1 + n2));
        System.out.println(n1+" - " +n2+ " = "+ (n1 - n2));
        System.out.println(n1+" x " +n2+ " = "+ (n1 * n2));
        System.out.println(n1+" : " +n2+ " = "+ (n1 / n2));

        sc.close();
    }
}
