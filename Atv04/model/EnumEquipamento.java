package Atv04.model;

public enum EnumEquipamento {

    COMPUTADOR("Computador"),
    NOTEBOOK("NoteBook"),
    CELULAR("Celular");

    private String description;

    private EnumEquipamento (String description) {
        this.description = description;
    }

     public String getDescription() {
        return description;
    }
}
