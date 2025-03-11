package ex2;
import ex2.Carro;
import ex2.Condutor;
import java.util.Random;

public class Corrida {

    //Attributes
    public int laps = 3;
    public int turns = 1;

    //Objects
    Condutor condutor1 = new Condutor("Mario", 22, 100);
    Condutor condutor2 = new Condutor("Luigi", 21, 90);

    Carro carro1 = new Carro("IDKIDKIDK", condutor1);
    Carro carro2 = new Carro("ABCDEFGHI", condutor2);

    // Constructor
    public Corrida() {

    }


    public void iniciarCorrida() {

        carro1.ligar();
        carro2.ligar();

        for (int lap = 1; lap <= laps; lap++) {
            System.out.println("Lap " + lap + " starts!");
            carro1.acelerar();
            carro2.acelerar();

            Random random = new Random();
            double randomNum = random.nextDouble();
            double randomNum2 = random.nextDouble();
            int randomTravar = random.nextInt(16) + 5;
            int randomTravar2 = random.nextInt(16) + 5;

            if (randomNum <= 0.3) {
                carro1.travar(randomTravar);
            }
            if (randomNum <= 0.3) {
                carro2.travar(randomTravar2);
            }
        }
        if (carro1.getVelocidadeAtual() > carro2.getVelocidadeAtual()) {
            System.out.println("O " + condutor1.getNome() + " ganhou!");
        }
        else if (carro2.getVelocidadeAtual() > carro1.getVelocidadeAtual()) {
            System.out.println("O " + condutor2.getNome() + " ganhou!");
        }
    }


    public static void main(String[] args) {
        Corrida corrida = new Corrida();
        corrida.iniciarCorrida(); // Call the method to start the race

    }
}

