import java.util.Scanner;

public class calcForca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Força: ");
        Double n1 = sc.nextDouble();

        System.out.print("Distancia: ");
        Double n2 = sc.nextDouble();

        System.out.print("Força de trabalho: "+(n1 * n2));
    
        sc.close();
    }
}
