import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        double n1, n2;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        n1 = leitor.nextDouble();
        leitor.nextLine();
        System.out.print("Digite o segundo numero: ");
        n2 = leitor.nextDouble();
        leitor.nextLine();
        double soma = n1 + n2;
        System.out.println("\n---\n");
        System.out.println("A soma dos numeros e de: " + soma);
    }
}
