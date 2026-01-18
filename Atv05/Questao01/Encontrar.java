package Atv05.Questao01;

public class Encontrar {
    public static void main(String[] args) {
       Usuario usu = new Usuario("Joao","jpmaciel74@gmail.com","1234");
       AchadoPerdido AchadoP01 =new AchadoPerdido("XXX","XXX","XXX","XXX","XXX","XXX","XXX");

       AchadoP01.buscarTitulo();
       AchadoP01.vizualizarDetalhes();
    }
}