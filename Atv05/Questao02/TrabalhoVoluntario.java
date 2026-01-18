package Atv05.Questao02;

public class TrabalhoVoluntario extends Projeto{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInico, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInico, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;

    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto()  {
        if (getDuracaoTrabalho()>2)
            return true;
        else
            return false;

    }

    public String imprimeProjeto(){
        return
                ("Nome do Projeto: "+getNomeProjeto()+"Descrição: "+getDescricao()+
                        "Data Inicio: "+getDataInico()+"Data Fim"+getDataFim()+"Tipo do Trabalho :"+getTipoTrabalho()+
                        "Duração Trabalho: "+getDuracaoTrabalho());

    }
}

