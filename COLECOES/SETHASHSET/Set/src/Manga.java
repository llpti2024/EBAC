import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    public Manga(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public int compareTo(Manga outroManga) {
        //retorna  negativo se o this for < outroManga
        //se this == outroManga, return 0
        //positivo se o this > outroManga

        //Um dos jeitos de organizar o ID
       /* if(this.id< outroManga.getId()){
            return -1;
        } else if(this.id.equals(outroManga.getId())){
            return 0;
        } else
            return 1;
        }*/


        return this.nome.compareTo(outroManga.getNome());

        // Ou podemos fazer mais simples por que o Long ja tem o comparabel sendo assim

    /*   //Maneira mais facil usando o Wrapper para ID
         return this.id.compareTo(outroManga.getId());

         //Maneira mais facil usando o Wrapper para Preco
         return Double.compare(preco, outroManga.getPreco());

         //Maneira mais facil usando o Wrapper para Nome
         return this.nome.compareTo(outroManga.getNome());
         }
    */

}}

