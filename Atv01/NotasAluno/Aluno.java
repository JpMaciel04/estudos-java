package NotasAluno;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public double getNotaAE() {
        return notaAE;
    }

    public void setNotaAE(double notaAE) {
        this.notaAE = notaAE;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, double notaAE, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
        this.curso = curso;
        this.periodo = periodo;
    }

    

    public void alteraNota01(double notaNova){
        this.notaAV1 = notaNova;
    }
    public void alteraNota02(double notaNova){
        this.notaAV2 = notaNova;
    }
    public void alteraNotaAE(double notaNova){
        this.notaAE = notaNova;
    }
    public void avaliarAluno(){
        double somaNotas = notaAV1+notaAV2;
        if (somaNotas>=60){
            System.out.println(nome+"FOI APROVADO");
        }
        else {
            System.out.println(nome+"FOI REPROVADO");
        }
    }

    public void avaliarRec(){
        double valorNotaAE = (notaAV1+notaAV2+notaAE)/3;
        if (valorNotaAE>=60){
            System.out.println(nome+ "FOI APROVADO");
        }
        else{
            System.out.println(nome+ "FOI REPROVADO");
        }
    }

}