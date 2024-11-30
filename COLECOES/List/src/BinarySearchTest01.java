import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // (-(ponto de insercao) -1)
        //index 0,1,2,3,4
        //value 0,2,3,4
        //Precisa estar ordenada para funcionar
        Collections.sort(numeros);

        System.out.println(Collections.binarySearch(numeros,2));
        //Retorna positivo se achar
        System.out.println(Collections.binarySearch(numeros,1));
        //Retorna negativo se nao achar e retorna um valor que se você fizer a formula de ponto de insercao vai achar a posicao que ele deveria estar

        numeros.add(1,1);
        System.out.println(Collections.binarySearch(numeros,1));

        System.out.println("*******************************************************************************************************************");

        //***********************************************************************************************************************************************

        List<Manga> mangas = new ArrayList<Manga>();
        mangas.add(new Manga(5L, "Attack on titan", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99));
        Collections.sort(mangas);

        mangas.sort( new MangaByIdComparator());

        for(Manga manga : mangas) {
            System.out.println(manga);
        }


        Manga mangaToSearch = new Manga(2L, "Dragon ball Z", 2.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));


    }
}
