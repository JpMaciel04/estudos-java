package Atv04.model;

public class Tecnico {
    private static int cont = 0;

    EnumEquipamento especialidade;

    private int id;
    private String nome;

    public Tecnico(String nome,EnumEquipamento especialidade) {
        this.id = ++cont;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public EnumEquipamento getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EnumEquipamento especialidade) {
        this.especialidade = especialidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tecnico [especialidade=" + especialidade.getDescription() + ", nome=" + this.nome + "]";
    }

    
}
