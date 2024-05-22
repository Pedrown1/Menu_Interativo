package model;

public class DadosCurso {

    private int CodigoC;
    private String NomeC;
    private int Horario;
    private String ProfC;

    public DadosCurso(int CodigoC, String NomeC, int Horario, String ProfC) {
        this.CodigoC = CodigoC;
        this.Horario = Horario;
        this.NomeC = NomeC;
        this.ProfC = ProfC;
    }

    @Override
    public String toString() {
        return "\n  -  Codigo: " + getCodigoC() + "\n  -  Horario: " + getHorario() + "\n  -  Nome: " + getNomeC() + "\n  -  Professor: " + getProfC();
    }

    public int getCodigoC() {
        return CodigoC;
    }

    public void setCodigoC(int codigoC) {
        CodigoC = codigoC;
    }

    public String getNomeC() {
        return NomeC;
    }

    public void setNomeC(String nomeC) {
        NomeC = nomeC;
    }

    public int getHorario() {
        return Horario;
    }

    public void setHorario(int horario) {
        Horario = horario;
    }

    public String getProfC() {
        return ProfC;
    }

    public void setProfC(String profC) {
        ProfC = profC;
    }

}

