import java.util.Scanner;



public class Notas implements CadastroNotas {
    private double soma;
    private double nota;
    private int num;
    Aluno aluno = new Aluno();

    @Override
    public void cadastroNotas() {



        System.out.println("Quantas notas tivemos esse período?");
        setNum(input.nextInt());


        for (int  i = 1 ; i <= getNum() ; i++ )
        {

            System.out.println("Qual o valor da nota número " + i + " ? ");
            setNota(input.nextDouble());
            setSoma(getNota() + getSoma());
        }


        }

    @Override
     public void media() {
    double media = getSoma() / getNum();
        System.out.println("======================================================\n");
        System.out.println("A média do aluno foi " + media);

    if (media >= 5) {
            System.out.println("O aluno está de ||RECUPERAÇÃO||");
    } else if (media >= 7) {
            System.out.println("O aluno está de ||APROVADO||");
    } else {
            System.out.println("O aluno está de ||REPROVADO||");

    }
    System.out.println("\n======================================================\n");

}
    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
