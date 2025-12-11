import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <Integer> numeros  = new ArrayList<>();
        int n;
        System.out.println("DIGITE UM NUMERO PARA REALIZAR ANALISE (DIGITE 0 PARA SAIR)");
        while (true) {
            n = scanner.nextInt();
            if (n == 0){
                break;
            }
            numeros.add(n);
            System.out.println("DIGITE UM NOVO VALOR PARA ANALISE:");
        }

        List<Integer> numerosFinal = numeros.stream()
                .filter(y ->  y % 2 != 0)
                .map(y -> y * 2)
                .sorted()
                .collect(Collectors.toUnmodifiableList());

        for (int x = 0; x < numerosFinal.toArray().length; x++){
            System.out.println("VALOR DENTRO DA LISTA NUMEROS FINAL - INDEX: "+x+" CONTEUDO DO LISTA "+ numerosFinal.get(x));
        }


        System.out.println("FIM DA EXECUCAO");
        scanner.close();
    }
}

