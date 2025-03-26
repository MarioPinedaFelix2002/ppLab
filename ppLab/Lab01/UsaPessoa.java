import java.util.Scanner;

public class UsaPessoa {
    public static void main(String[] args) {

        //Instance 1 e 2
        Pessoa pessoa1 = new Pessoa("Mario", 'M');
        Pessoa pessoa2 = new Pessoa("Maria", 'F', 20);

        System.out.println(pessoa1.getNome() + " " + pessoa1.getGenero());
        System.out.println(pessoa2.getNome() + " " + pessoa2.getGenero() + " " + pessoa2.getIdade());

        //Scanner para a pessoa3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Escreva o genero (M/F): ");
        char genero = scanner.next().charAt(0);
        System.out.print("Escreva a idade: ");
        int idade = scanner.nextInt();
        scanner.close();

        Pessoa pessoa3 = new Pessoa(nome, genero, idade);
        System.out.println(pessoa3.getNome() + " " + pessoa3.getGenero() + " " + pessoa3.getIdade());

        //Metodo falar
        pessoa1.falar();
        pessoa2.falar();
        pessoa3.falar();
    }
}
