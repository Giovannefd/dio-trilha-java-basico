import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ContaTerminal dados = new ContaTerminal();
		Scanner dadosinseridos = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		dados.nomeCliente = dadosinseridos.nextLine();

		System.out.println("Informe sua agência: ");
		dados.agencia = dadosinseridos.nextLine();

		System.out.println("Informe o número da conta: ");
		dados.numeroConta = dadosinseridos.nextInt();

		System.out.println("Informe seu saldo: ");
		dados.saldo = dadosinseridos.nextDouble();

		System.out.println("Olá " + dados.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ dados.agencia + ", conta " + dados.numeroConta + " e seu saldo " + dados.saldo
				+ " já está disponível para saque.");

	}

}
