import java.util.ArrayList;
import java.util.List;


public class Iterator {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<Manga>();
        mangas.add(new Manga(5L, "Attack on titan", 19.9,0));
        mangas.add(new Manga(1L, "Berserk", 9.5,5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2,0));
        mangas.add(new Manga(3L, "Pokemon", 11.2,2));
        mangas.add(new Manga(2L, "Dragon ball Z", 2.99,0));

        //REMOVER DE MANEIRA SEGURA UM ITEM DE UMA LISTA


         java.util.Iterator<Manga> mangaIterator = mangas.iterator();
         while (mangaIterator.hasNext()){
             Manga manga = mangaIterator.next();
             if(manga.getQuantidade() == 0){
                 mangaIterator.remove();
             }
         }
        System.out.println(mangas);

    }
}
