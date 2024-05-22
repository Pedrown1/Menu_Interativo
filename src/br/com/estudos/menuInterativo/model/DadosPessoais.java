package br.com.IntegracaoSankhya.estudos.doal.menuInterativo.model;

public class DadosPessoais {

    private String Nome;
    private char Sexo;
    private String Endereço;

    public DadosPessoais(String Nome, char Sexo, String Endereço) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Endereço = Endereço;

    }

    @Override
    public String toString() {
        return "\n  -  Nome: " + getNome() + "\n  -  Sexo: " + getSexo() + "\n  -  Endereço: " + getEndereço();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }
}