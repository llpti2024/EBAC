public class PessoaFisica extends Pessoa{
    private Long cpf;

    public PessoaFisica(String nome, String genero, Integer idade, Long cpf) {
        super(nome, genero, idade);
        this.cpf = cpf;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = '" + getNome() + '\'' + ", genero = '" + getGenero() + '\'' +
                ", idade = " + getIdade() + ", cpf = " + cpf +'}';

    }

}
