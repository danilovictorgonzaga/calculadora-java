import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String operacao;
        double valorUm;
        double valorDois;
        double resultado = 0;
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("Digite o primeiro número da operação:");
                valorUm = leitura.nextDouble();

                System.out.println("Digite o sinal da operação ( +, -, / ou * ):");
                operacao = leitura.next();

                System.out.println("Digite o segundo número da operação:");
                valorDois = leitura.nextDouble();

                switch (operacao) {
                    case "+":
                        resultado = valorUm + valorDois;
                        break;
                    case "-":
                        resultado = valorUm - valorDois;
                        break;
                    case "/":
                        resultado = valorUm / valorDois;
                        break;
                    case "*":
                        resultado = valorUm * valorDois;
                        break;
                    default:
                        System.out.println("Operação invalida.");
                        continue;
                }

                System.out.println("RESULTADO: " + resultado);
            } catch (InputMismatchException ex) {
                System.out.println("Os valores do calculo tem que ser númericos.");
                leitura.next();
            }

            String proximo;
            while (true) {
                System.out.println("Aceita continuar? S/N");
                proximo = leitura.next().toUpperCase();

                if (proximo.equals("S")) {
                    continuar = true;
                    break;
                } else if (proximo.equals("N")) {
                    continuar = false;
                    break;
                } else {
                    System.out.println("Resposta invalida. Digite 'S' ou 'N'.");
                }
            }

        }
        leitura.close();
    }
}