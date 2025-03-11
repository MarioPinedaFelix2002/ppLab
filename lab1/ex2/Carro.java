package ex2;

public class Carro {

    //Attributes
    private String matricula;
    private int velocidadeAtual = 0;
    private final int velocidadeMaxima = 200;
    private boolean ligado;
    private Condutor condutor;

    //Constructor
    public Carro(String matricula, Condutor condutor) {
        this.matricula = matricula;
        this.condutor = condutor;
        this.ligado = false;
        }

    //Methods
    public void ligar() {
        ligado = true;
        System.out.println("Carro " + matricula + " ligado: VRUUUUMmmmmmmmmm");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro " + matricula + " desligado: MMMmmmmm");
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro " + matricula + " está desligado! Não pode acelerar.");
            return;
        }
        int aumento = 10 + (int)(condutor.getDestreza() * 0.10);
        velocidadeAtual += aumento;
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
        System.out.println("Carro " + matricula + " acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void travar(int intensidadeTravagem) {
        if (!ligado) {
            System.out.println("O carro " + matricula + " está desligado! Não pode travar.");
            return;
        }
        velocidadeAtual -= intensidadeTravagem;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println("Carro " + matricula + " travando. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    //Getters
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getMatricula() {
        return matricula;
    }
}
