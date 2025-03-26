public class Condutor {

    //Attributes
    private String nome;
    private int idade;
    private int destreza;

    //Constructor
    public Condutor(String nome, int idade, int destreza) {
        this.nome = nome;
        this.idade = idade;
        this.destreza = destreza;
    }

    //Public getters and setters
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

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    }

