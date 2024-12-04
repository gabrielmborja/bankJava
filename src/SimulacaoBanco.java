import java.util.Scanner;

public class SimulacaoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variavel que armazena o valor do saldo
        double saldo = 5000.0;
        //Variavel de valor a Receber
        double valorReceber;
        //Variavel Para a Pessoa transferir:
        double transferencia;
        //Mensagem
        String mensagem = "Deseja fazer outra operação?";
        //Variavel Tela Inicial:
        var dadosCliente =
                "************************************\n" +
                        "Dados Iniciais do Cliente:\n" +
                        "\n" +
                        "Nome: Gabriel Borges\n" +
                        "Tipo de conta: Corrente\n" +
                        "Saldo inicial: " + saldo + "\n" +
                        "************************************\n" +
                        "\n";

        System.out.println(dadosCliente);

        //Tela inicial
//        System.out.println("************************************");
//        System.out.println("Dados Iniciais do Cliente:");
//        System.out.println("\n");
//        System.out.println("Nome: Gabriel Borges");
//        System.out.println("Tipo de conta: Corrente");
//        System.out.println("Saldo inicial: " + saldo);
//        System.out.println("************************************");
//        System.out.println("\n");
        //Tela de escolhas e ações:

            System.out.println("Operações:");

            System.out.println("1- Consultar dados");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            int operacaoEscolhida = scanner.nextInt();
            while (operacaoEscolhida != 4) {

            if (operacaoEscolhida == 1) {
                System.out.println("O seu saldo atual é de R$ " + saldo);
                System.out.println(mensagem);
                operacaoEscolhida = scanner.nextInt();
            } else if (operacaoEscolhida == 2) {
                System.out.println("Informe o valor a receber:");
                valorReceber = scanner.nextDouble();
                saldo += valorReceber;
                System.out.println("Saldo atualizado: " + saldo);
                System.out.println(mensagem);
                operacaoEscolhida = scanner.nextInt();

            } else if (operacaoEscolhida == 3) {
                System.out.println("Quanto deseja transferir?");
                System.out.println("Saldo disponível: " + "R$ " + saldo);
                transferencia = scanner.nextDouble();

                System.out.println("Saldo disponível: " + "R$ " + saldo);

                if (transferencia > saldo) {
                    System.out.println("Não é possivel realizar esse saque pois você tem R$" + saldo);
                    System.out.println(mensagem);
                    operacaoEscolhida = scanner.nextInt();
                } else {
                    saldo -= transferencia;
                    System.out.println(mensagem);
                    System.out.println("Saldo atualizado: R$" + saldo);
                    operacaoEscolhida = scanner.nextInt();
                }

            } else if (operacaoEscolhida == 4) {
                System.out.println("Saindo!");
            } else {
                System.out.println("Opção inválida!");
                break;
            }
        }
        System.out.println("Obrigado por usar o nosso banco!");
            scanner.close();
    }
}