package Atv04.service;

import java.util.List;

import Atv04.model.Cliente;
import Atv04.model.EnumStatusOS;
import Atv04.model.OrdemServico;
import Atv04.model.Tecnico;

public class OrdemServicoService {

    private List<OrdemServico> ordensServicos;

    public OrdemServico criaOrdemServico (String desc, Tecnico tecnico,EnumStatusOS statusOS, Cliente cliente){
        OrdemServico os = new OrdemServico(desc, tecnico, statusOS, cliente);
        ordensServicos.add(os);
        return os;
    }

    public void listaOrdemServico(){
        if (!ordensServicos.isEmpty()) {
            ordensServicos.forEach((os) -> os.toString());
        }
    }

    public OrdemServico buscarOrdemServico(int id){
        for (OrdemServico  os : ordensServicos) {
            if (os.getId() == id){
                return os;
            }
        }
        return null;
    }

    public boolean patchCliente(int id, String desc, Tecnico tecnico,EnumStatusOS statusOS, Cliente cliente) {

    OrdemServico os = buscarOrdemServico(id);
    if (os == null) {
        return false;
    }
    
    if (desc != null && !desc.isBlank()) {
        os.setDesc(desc);
        return false;
    }

    if (tecnico != null) {
        os.setTecnico(tecnico);
        return false;
    }
    if (statusOS != null){
        os.setStatusOS(statusOS);
    }
    if(cliente != null)
        os.setCliente(cliente);

    return true;
}
}



