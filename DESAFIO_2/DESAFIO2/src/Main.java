import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero = scanner.nextInt();

        // Identifica se o numero é par ou impar
        if (numero%2 == 0){
            System.out.println("O numero "+ numero + " é par");
        }else {
            System.out.println("O numero "+ numero + " é impar");
        }

        scanner.close();
    }
}