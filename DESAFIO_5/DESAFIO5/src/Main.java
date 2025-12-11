import java.util.Scanner; // importa a classe Scanner

public class Main {
    public static void main(String[] args) {
        // cria o Scanner ligado ao teclado (System.in)
        Scanner scanner = new Scanner(System.in);
        int linhas = 3;
        int colunas = 3;

        int [][] matriz = new int[linhas] [colunas];

        for (int i = 0; i < linhas; i++) {        // i = linha
            for (int j = 0; j < colunas; j++) {   // j = coluna
                System.out.print("Digite sua idade: ");
                matriz[i][j] = scanner.nextInt();;
                valor++;
            }
        }
        // ler um número inteir

        System.out.println("Olá, " + nome + ", você tem " + idade + " anos.");

        scanner.close(); // opcional, mas boa prática
    }
}

