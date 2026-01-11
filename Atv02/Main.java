package Atv02;

import Atv02.concessionaria.carro;
import Atv02.concessionaria.cliente;
import Atv02.concessionaria.transacao;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     CONCESSIONÁRIA PREMIUM MOTORS      ║");
        System.out.println("╚════════════════════════════════════════╝\n");

       
        cliente cliente1 = new cliente("João Silva", "Rua das Flores, 123", "12345678900", "(11) 98765-4321");
        cliente cliente2 = new cliente("Maria Santos", "Avenida Paulista, 1000", "98765432100", "(11) 91234-5678");

        
        GregorianCalendar cal1 = new GregorianCalendar(2022, 0, 1);
        carro carro1 = new carro("Ferrari", "F8 Tributo", cal1.getTime(), 1500000.00);
        
        GregorianCalendar cal2 = new GregorianCalendar(2024, 5, 15);
        carro carro2 = new carro("BMW", "M440i xDrive", cal2.getTime(), 450000.00);
        
        GregorianCalendar cal3 = new GregorianCalendar(2021, 5, 15);
        carro carro3 = new carro("Tesla", "Model S Plaid", cal3.getTime(), 550000.00);

       
        ArrayList<transacao> transacoes = new ArrayList<>();

        
        System.out.println(" CLIENTES CADASTRADOS:");
        System.out.println("─────────────────────────────────────────");
        exibirCliente(cliente1);
        exibirCliente(cliente2);

        
        System.out.println("CATÁLOGO DE CARROS:");
        System.out.println("─────────────────────────────────────────");
        exibirCarro(carro1);
        exibirCarro(carro2);
        exibirCarro(carro3);

        
        System.out.println(" PROCESSANDO VENDAS:");
        System.out.println("─────────────────────────────────────────");

        
        transacao venda1 = new transacao(cliente1.getNome(), carro1.getNome(), carro1.getValor());
        transacoes.add(venda1);
        System.out.println("✓ Venda realizada!");
        exibirTransacao(venda1);

       
        transacao venda2 = new transacao(cliente2.getNome(), carro3.getNome(), carro3.getValor());
        transacoes.add(venda2);
        System.out.println("\n Venda realizada!");
        exibirTransacao(venda2);

       
        System.out.println("\n ATUALIZAÇÕES:");
        System.out.println("─────────────────────────────────────────");
        cliente1.setTelefone("(11) 99999-9999");
        cliente1.setEndereco("Avenida Brigadeiro Faria Lima, 500");
        System.out.println("Cliente atualizado:");
        exibirCliente(cliente1);

        
        System.out.println("\nDesconto aplicado ao BMW:");
        double novoPreco = carro2.getValor() * 0.90;
        carro2.setValor(novoPreco);
        System.out.printf("Novo valor: R$ %.2f%n", carro2.getValor());

        
        System.out.println("\n RESUMO FINANCEIRO:");
        System.out.println("─────────────────────────────────────────");
        double totalVendas = 0;
        for (transacao t : transacoes) {
            totalVendas += t.getValor();
        }
        System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
        System.out.printf("Quantidade de transações: %d%n", transacoes.size());
        System.out.printf("Venda média: R$ %.2f%n", totalVendas / transacoes.size());

        System.out.println("\n╚════════════════════════════════════════╝");
    }

    
    private static void exibirCliente(cliente c) {
        System.out.printf("  Nome: %s%n", c.getNome());
        System.out.printf("  Documento: %s%n", c.getDocumento());
        System.out.printf("  Endereço: %s%n", c.getEndereco());
        System.out.printf("  Telefone: %s%n\n", c.getTelefone());
    }

   
    private static void exibirCarro(carro car) {
        System.out.printf("  %s %s%n", car.getMarca(), car.getNome());
        System.out.printf("  Ano: %tY | Valor: R$ %.2f%n\n", car.getAnoFrabicacao(), car.getValor());
    }

    
    private static void exibirTransacao(transacao t) {
        System.out.printf("  Cliente: %s%n", t.getCliente());
        System.out.printf("  Veículo: %s%n", t.getCarro());
        System.out.printf("  Valor: R$ %.2f%n\n", t.getValor());
    }
}