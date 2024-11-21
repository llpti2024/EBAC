import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     nomeEGenero();
    }

        public static void nomeEGenero(){
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
        }}


