import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuario
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        int numeroConta ;
        String agencia ;
        String nomeCliente;
        Double saldo = 450.55;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Ola "+ nomeCliente+ ",obrigado por criar uma conta em nosso banco,sua agencia e "+ agencia +",conta "+ numeroConta + " e seu saldo "+saldo+" ja esta disponivel para saque.");
    }
}
