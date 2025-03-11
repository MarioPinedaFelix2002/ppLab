package ex3;
import java.util.Scanner;

public class FazCalculos {
    public static void main(String[] args) {

        Calculadora calculadora1 = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insere os dois numeros: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();


        System.out.println(calculadora1.soma(a, b));
        System.out.println(calculadora1.subtracao(a, b));
        System.out.println(calculadora1.multiplicacao(a, b));
        System.out.println(calculadora1.divisao(a, b));
    }
}



