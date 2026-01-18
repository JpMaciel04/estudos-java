package Atv05.Questao01;

public class AchadoPerdido implements Publicacao{
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String localAchado, String dataHora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.localAchado = localAchado;
        this.dataHora = dataHora;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalAchado() {
        return localAchado;
    }

    public void setLocalAchado(String localAchado) {
        this.localAchado = localAchado;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
//) Crie o método visualizaDetalhes na classe AchadoPerdido. Este método deverá
//imprimir na tela os seguintes atributos: titulo, foto, local_achado, tipo e status.
//Use o JOptionPane para mostrar os dados.
    @Override
    public void vizualizarDetalhes() {
        System.out.println("Titulo: "+getTitulo()+
                " Foto:" +getFoto()+
                " Local Achado: "+getLocalAchado()+
                " Tipo: "+getTipo()+
                " Status: "+getStatus());
    }

    @Override
    public void buscarTitulo() {
        System.out.println("Titulo: "+getTitulo()+
                " Descrição: "+getDescricao()+
                " Local Achado: "+getLocalAchado());
    }
}
