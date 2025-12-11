import java.util.Scanner; // importa a classe Scanner

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();


        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Qual a operação será realizada:");
        String sinalOperacao =  scanner.next();

        int resultado;

        // Verifica qual o operacao sera realizada usando como parametros os dois valores dado pelo usuarios
        switch(sinalOperacao) {
            case "+":
                System.out.println("SOMA ESCOLHIDA");
                resultado = numero1 + numero2;
                System.out.println("RESULTADO DA SOMA É " + resultado);
                break;
            case "-":
                System.out.println("SUBTRAÇÃO ESCOLHIDA");
                resultado = numero1 - numero2;
                System.out.println("RESULTADO DA SUBTRAÇÃO É " + resultado);
                break;
            case "*":
                System.out.println("MULTIPLICAÇÃO ESCOLHIDA");
                resultado = numero1 * numero2;
                System.out.println("RESULTADO DA MULTIPLICAÇÃO É " + resultado);
                break;
            case "/":
                System.out.println("DIVISÃO ESCOLHIDA");
                double resultadofloat = numero1 / numero2;
                System.out.println("RESULTADO DA DIVISÃO É " + resultadofloat);
                break;
            default:
                System.out.println("NENHUMA OPERACAO VALIDA SELECIONADA");
        }
        scanner.close(); // opcional, mas boa prática
    }
}