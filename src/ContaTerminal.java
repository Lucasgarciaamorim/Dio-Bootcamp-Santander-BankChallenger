import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float saldo = 3800.48F;
        System.out.println("Por favor, Digite o Número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, Digite o Número da Agencia");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu nome");
        
        String nomeCliente = scanner.next();


        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + "já está disponível para saque.");

        System.out.println(numeroAgencia);
        System.out.println(numeroConta);
        System.out.println(nomeCliente);
//        System.out.println(saldo);


    }
}