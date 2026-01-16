package Atv04.service;


import java.util.List;

import Atv04.model.Cliente;

public class ClienteService {

    private List<Cliente> clientes;

    public Cliente criarCliente (String nome, String telefone){

        Cliente c = new Cliente(nome, telefone);
        clientes.add(c);
        return c;

    }

    public void listaCliente (){
        if (!clientes.isEmpty()) {
            clientes.forEach( (c) -> c.toString());
        }
    }


    public Cliente buscarCliente(int id){
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }

    public boolean patchCliente(int id, String nome, String telefone) {

    Cliente cliente = buscarCliente(id);
    if (cliente == null) return false;

    if (nome != null && !nome.isBlank()) {
        cliente.setNome(nome);
    }

    if (telefone != null && !telefone.isBlank()) {
        cliente.setTelefone(telefone);
    }

    return true;
}
    }





}
