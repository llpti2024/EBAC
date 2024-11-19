import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("*****Lista de Nomes impressa em uma Array*****");
        listaDeNomesSimples();
        System.out.println("");
        System.out.println("*****Lista de Nomes impressa em Lista organizada*****");
        listaDeNomesList();
        System.out.println("");
        System.out.println("*****Lista de Nomes impressa em Lista com adição de dados organizada*****");
        listaDeNomesListInput();
        System.out.println("*****Lista de Nomes e Generos Separados por genero *****");
        listaDeNomesEGeneros();
        System.out.println("");
        System.out.println("*****Lista de Nomes e Generos Separados por genero com adição de dados*****");
        listaDeNomesEGenerosInput();


        listaDeNomesEGenerosInput();
    }

    private static void listaDeNomesList() {
        String texto = "Alex, Jefferson, Gabriel, Marcio, Renato, Bruno, Iago, Wellington";
        String[] valoresArray = texto.split(",");
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < valoresArray.length; i++) {
            lista.add(valoresArray[i].trim());

        }

        Collections.sort(lista);
        System.out.println(lista);


    }
    private static void listaDeNomesListInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("*******Digite NOME de pessoas separadas por , (Virgula) : ******* ");
        String texto = input.nextLine();

        String[] valoresArray = texto.split(",");
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < valoresArray.length; i++) {
            lista.add(valoresArray[i].trim());

        }

        Collections.sort(lista);
        System.out.println(lista);


    }



    private static void listaDeNomesSimples() {
        String texto = "Alex, Jefferson, Gabriel, Marcio, Renato, Bruno, Iago, Wellington";
        String[] valoresArray = texto.split(",");

        for (int i = 0; i < valoresArray.length; i++) {
            System.out.println(valoresArray[i]);

        }
    }


    private static void listaDeNomesEGeneros() {
            String texto = "Alex - M, Jefferson - M, Gabriel - M, Marcio - M, Alice - F, Pamela - F, Iago - M, Wellington - M";

            Map<String, String> nomesEGeneros = new LinkedHashMap<>();

            String[] pares = texto.split(",");

            for (String par : pares) {
                String[] partes = par.split(" - ");
                String nome = partes[0].trim();
                String genero = partes[1].trim();
                nomesEGeneros.put(nome, genero);
            }

            System.out.println("Todos os nomes e gêneros:");
            System.out.println(nomesEGeneros);
            System.out.println("");
            System.out.println("Apenas masculinos (M):");
            nomesEGeneros.entrySet().stream()
                    .filter(entry -> entry.getValue().equals("M"))
                    .forEach(entry -> System.out.println(entry.getKey()));
            System.out.println("");
            System.out.println("Apenas femininos (F):");
            nomesEGeneros.entrySet().stream()
                    .filter(entry -> entry.getValue().equals("F"))
                    .forEach(entry -> System.out.println(entry.getKey()));
        }

    private static void listaDeNomesEGenerosInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("*******Digite NOME e GENERO da seguinte forma |EXEMPLO: Lucas - M, Fabiola - F, e etc||  : ******* ");
        String texto = input.nextLine();


        Map<String, String> nomesEGeneros = new LinkedHashMap<>();

        String[] pares = texto.split(",");

        for (String par : pares) {
            String[] partes = par.split(" - ");
            String nome = partes[0].trim();
            String genero = partes[1].trim();
            nomesEGeneros.put(nome, genero);
        }

        System.out.println("Todos os nomes e gêneros:");
        System.out.println(nomesEGeneros);
        System.out.println("");
        System.out.println("Apenas masculinos (M):");
        nomesEGeneros.entrySet().stream()
                .filter(entry -> entry.getValue().equals("M"))
                .forEach(entry -> System.out.println(entry.getKey()));
        System.out.println("");
        System.out.println("Apenas femininos (F):");
        nomesEGeneros.entrySet().stream()
                .filter(entry -> entry.getValue().equals("F"))
                .forEach(entry -> System.out.println(entry.getKey()));
    }

    }

