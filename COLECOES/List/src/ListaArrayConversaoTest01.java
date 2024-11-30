import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {

        //Modo 1 para converter List para Array

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("*****************************************************************");


        // MODO 1 de converter Array para List

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);

        //Nessa situacao aqui adicionamos o Array na List mas ocorre que quando usamos o .set ele ao inves de adicionar somente na lista ele adiciona na array
        //e quando usamos o .add ele da uma Exception.

        //arrayToList.set(0,12);
        //arrayToList.add(19);

        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("*****************************************************************");

        //Modo 2 para fazer Array para List
        //Esse sem dar o problema acima e permitir editar a lista depois de convertida sem alterar o Array

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));

        numerosList.add(19);
        numerosList.set(0,12);

        System.out.println(Arrays.toString(numerosArray));
        System.out.println(numerosList);



    }
}
