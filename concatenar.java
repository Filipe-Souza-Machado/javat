import java.util.Scanner;

public class concatenar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                System.out.print("Digite a 1º palavra: ");
                String p1 = sc.next();

                System.out.print("Digite a 2º palavra: ");
                String p2 = sc.next();

                System.out.print(p1 +" "+ p2);

                sc.close();
    }
}
