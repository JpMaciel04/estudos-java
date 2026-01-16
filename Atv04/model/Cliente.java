package Atv04.model;


public class Cliente {
    private static int cont = 0;
    private int id;
    private String telefone;
    private String nome;
    
    public Cliente (String nome, String telefone){
        this.id = ++cont;
        this.nome = nome;
        this.telefone = telefone;
    }
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Cliente [telefone=" + telefone + ", nome=" + nome + "]";
    }

    


}
