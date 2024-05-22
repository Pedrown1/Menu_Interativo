package br.com.estudos.menuInterativo.model;

 public class DadosAluno extends DadosPessoais {

        private int RA;

        public DadosAluno(String Nome, char Sexo, String Endereço, int RA) {
            super(Nome, Sexo, Endereço);
            this.RA = RA;
        }

        public int getRA() {
            return RA;
        }

        public void setRA(int rA) {
            RA = rA;
        }

     @Override
     public String toString() {
         return "\n  -  Nome: " + getNome() + "\n  -  Sexo: " + getSexo() + "\n  -  Endereço: " + getEndereço() + "\n  -  RA: " + getRA();
     }

    }

