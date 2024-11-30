public abstract class Cadastro {
    private String nome;
    private Integer idade;
    private String genero;
    private String estado;
    private String cidade;
    private String cep;
    private String pais;


    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }



    public Cadastro(String nome, Integer idade, String genero, String estado, String cidade, String cep, String pais) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.pais = pais;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }







}
