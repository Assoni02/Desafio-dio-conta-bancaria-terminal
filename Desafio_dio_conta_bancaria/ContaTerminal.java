
import java.util.Scanner; //Importa os arquivos para interagir com o terminal;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Declaração de variaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Exibição do terminal
        System.out.println();
        System.out.println("--------- BEM VINDO AO NOSSO BANCO--------");
        System.out.println();

        //Exibição e interação com o console
        System.out.println("Porfavor digite o seu numero (0001)");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        System.out.println("Agora digite sua ágencia (000-1)");
        agencia = scanner.nextLine();
        System.out.println();

        System.out.println("Me diga seu nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println();
        System.out.println("Por final seu saldo atual");
        saldo = scanner.nextDouble();
        System.out.println();

        //Mensagem final com todas informações obtidas
        System.out.printf("Olá %s, obrigado por criar uma conta em" +
                " nosso banco, sua agência é %s, conta %d" +
                " e seu saldo %s já está disponível para" +
                " saque\".\n", nomeCliente, agencia, numero, saldo );
    }
}