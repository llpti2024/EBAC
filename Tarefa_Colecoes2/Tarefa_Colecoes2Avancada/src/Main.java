import java.util.*;

public class Main {
    public static void main(String[] args) {
        cadastro();
    }


    public static void cadastro() {
        Scanner input = new Scanner(System.in);
        String continuarSimOuNao;
        String nome;
        Integer idade;
        String genero;
        String estado;
        String cidade;
        String cep;
        String pais;

        Map<Integer, Pessoa> pessoasMap = new HashMap<>();
        int idCounter = 1;

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
            nome = input.nextLine();

            System.out.println();


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


            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||||||||| Por favor, digite sua IDADE  ||||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            idade = input.nextInt();
            input.nextLine();


            System.out.println();
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||||||||| Por favor, digite seu PAÍS    |||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
            pais = input.nextLine();

            System.out.println();
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||||||||| Por favor, digite seu Estado    |||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
            estado = input.nextLine();

            System.out.println();
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||||||||| Por favor, digite seu Cidade   |||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
            cidade = input.nextLine();

            System.out.println();
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||||||||||||| Por favor, digite seu CEP    |||||||||||||||||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
            cep = input.nextLine();


            Pessoa pessoa = new Pessoa(nome, idade, genero, estado, cidade, cep, pais) {
            };
            pessoasMap.put(idCounter, pessoa);
            idCounter++;


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

        exibirMenu(pessoasMap);
    }


    public static void exibirMenu(Map<Integer, Pessoa> pessoasMap) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU DE FILTRAGEM:");
            System.out.println("1. Exibir por Gênero");
            System.out.println("2. Exibir por Idade");
            System.out.println("3. Exibir por Estado");
            System.out.println("4. Exibir por Cidade");
            System.out.println("5. Exibir por País");
            System.out.println("6. Exibir Todos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> exibirPorCategoria(pessoasMap, "genero");
                case 2 -> exibirPorCategoria(pessoasMap, "idade");
                case 3 -> exibirPorCategoria(pessoasMap, "estado");
                case 4 -> exibirPorCategoria(pessoasMap, "cidade");
                case 5 -> exibirPorCategoria(pessoasMap, "pais");
                case 6 -> exibirTodos(pessoasMap);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    public static void exibirPorCategoria(Map<Integer, Pessoa> pessoasMap, String categoria) {
        System.out.println("\nExibindo pessoas por: " + categoria.toUpperCase());
        for (Map.Entry<Integer, Pessoa> entry : pessoasMap.entrySet()) {
            Pessoa pessoa = entry.getValue();
            switch (categoria) {
                case "genero" -> System.out.println("ID: " + entry.getKey() + "Nome: " + pessoa.getNome() + " Gênero: " + pessoa.getGenero());
                case "idade" -> System.out.println("ID: " + entry.getKey() + "Nome: " + pessoa.getNome() +  " | Idade: " + pessoa.getIdade());
                case "estado" -> System.out.println("ID: " + entry.getKey() + "Nome: " + pessoa.getNome() +  " | Estado: " + pessoa.getEstado());
                case "cidade" -> System.out.println("ID: " + entry.getKey() + "Nome: " + pessoa.getNome() +  " | Cidade: " + pessoa.getCidade());
                case "pais" -> System.out.println("ID: " + entry.getKey() + "Nome: " + pessoa.getNome() +  " | País: " + pessoa.getPais());
            }
        }
    }

    public static void exibirTodos(Map<Integer, Pessoa> pessoasMap) {
        System.out.println("\nExibindo todos os cadastros:");
        for (Map.Entry<Integer, Pessoa> entry : pessoasMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
        }
    }
}














