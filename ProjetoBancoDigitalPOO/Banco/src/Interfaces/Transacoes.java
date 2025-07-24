package Interfaces;

import entities.Cliente;
import entities.Conta;

public interface Transacoes {

    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);
    void sacar(double valor);
}
