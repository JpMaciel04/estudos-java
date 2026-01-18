package Atv04.controller;

import Atv04.model.Cliente;
import Atv04.service.ClienteService;

public class ClienteController {

    private ClienteService clienteService;

    public void CadastrarCliente (String nome, String telefone){
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome do técnico inválido.");
            return;
        }
        if (telefone == null || telefone.isBlank()) {
            System.out.println("Telefone inválido.");
            return;
        }
        Cliente cliente = clienteService.criarCliente(nome, telefone);
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println(cliente);
    }
    public void atualizarTecnico(int id, String nome,String telefone) {

        boolean sucesso =  clienteService.patchCliente(id, nome, telefone);

        if (sucesso) {
            System.out.println("Cliente atualizado com sucesso.");
        } else {
            System.out.println("Erro ao atualizar Cliente.");
        }
    }
}
