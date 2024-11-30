import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Willian");
        nomes.add("Lucas");

        //*Duas Maneiras  de usar o for em List.

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------------------------------------");

        nomes.add("Suane");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}