import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        cadastroNomeEGenero();
    }

    public static void cadastroNomeEGenero() {
        Scanner input = new Scanner(System.in);

        Map<String, String> listaDeCadastro = new HashMap<>();
        String continuarSimOuNao;

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||||||||||||      BEM VINDOS AO SISTEMA        ||||||||||||||||");
        System.out.println("|||||||||||||||         DE CADASTROS              ||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        do {
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||||||| Por favor, digite seu NOME COMPLETO |||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
            String nome = input.nextLine();

            System.out.println();

            String genero;

            while (true) {
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("|||||||||||||||| Por favor, digite seu GENERO  |||||||||||||||||||");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
                genero = input.nextLine().trim().toUpperCase();


                if (genero.equals("M") || genero.equals("MASCULINO") || genero.equals("F") || genero.equals("FEMININO")) {
                    break;
                } else {
                    System.out.println("|||||||||||||||||||||||||||||||||||");
                    System.out.println("Entrada inválida.Digite novamente");
                    System.out.println("|||||||||||||||||||||||||||||||||||");
                }


            }

            genero = genero.equals("M") || genero.equals("MASCULINO") ? "MASCULINO" : "FEMININO";
            listaDeCadastro.put(nome, genero);


            while (true) {
                System.out.println();
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("|||||||||||||||| Deseja cadastrar mais algum nome ? |||||||||||||| ");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
                continuarSimOuNao = input.nextLine().trim().toUpperCase();


                if (continuarSimOuNao.equals("S") || continuarSimOuNao.equals("SIM")) {
                    break;
                } else if (continuarSimOuNao.equals("N") || continuarSimOuNao.equals("NAO")) {
                    System.out.println();

                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||        CADASTRO        ||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||        EFETUADO        ||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                } else {
                    System.out.println();
                    System.out.println("|||||||||||||||||||||||||||||||||||");
                    System.out.println("Entrada inválida.Digite novamente");
                    System.out.println("|||||||||||||||||||||||||||||||||||");

                }
            }

        } while (continuarSimOuNao.equals("S") || continuarSimOuNao.equals("SIM"));



        while (true) {
            System.out.println();
            System.out.println("||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||||||| MENU DE OPÇÕES |||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||");
            System.out.println();
            System.out.println("1 - Imprimir todos os cadastros");
            System.out.println("2 - Imprimir somente gênero Masculino");
            System.out.println("3 - Imprimir somente gênero Feminino");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.println("||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||");
            System.out.println();
            System.out.print("Digite o número de sua escolha: ");
            System.out.print("||||  ");
            String opcaoMenu = input.nextLine().trim();
            System.out.println();


            switch (opcaoMenu) {
                case "1":
                    System.out.println();
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println("         Todos os Cadastros:          ");
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println();
                    imprimirPorGenero(listaDeCadastro, null);
                    break;

                case "2":
                    System.out.println();
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println("     Cadastros do gênero Masculino:   ");
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println();
                    imprimirPorGenero(listaDeCadastro, "MASCULINO");
                    break;

                case "3":
                    System.out.println();
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println("     Cadastros do gênero Feminino:    ");
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println();
                    imprimirPorGenero(listaDeCadastro, "FEMININO");
                    break;

                case "4":
                    System.out.println();
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println("        PROGRAMA ENCERRADO           !");
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println();

                    input.close();
                    return;

                default:
                    System.out.println();
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println("**************************************");
                    System.out.println();
                    System.out.println("             OPÇÃO INVALIDA           ");
                    System.out.println();
                    System.out.println("**************************************");
                    System.out.println("||||||||||||||||||||||||||||||||||||||");
                    System.out.println();

            }

        }
    }


    public static void imprimirPorGenero(Map<String, String> listaDeCadastro, String generoFiltro) {
        TreeMap<String, String> cadastroOrdenado = new TreeMap<>(listaDeCadastro);

        for (Map.Entry<String, String> entry : cadastroOrdenado.entrySet()) {
            String nome = entry.getKey();
            String genero = entry.getValue();

            if (generoFiltro == null || genero.equals(generoFiltro)) {
                System.out.println("Nome: " + nome + ", Gênero: " + genero);
            }
        }
    }
}
