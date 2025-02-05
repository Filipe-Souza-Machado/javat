import java.util.Scanner;

public class mediaAritimetica01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o 2º numero: ");
        double n2 = sc.nextDouble();

        double mediaAritimetica = (n1 + n2) / 2;

        System.out.print("Sua media é : " +mediaAritimetica);

        sc.close();
    }
}
