package dobackaofront.model;

import java.util.ArrayList;

public class Ficha {

    private Aluno aluno;
    private Personal personal;
    private ArrayList<Exercicio> exercicios;
    private String dataFim;

    public Ficha(Aluno aluno, Personal personal, ArrayList<Exercicio> exercicios, String dataFim) {
        this.aluno = aluno;
        this.personal = personal;
        this.exercicios = new ArrayList<>();
        this.dataFim = dataFim;
    }

    public Ficha(Aluno aluno){
        this.aluno = aluno;
        this.personal = null;
        this.exercicios = new ArrayList<>();
        this.dataFim = "";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void adicionarExercicios(Exercicio exercicio){
        exercicios.add(exercicio);
    }

    public void removerExercicio(Exercicio exercicio){
        exercicios.remove(exercicio);
    }
}
