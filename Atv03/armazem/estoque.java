

public class estoque {

    private int id;
    private String produto;
    private int estoque;
    private double preco;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public estoque(int id, String produto, int estoque, double preco) {
        this.id = id;
        this.produto = produto;
        this.estoque = estoque;
        this.preco = preco;
    }
    public void acrescimoEstoque(int qtde){
        estoque += qtde;
    }

    public void baixaEstoque(int qtde){
        if (qtde <= estoque)
            estoque -= qtde;
    }

    public double totalEstoque(){
        return estoque * preco;
    }

    public String consultaEstoque() {
        return "Produto: " + produto + "\nEstoque: " + estoque + "\nPreço: " + preco;
    }

}