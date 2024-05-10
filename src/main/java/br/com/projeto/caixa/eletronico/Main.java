package br.com.projeto.caixa.eletronico;

import java.util.Scanner;

public class Main {
    private static double saldo = 2500.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        iniciarDados();

        int opcaoEscolhida;

        do {
            iniciarOpcoes();
            opcaoEscolhida = scanner.nextInt();
            processarOpcao(opcaoEscolhida, scanner);
        } while (opcaoEscolhida != 4);
    }

    private static void iniciarDados() {
        System.out.println("*********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome: Leonardo Ribeiro");
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("*********************************");
    }

    private static void iniciarOpcoes() {
        System.out.println("\nOperações");
        System.out.println("\n1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
        System.out.println("\nDigite a opção desejada:");
    }

    private static void processarOpcao(int opcao, Scanner scanner) {
        switch (opcao) {
            case 1:
                System.out.println("O saldo atual é: " + saldo);
                break;
            case 2:
                System.out.println("Informe o valor a receber:");
                double valorAReceber = scanner.nextDouble();
                saldo += valorAReceber;
                break;
            case 3:
                System.out.println("Informe o valor a transferir:");
                double valorATranferir = scanner.nextDouble();
                if (valorATranferir > saldo) {
                    System.out.println("Não há saldo suficiente para essa transferência!");
                } else {
                    saldo -= valorATranferir;
                }
                break;
            case 4:
                System.out.println("Fim!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
