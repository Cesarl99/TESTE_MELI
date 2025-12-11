
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pessoas = new HashMap<>();


        // PREENCHE OS INFORMAÇÕES PESSOAIS (NOME E IDADE)
        while(true){
            System.out.println("NOME:");
            String nome = scanner.next();
            System.out.println("IDADE:");
            int idade = scanner.nextInt();
            pessoas.put(nome,idade);

            System.out.print("DESEJA CONTINUAR (N PARA SAIR, QUALQUER DE TECLA PRA CONTINUAR): ");
            String opcao = scanner.next();


            if (opcao.equals("N")) {
                break;
            }

        }
        scanner.close();

        // TRATAMENTO PARA PESSOAS COM MENSO DE 30 ANOS
        Set<String> nomesMais30 = new HashSet<>();

        for (String nomeMap : pessoas.keySet()) {
            int idadeMap = pessoas.get(nomeMap);
            if (idadeMap > 30) {
                nomesMais30.add(nomeMap);
            }
        }

        // IMPRIMIR NOME NA ORDEM ALFABETICA
        ArrayList<String> listaOrdenadaNome = new ArrayList<>(nomesMais30);
        Collections.sort(listaOrdenadaNome);
        System.out.println("PESSOAS COM MENOS DE 30 ANOS:");
        for (String nome : listaOrdenadaNome) {
            System.out.println(nome);
        }
    }
}


/*
Crie um programa que armazene uma lista de pessoas (nome e idade) usando um Map.
Armazene as informações em um Map<String, Integer>, onde a chave é o nome e o valor é a idade.
Use um Set para armazenar os nomes das pessoas com mais de 30 anos.
Exiba os nomes das pessoas que possuem mais de 30 anos, ordenados em ordem alfabética

* */

