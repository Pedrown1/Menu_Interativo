package br.com.estudos.menuInterativo.model;
public class DadosProfessor extends DadosPessoais {

    private int Codigo;

    public DadosProfessor(String Nome, char Sexo, String Endereço, int Codigo) {
        super(Nome, Sexo, Endereço);
        this.Codigo = Codigo;
    }

    @Override
    public String toString() {
        return "\n  -  Nome: " + getNome() + "\n  -  Sexo: " + getSexo() + "\n  -  Endereço: " + getEndereço() + "\n  -  Codigo: " + getCodigo();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
}
