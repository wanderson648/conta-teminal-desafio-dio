package model;

import java.math.BigDecimal;

public class ContaBanco {
    private int numero;
    private String agencia;

    private String nomeCliente;

    private BigDecimal saldo;

    public ContaBanco(int numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public BigDecimal getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return "Olá [" + nomeCliente +
                "], obrigado por criar uma conta em nosso banco, sua agência é [" + agencia +
                "], conta ["+ numero+"] e seu saldo ["+ saldo +
                "] já está disponível para saque.";
    }
}
