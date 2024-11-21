import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<PessoaFisica> pessoaFisicaLista = new ArrayList<>();
        List<PessoaJuridica> pessoaJuridicaLista = new ArrayList<>();

        int opcao;
        do {
            System.out.println("Cadastro:");
            System.out.println("1 - Pessoa Jurídica");
            System.out.println("2 - Pessoa Física");
            System.out.println("3 - Sair e Exibir Cadastros");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> pessoaJuridica(pessoaJuridicaLista);
                case 2 -> pessoaFisica(pessoaFisicaLista);
                case 3 -> {
                    System.out.println("Cadastro Finalizado!");
                    System.out.println("--- Pessoas Jurídicas Cadastradas ---");
                    for (PessoaJuridica pj : pessoaJuridicaLista) {
                        System.out.println(pj.toString());
                    }
                    System.out.println("--- Pessoas Físicas Cadastradas ---");
                    for (PessoaFisica pf : pessoaFisicaLista) {
                        System.out.println(pf);
                    }
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void pessoaFisica(List<PessoaFisica> pessoaFisicaLista) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cadastro de Pessoa Física:");

        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite a idade: ");
        Integer idade = input.nextInt();
        input.nextLine();

        System.out.print("Digite o gênero: ");
        String genero = input.nextLine();

        System.out.print("Digite o CPF: ");
        long cpf = input.nextLong();

        PessoaFisica pessoaFisica = new PessoaFisica(nome, genero, idade, cpf);
        pessoaFisicaLista.add(pessoaFisica);

        System.out.println("Pessoa Física cadastrada com sucesso!");
    }

    public static void pessoaJuridica(List<PessoaJuridica> pessoaJuridicaLista) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastro de Pessoa Jurídica:");

        System.out.print("Digite o nome do responsável: ");
        String nome = input.nextLine();

        System.out.print("Digite a idade do responsável: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Digite o gênero do responsável: ");
        String genero = input.nextLine();

        System.out.print("Digite o CNPJ: ");
        long cnpj = input.nextLong();

        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, genero, (int) cnpj, cnpj);
        pessoaJuridicaLista.add(pessoaJuridica);

        System.out.println("Pessoa Jurídica cadastrada com sucesso!");
    }
}