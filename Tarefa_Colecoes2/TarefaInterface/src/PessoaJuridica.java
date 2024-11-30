public class PessoaJuridica  extends Pessoa {
    private Long cnpj;

    public PessoaJuridica(String nome, String genero, Integer idade, Long cnpj) {
        super(nome, genero, idade);
        this.cnpj = cnpj;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = '" + getNome() + '\'' + ", genero = '" + getGenero() + '\'' +
                ", idade = " + getIdade() + ", cnpj = " + cnpj +'}';

    }
}
