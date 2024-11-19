import java.util.Scanner;


public class ControleFluxo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Você gostaria de verificar a média dos alunos ? Responda 'Sim' ou 'Nao'");
    String continuar = input.next();

        while(continuar.equalsIgnoreCase("sim")){

        double soma = 0;

        System.out.println("Quantas notas tivemos esse período?");
        int num = input.nextInt();

        for (int  i = 1 ; i <= num ; i++ ) {

            System.out.println("Qual o valor da nota número " + i + " ? ");
            double nota = input.nextDouble();
            soma = nota + soma;
        }

        double media = soma/num;

        System.out.println("========================================");
        System.out.println("A média do seu aluno final foi " + media );

        if (media >= 7 ) {
            System.out.println("Você está de APROVADO");
        }else if(media >=5){
            System.out.println("Você está de RECUPERAÇÃO");
        }else {
            System.out.println("Você está de REPROVADO");
        }

        System.out.println("========================================");
        System.out.println("Gostaria de continuar ? responda 'Sim' ou 'Nao'");
        String gostaria = input.next();
            /*System.out.println("Gostaria de continuar? Sim ou Nao");
            continuar = s.next();*/
            if(gostaria.equalsIgnoreCase("nao")){
            break;
            }
        }
}
}