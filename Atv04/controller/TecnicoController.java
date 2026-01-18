package Atv04.controller;

import Atv04.model.EnumEquipamento;
import Atv04.model.Tecnico;
import Atv04.service.TecnicoService;

public class TecnicoController {
    private TecnicoService tecnicoService;

    public TecnicoController (TecnicoService tecnicoService){
        this.tecnicoService = tecnicoService;
    }

    public void cadastrarTecnico (String nome, EnumEquipamento especialidade){
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome do técnico inválido.");
            return;
        }

        Tecnico tecnico = tecnicoService.criarTecnico(nome, especialidade);

        System.out.println("Técnico cadastrado com sucesso!");
        System.out.println(tecnico);
    }

     public void atualizarTecnico(int id, String nome, EnumEquipamento especialidade) {

        boolean sucesso = tecnicoService.patchTecnico(id, nome, especialidade);

        if (sucesso) {
            System.out.println("Técnico atualizado com sucesso.");
        } else {
            System.out.println("Erro ao atualizar técnico.");
        }
    }

}
