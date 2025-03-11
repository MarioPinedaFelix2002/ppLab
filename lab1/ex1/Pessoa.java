import java.util.Scanner;

public class Pessoa {
    //Atributos
    private String nome;
    private char genero;
    private int idade;

    //Contructors
    public Pessoa() {}
    public Pessoa(String n, char g) { this.nome = n; this.genero = g; }
    public Pessoa(String n, char g, int i) { this(n, g); this.idade = i; }

    //Metodos get e set
    String getNome() {return this.nome;}
    void setNome(String n) {this.nome = n;}
    char getGenero() {return this.genero;}
    void setGenero(char g) {this.genero = g; }
    int getIdade() {return this.idade;}
    void setIdade(int i) { this.idade = i; }

    // Metodo falar
    public void falar() {
        System.out.println("O " + this.nome + " está a falar.");
    }
}