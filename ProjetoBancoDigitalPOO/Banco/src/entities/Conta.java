package entities;

import Interfaces.Transacoes;

public abstract class Conta implements Transacoes {

    private static int SequencialConta = 1541;
    private final int numero;
    private final int agencia;
    private final Cliente cliente;
    protected double saldo;

    public String getNomeBanco() {
        return "Santander";
    }

    public Conta(Cliente cliente) {
        this.numero = SequencialConta++;
        this.agencia = 334;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (getSaldo() >= valor){
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferencia realizada com Sucesso!");
        }else {
            System.out.println("Valor insuficiente para transferencia");
        }
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor){
            this.saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
        }else {
            System.out.println("Valor insuficiente para saque");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", cliente=" + cliente +
                ", saldo=" + saldo +
                '}';
    }


}
