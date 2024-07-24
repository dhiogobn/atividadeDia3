package atividade1;

public class Cliente {

    private String nome;
    private String cpf;
    private String sobreNome;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String sobreNome) {
        this.nome = nome;
        this.cpf = cpf;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
