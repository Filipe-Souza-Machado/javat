import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua peso: ");
        Double peso = sc.nextDouble();

        System.out.print("Digite seu altura: ");
        Double altura = sc.nextDouble();

        Double IMC =  peso / (altura * 2);

        System.out.print("IMC: "+ IMC);
    
        sc.close();
    }
}