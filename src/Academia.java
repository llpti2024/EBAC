import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Academia {
    public static void main(String args[]) {
        System.out.println("Olá, Bom dia digite se você quer pão ou bolo");
        Alunos alunos = new Alunos();
        alunos.setCafeDaManha("pão");
        alunos.setNome("Você escolheu pão");
        System.out.println(alunos.getCafeDaManha());
        System.out.println(alunos.getNome());
        System.out.println("Gostaria de quantos Cafés ?");
        alunos.setCafe(3);
        System.out.println(alunos.getCafe());
        System.out.println("Muito Obrigado! Tenha um Bom Dia!");


    }
}