package Atv04.model;

public enum EnumStatusOS {
    
    ABERTO("Em aberto"),
    FAZENDO("Fazendo"),
    FEITO("Feito"),
    ESPERANDO_CLINTE("Esperando cliente buscar");

    private String description;

    private EnumStatusOS (String description) {
        this.description = description;
    }

     public String getDescription() {
        return description;
    }
}
