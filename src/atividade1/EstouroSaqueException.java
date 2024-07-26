package atividade1;

public class EstouroSaqueException extends Exception {
    public EstouroSaqueException() {
        super("Saque invalido o valor deve ser menor que o seu saldo!");
    }

}
