import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        int id,estoque;

        String produto;

        double preco;

        System.out.println("Digite ID : ");
        id = ler.nextInt();

        System.out.println("Digite o Estoque inicial : ");
        estoque = ler.nextInt();

        System.out.println("Digite o nome Produto : ");
        produto = ler.nextLine();
        produto = ler.nextLine();

        System.out.println("Digite o Preço : ");
        preco = ler.nextDouble();
        estoque e1 = new estoque(id,produto,estoque,preco);

        System.out.println("Digite a qtde para acrescentar: ");
        int qtde = ler.nextInt();
        e1.acrescimoEstoque(qtde);

        System.out.println("Digite a qtde para baixar : ");
        qtde = ler.nextInt();
        e1.baixaEstoque(qtde);

        System.out.println(e1.consultaEstoque());

       estoque e2 = new estoque(2,"Feijao",10,5.65);
       estoque e3 = new estoque(3,"Açucar",10,16);

        e3.acrescimoEstoque(100);
        System.out.println(e1.consultaEstoque());

        e2.baixaEstoque(7);
        System.out.println(e2.consultaEstoque());
        System.out.println(e3.consultaEstoque());
        System.out.println(e3.totalEstoque());

        ler.close();

    }
}