package Atv04.model;

public class OrdemServico {
    private static int cont = 0;
    
    private int id;
    private String desc;

    Tecnico tecnico;
    EnumEquipamento equipamento;
    EnumStatusOS statusOS;
    Cliente cliente;

    public OrdemServico (String desc, Tecnico tecnico,EnumStatusOS statusOS, Cliente cliente){
        this.id = ++cont;
        this.desc = desc;
        this.tecnico = tecnico;
        this.statusOS = statusOS;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public EnumEquipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(EnumEquipamento equipamento) {
        this.equipamento = equipamento;
    }

    public EnumStatusOS getStatusOS() {
        return statusOS;
    }

    public void setStatusOS(EnumStatusOS statusOS) {
        this.statusOS = statusOS;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public String toString() {
        return "OrdemServico [desc=" + desc + ", tecnico=" + tecnico + ", equipamento=" + equipamento + ", statusOS="
                + statusOS + ", cliente=" + cliente + "]";
    }
    

    

}
