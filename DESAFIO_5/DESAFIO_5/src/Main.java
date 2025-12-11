import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int linhas = 3;
        int colunas = 3;

        int [][] matriz = new int[linhas] [colunas];
        int index = 0;
        int somaTotal = 0;
        int somaLinhas = 0;

        // PREENCHE A MATRIZ
        for (int i = 0; i < linhas; i++) {        // i = linha
            for (int j = 0; j < colunas; j++) {   // j = coluna
                System.out.println(" DIGITE O VALOR PARA O INDEX : "+index);
                matriz[i][j] = scanner.nextInt();
                index ++;
            }
        }


        // REALIZA A SOMA DA MATRIZ E DE CADA LINHA
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.println("VALOR PRESENTE NA MATRIZ"+matriz[i][j]);
                somaTotal += matriz[i][j];
                somaLinhas += matriz[i][j];
                if (j == 2){
                    System.out.println(" SOMA DA "+i+" VALOR DA SOMA DA LINHA "+somaLinhas);
                    somaLinhas = 0;
                }
            }
        }

        System.out.println("SOMA DA MATRIZ "+somaTotal);



        scanner.close();
    }
}

