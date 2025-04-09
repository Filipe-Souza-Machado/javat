package dobackaofront;

import dobackaofront.model.Academia;
import dobackaofront.model.Exercicio;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia("Do back ao front");

        Exercicio exercicio1 = new Exercicio();
        academia.addExercicio(exercicio1);

        Exercicio exercicio2 = new Exercicio();
        academia.addExercicio(exercicio2);

        Exercicio exercicio3 = new Exercicio();
        academia.addExercicio(exercicio3);

        Exercicio exercicio4 = new Exercicio();
        academia.addExercicio(exercicio4);
    }
}