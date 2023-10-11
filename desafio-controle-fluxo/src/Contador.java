import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int param1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int param2 = scanner.nextInt();
        
        scanner.close();

        try {    
            imprimirNumero(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo número deve ser maior que o primeiro");
        }
    }

    static void imprimirNumero(int param1, int param2) throws ParametrosInvalidosException {
        if (param2 < param1)
            throw new ParametrosInvalidosException();

        int diferenca = param2 - param1;
        for (int contador = 1; contador <= diferenca; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
    }
}
