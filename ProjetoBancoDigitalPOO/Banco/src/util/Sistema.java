package util;

import entities.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sistema {
    private final Scanner sc = new Scanner(System.in);
    private final Map<String, Conta> contasMap = new HashMap<>();
    private Conta contaLogada = null;

    public Sistema() {
        int op;
        do {
            menuInicial();
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> cadastrarConta();
                case 2 -> realizarLogin();
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    private void cadastrarConta() {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        menuTipoConta();
        int tipo = sc.nextInt();
        sc.nextLine();

        Conta novaConta = (tipo == 1) ? new ContaCorrente(cliente) : new ContaPoupanca(cliente);
        contasMap.put(cpf, novaConta);
        System.out.println("Conta cadastrada com sucesso!");
    }

    private void realizarLogin() {
        System.out.print("CPF para login: ");
        String cpf = sc.nextLine();

        if (contasMap.containsKey(cpf)) {
            contaLogada = contasMap.get(cpf);
            System.out.println("Login realizado como: " + contaLogada.getCliente().getNome());
            menuConta();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private void menuConta() {
        int op;
        do {
            menuOperacoes();
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1 -> {
                    System.out.print("Valor do saque: ");
                    contaLogada.sacar(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Valor do depósito: ");
                    contaLogada.depositar(sc.nextDouble());
                }
                case 3 -> {
                    System.out.print("CPF destino: ");
                    String cpfDestino = sc.nextLine();
                    Conta contaDestino = contasMap.get(cpfDestino);

                    if (contaDestino == null) {
                        System.out.println("Conta destino não encontrada.");
                        break;
                    }

                    System.out.print("Valor da transferência: ");
                    contaLogada.transferir(contaDestino, sc.nextDouble());
                }
                case 4 -> {
                    System.out.println(contaLogada);
                }
                case 0 -> System.out.println("Logout realizado.");
                default -> System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    private void menuInicial() {
        System.out.println("""
                === Banco Digital ===
                1 - Criar Conta
                2 - Login
                0 - Sair
                """);
        System.out.print("Opção: ");
    }

    private void menuOperacoes() {
        System.out.println("""
                === Menu da Conta ===
                1 - Sacar
                2 - Depositar
                3 - Transferir
                4 - Ver dados da conta
                0 - Logout
                """);
        System.out.print("Opção: ");
    }

    private void menuTipoConta() {
        System.out.println("""
                Tipo de Conta:
                1 - Conta Corrente
                2 - Conta Poupança
                """);
        System.out.print("Escolha: ");
    }
}
