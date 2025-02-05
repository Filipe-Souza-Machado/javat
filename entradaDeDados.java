import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Digite sua idade");
        String idade = sc.next();

        System.out.println("ola "+nome+" você tem "+idade+ "anos.");
       
        sc.close();
    }
}
