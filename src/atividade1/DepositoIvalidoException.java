package atividade1;

public class DepositoIvalidoException extends Exception{
    public DepositoIvalidoException() {
        super("Deposito invalido a quantia deve ser maior que zero!");
    }
}
