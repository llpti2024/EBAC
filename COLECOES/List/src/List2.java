import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
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