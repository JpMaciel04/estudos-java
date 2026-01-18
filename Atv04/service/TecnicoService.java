package Atv04.service;

import java.util.List;

import Atv04.model.EnumEquipamento;
import Atv04.model.Tecnico;

public class TecnicoService {

    private List <Tecnico> tecnicos;

    public Tecnico criarTecnico(String nome, EnumEquipamento especiaidade){

        Tecnico t = new Tecnico(nome, especiaidade);
        tecnicos.add(t);
        return t;
    }

    public void listaTecnico(){
        if(!tecnicos.isEmpty()){
            tecnicos.forEach((t) -> t.toString());
        }
    }

    public Tecnico buscaTecnico(int id){
        for (Tecnico t : tecnicos) {
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    public boolean patchTecnico(int id, String nome, EnumEquipamento especialidade){
        Tecnico tecnico = buscaTecnico(id);
        if (tecnico == null){
            return false;
        }

        boolean attComSucesso = false;

        if (nome != null && !nome.isBlank()) {
            tecnico.setNome(nome);
            attComSucesso = true;
        }

        if (especialidade != null) {
            tecnico.setEspecialidade(especialidade);
            attComSucesso = true;
        }

        return attComSucesso;
    }

}
