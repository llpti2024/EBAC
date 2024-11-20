import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args)  {

        SmartphoneL3Obj s1 = new SmartphoneL3Obj("1ABC1","Iphone");
        SmartphoneL3Obj s2 = new SmartphoneL3Obj("22222","Pixel");
        SmartphoneL3Obj s3 = new SmartphoneL3Obj("33333","Samsung");

        List<SmartphoneL3Obj> smartphones = new ArrayList<>();

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for(SmartphoneL3Obj smartphone : smartphones){
            System.out.println(smartphone.toString());
        }

        //Alguém criou um smartphone a mais na sua lista e vocÊ quer saber se ele está la na Array

        //Caso ele tenha os mesmos dados que algum outro que ja existe dentro da Array como esse abaixo

        SmartphoneL3Obj s4 = new SmartphoneL3Obj("22222","Pixel");

        //Verifica o equals
        System.out.println(s4.equals(s2));
        //Usa o contains para procurar

        System.out.println(smartphones.contains(s4));

        // ELE VAI DAR VERDADEIRO

        //Caso ele tenha dados diferente de algum outro que ja existe dentro da Array como esse abaixo

        SmartphoneL3Obj s5 = new SmartphoneL3Obj("222222","Pixel");

        //Usa o contains para procurar
        System.out.println(smartphones.contains(s5));

        // ELE VAI DAR FALSE

        //Outra maneira de adicionar ele na Array colocando a posicao que voce gostaria que ele ficasse
        smartphones.add(0,s4);


        // Outro metodo para saber e usar o IndexOF

        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);













        /* List<String> nomes = new ArrayList<String>();
        List<String> nomes2 = new ArrayList<String>();

        nomes.add("Willian");
        nomes.add("Lucas");
        nomes.add("Caio");

        nomes2.add("Suane");
        nomes2.add("Gabriela");

        System.out.println(nomes2);
        System.out.println("--------------------");

        System.out.println(nomes);
        System.out.println("--------------------");

        //Adicionar todos os dados de uma lista em outra lista
        nomes.addAll(nomes2);

        System.out.println(nomes);
        System.out.println("--------------------");
        System.out.println("----REMOVENDO-----");
        //Remove o nome mais imprime ele na tela
        System.out.println(nomes.remove(0));
        //remove o nome mas somente aparece true
        System.out.println(nomes.remove("Lucas"));


        System.out.println("--------------------");
        System.out.println(nomes);


        //*Duas Maneiras  de usar o for em List.
        //*Colocando o nomes.add("Suane") dentro do for você cria uma exessao, você não pode aumentar o tamanho enquanto você está executando o for
        //*Para isso use o for de baixo, mas altere o tamanho dele

      /*  for (String nome : nomes) {
            System.out.println(nome);
            nomes.add("Suane");
        }

        System.out.println("----------------------------------------");

        nomes.add("Suane");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }*/
    }
}