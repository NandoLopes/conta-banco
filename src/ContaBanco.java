import java.util.InputMismatchException;
import java.util.Scanner;

import Domain.Conta;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
		Conta conta = solicitarDados();

        System.out.println(formatarMensagem(conta));
    }

    /**
     * Inicializa um Scanner para solicitar as informações da conta do usuário.
     * @return Retorna a conta digitada pelo usuário.
     * @throws InputMismatchException Caso o usuário digite alguma informação errada (como letras em campo de valor).
     */
    private static Conta solicitarDados(){
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da conta.");
        conta.Conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência.");
        conta.Agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente.");
        conta.NomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo.");
        conta.Saldo = scanner.nextDouble();

        scanner.close();

        return conta;
    }

    private static String formatarMensagem(Conta conta){
        return (String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", 
                                    conta.NomeCliente, conta.Agencia, conta.Conta, conta.Saldo));
    }
}
