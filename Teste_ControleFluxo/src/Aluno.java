public class Aluno implements ValidacaoAluno{
    private String nome;
    private int idade;
    private int ano;
    private String sexo;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void cadastro() {
        System.out.println("Qual o nome do aluno ?");
        setNome(input.next());
        System.out.println("Qual o sexo do aluno ? ");
        setSexo(input.next());
        System.out.println("Qual a idade do aluno ?");
        setIdade(input.nextInt());
        System.out.println("Qual o ano do aluno ?");
        setAno(input.nextInt());

    }

    @Override
    public String toString() {
        return "\n========================  ALUNO  ========================\n" +
                "\nNOME             =   " + "|" + this.nome +  "|" +
                "\nIDADE            =   " + "[" +  this.idade + "] |ANOS|" +
                "\nSEXO             =   " + "{" + this.sexo + "} " +
                "\n\n======================================================\n";
    }
}

