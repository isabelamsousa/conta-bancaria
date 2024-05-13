import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome, conta;
        Double saldo, valorAReceber, valorATransferir;
        int opcao;

        nome = "Isabela Maria de Sousa";
        conta = "Corrente";
        saldo = 2500.00;
        opcao = 0;
        valorAReceber = 0.0;
        valorATransferir = 0.0;

        System.out.println("*******************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + conta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n*******************************");

        String operacoes;

        System.out.println("\nDigite a operação desejada:");

        operacoes = """ 
                \n 1- Consultar saldo
                 2- Receber valor
                 3- Transferir valor
                 4- Sair
                """;
        //System.out.println(operacoes);

        while (opcao != 4) {
            System.out.println(operacoes);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é de: R$" + saldo);

            } else if (opcao == 2) {

                System.out.println("Qual valor deseja receber?");
                valorAReceber = leitura.nextDouble();

                saldo += +valorAReceber;
                System.out.println("Saldo atual: R$" + saldo);

            } else if (opcao == 3) {

                System.out.println("Qual valor deseja tranferir?");
                valorATransferir = leitura.nextDouble();

                if (valorATransferir > saldo) {
                    System.out.println("Saldo insuficiente para essa transferência");
                } else {
                    saldo -= valorATransferir;
                    System.out.println("Saldo atual: R$" + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}
