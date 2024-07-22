import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) {
        int linhas;
        int colunas;
        int quantidadeNome;
        int contador =1;
        String sim = "s" ;
        Scanner input = new Scanner(System.in);
        System.out.println("Aprenda a dar Bom dia com Multiplicacao");
        System.out.println("Escolha a quantidade de pessoas que voce quer dar Bom dia e digite dois numeros que quando multiplicados deem a quantidade de pessoas");
        System.out.println("Numero 1: ");
        linhas = input.nextInt();
        System.out.println("Numero 2");
        colunas = input.nextInt();
        quantidadeNome = (linhas * colunas);
        System.out.println("Voce gostaria de dar bom dia para "+quantidadeNome+" pessoas");

        String nomesBomdia[][]  = new String[linhas][colunas];

        for (int i = 0; i < nomesBomdia.length; i++ ) {
            for (int j = 0; j < nomesBomdia[i].length; j++) {
                System.out.println("Escreva o nome da pessoa "+contador+": ");
                nomesBomdia[i][j] = input.next();
                contador = (contador + 1);
            }
        }
        System.out.println("Voce gostaria de mandar uma mensagem para eles digite S para sim e N  para nao ?");
        String resposta = input.next();
        if(resposta.equalsIgnoreCase(sim)){
            for (int i = 0; i < nomesBomdia.length; i++ ) {
                for (int j = 0; j < nomesBomdia[i].length; j++) {
                    System.out.println(" Bom Dia " + nomesBomdia[i][j] + ", Que você tenha um ótimo Dia!");
                }
            }
        } else {
            System.out.println("PROGRAMA ENCERRADO TENHA UM BOM DIA");
        }

    }
}