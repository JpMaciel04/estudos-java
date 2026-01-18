package Atv04.controller;

import Atv04.model.Cliente;
import Atv04.model.EnumStatusOS;
import Atv04.model.OrdemServico;
import Atv04.model.Tecnico;
import Atv04.service.OrdemServicoService;

public class OrdemServicoController {
    
    private OrdemServicoService ordemServicoService;

    public OrdemServicoController (OrdemServicoService ordemServicoService){
        this.ordemServicoService = ordemServicoService;
    }

    public void cadastrarOrdemServico (String desc, Tecnico tecnico,EnumStatusOS statusOS, Cliente cliente){

            OrdemServico os = ordemServicoService.criaOrdemServico(desc, tecnico, statusOS, cliente);

            if (os == null) {
                System.out.println("Erro ao criar Ordem de Serviço.");
            return;
            }

        System.out.println("OS criada com sucesso:");
        System.out.println(os);
    }

    public void atualizarOrdemServico(int Id, String desc, Tecnico tecnico,EnumStatusOS statusOS, Cliente cliente){

        boolean atualizadoComSucesso = ordemServicoService.patchOrdemServico( Id, desc,  tecnico, statusOS,  cliente);
        
        if (atualizadoComSucesso) {
            System.out.println("Atualizado com sucesso");
        } else{
            System.out.println("Não foi possível atualizar o status");
        }
    }

}
