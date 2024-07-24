package atividade1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaCorrente {
    private int numero;
    private Cliente cliente;
    private double saldo = 0;
    private LocalDateTime data;

    public ContaCorrente(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.data = LocalDateTime.now();
        this.extrato.add("Conta aberta as "+LocalDateTime.now()+" pelo cliente: "+cliente.getNome()+" "+cliente.getSobreNome());
    }

    public int getNumero() {
        return numero;
    }

    private List<String> extrato = new ArrayList<>();


    public Cliente getCliente() {
        return cliente;
    }


    public void depositar(double valor) {
        this.saldo += valor;
        this.extrato.add("Cliente: "+ cliente.getNome()+ " "+cliente.getSobreNome()+" Depositou "+ valor+ "R$ em "+ this.getData() + " Com o cpf de "+ cliente.getCpf());
    }

    private LocalDateTime getData() {
        data = LocalDateTime.now();
        return data;
    }


    public  double sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.extrato.add("Cliente: "+ cliente.getNome()+ " "+cliente.getSobreNome()+" Sacou "+ valor+ "R$ em "+ this.getData() + " Com o cpf de "+ cliente.getCpf());
        }else {
            System.out.println("Não possui saldo suficiente");
        }

        return this.saldo;
    }

    public double transferir(ContaCorrente destinatario, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destinatario.saldo += valor;
            this.extrato.add("Cliente: "+ cliente.getNome()+ " "+cliente.getSobreNome()+" Transferiu "+ valor+ "R$ em "+ this.getData() + " Com o cpf de "+ cliente.getCpf()+" para \n" +
                    destinatario.cliente.getNome()+" "+destinatario.getCliente().getSobreNome()+" com cpf: "+destinatario.cliente.getCpf());
        }else {
            System.out.println("Não possui saldo suficiente");
            return 0;
        }
        return valor;
    }

    public void exibirExtrato() {
        for (int i = 0; i < extrato.size(); i++) {
            System.out.println(extrato.get(i));
        }
    }


}
