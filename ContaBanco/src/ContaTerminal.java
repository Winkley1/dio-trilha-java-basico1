import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        double Saldo = 237.48;
        int Numero;
        String Agencia = "067-8";
        String NomeCliente = "MARIO ANDRADE";

        System.out.println("Por favor, digite o número da Agência !");
        Numero = texto.nextInt();
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");


    }
}
