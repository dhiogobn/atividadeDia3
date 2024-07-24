package atividade1;

public class PrincipalContaCorrente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Dhiogo", "12341234", "Bandeira");
        Cliente cliente2 = new Cliente("Italo", "43214321", "Felipe");
        ContaCorrente c1 = new ContaCorrente(123, cliente1);
        ContaCorrente c2 = new ContaCorrente(321, cliente2);

        c1.depositar(100);
        c1.sacar(50);
        c2.depositar(100);
        c1.transferir(c2, 10);

        c1.exibirExtrato();
    }
}
