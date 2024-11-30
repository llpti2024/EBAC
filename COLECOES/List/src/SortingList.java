import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<String>();
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");

        System.out.println("------------------------Lista Desorganizada--------------------");
        for(String manga : mangas){

            System.out.println(manga);

        }

        //Organiza sua lista
        Collections.sort(mangas);

        System.out.println("------------------------Lista Organizada--------------------");
        for(String manga : mangas){

        System.out.println(manga);

        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23D);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);
        System.out.println(dinheiros);

    }
}
