import java.util.Scanner;

public class SistemaControleFluxo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Notas notas = new Notas();
        Aluno aluno = new Aluno();

        System.out.println("Você gostaria de cadastrar a média dos alunos ? Responda 'Sim' ou 'Nao'");
        String continuar = input.next();

        while(continuar.equalsIgnoreCase("sim")){

        aluno.cadastro();
        notas.cadastroNotas();
            System.out.println(aluno.toString());
            notas.media();

        System.out.println("Gostaria de continuar? Sim ou Nao");
        continuar = input.next();

        }
        System.out.println("Encerrando sistema de cadastro");
    }
}