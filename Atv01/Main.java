import EmpregoFaculdade.EmpregoFaculdade;
import NotasAluno.Aluno;

class Main {
    public static void main(String[] args) {

        EmpregoFaculdade EmpregoFaculdade = new EmpregoFaculdade("Dr.Michelle", 3000, 40);


        System.out.println("Gastos totais: R$" + EmpregoFaculdade.getGastos());
        System.out.println(EmpregoFaculdade.getInfo());
    
        Aluno aluno1 = new Aluno("João", "2021001", 70.0, 75.0, 80.0, "Engenharia", 2);

        // Exibir informações do aluno
        System.out.println("Informações do Aluno:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Período: " + aluno1.getPeriodo());
        System.out.println("Notas:");
        System.out.println("AV1: " + aluno1.getNotaAV1());
        System.out.println("AV2: " + aluno1.getNotaAV2());
        System.out.println("AE: " + aluno1.getNotaAE());

        // Alterar notas do aluno
        aluno1.alteraNota01(65.0);
        aluno1.alteraNota02(45.0);

        // Avaliar o aluno
        System.out.println("\nResultado da Avaliação:");
        aluno1.avaliarAluno();
    }
}