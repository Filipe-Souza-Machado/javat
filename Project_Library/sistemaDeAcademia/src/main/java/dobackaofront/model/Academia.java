package dobackaofront.model;

import java.util.ArrayList;

public class Academia {
    private String nomeAcademia;
    private String LocalizacaoAcademia;
    private String whatsappAcademia;
    private String instagrmAcademia;

    private ArrayList<Personal> personals;
    private ArrayList<Aluno> alunos;
    private  ArrayList<Exercicio> exercicios;
    private  ArrayList<Ficha> fichas;

    public Academia(String nomeAcademia) {
        this.nomeAcademia = "";
        LocalizacaoAcademia = "";
        this.whatsappAcademia = "";
        this.instagrmAcademia = "";
        this.personals = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.exercicios = new ArrayList<>();
        this.fichas = new ArrayList<>();

    }

    public String getNomeAcademia() {
        return nomeAcademia;
    }

    public void setNomeAcademia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
    }

    public String getLocalizacaoAcademia() {
        return LocalizacaoAcademia;
    }

    public void setLocalizacaoAcademia(String localizacaoAcademia) {
        LocalizacaoAcademia = localizacaoAcademia;
    }

    public String getWhatsappAcademia() {
        return whatsappAcademia;
    }

    public void setWhatsappAcademia(String whatsappAcademia) {
        this.whatsappAcademia = whatsappAcademia;
    }

    public String getInstagrmAcademia() {
        return instagrmAcademia;
    }

    public void setInstagrmAcademia(String instagrmAcademia) {
        this.instagrmAcademia = instagrmAcademia;
    }

    public ArrayList<Personal> getPersonals() {
        return personals;
    }

    public void setPersonals(ArrayList<Personal> personals) {
        this.personals = personals;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void addExercicio(Exercicio exercicio){
        exercicios.add(exercicio);
    }

    public void addPersonal(Personal personal){
        personals.add(personal);
    }

    public void addFicha(Ficha ficha){
        fichas.add(ficha);
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void removerExercio(Exercicio exercicio){
        exercicios.remove(exercicio);
    }

    public void removePersonal(Personal personal){
        personals.remove(personal);
    }

    public void removeFicha(Ficha ficha){
        fichas.remove(ficha);
    }

    @Override
    public String toString() {
        return "Academia{" +
                "nomeAcademia='" + nomeAcademia + '\'' +
                ", LocalizacaoAcademia='" + LocalizacaoAcademia + '\'' +
                ", whatsappAcademia='" + whatsappAcademia + '\'' +
                ", instagrmAcademia='" + instagrmAcademia + '\'' +
                ", personals=" + personals +
                ", alunos=" + alunos +
                ", exercicios=" + exercicios +
                ", fichas=" + fichas +
                '}';
    }
}
