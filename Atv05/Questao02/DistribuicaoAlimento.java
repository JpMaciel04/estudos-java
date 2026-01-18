package Atv05.Questao02;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimento;
    private float  qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInico, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInico, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }


    @Override
    public boolean validaProjeto() {
        if (getDataFim()=="")
            return true;
        else
            return false;
    }

    @Override
    public String imprimeProjeto() {
        return  ("Nome do Projeto: "+getNomeProjeto()+"Descrição: "+getDescricao()+
                "Data Inicio: "+getDataInico()+"Data Fim"+getDataFim()+"Descricao do Alimento :"+getDescAlimento()+
                "Quantidade:"+getQtde());

    }
}

