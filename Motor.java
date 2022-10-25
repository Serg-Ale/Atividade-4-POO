// Nome: Sergio Alexandre A. de Almeida - RA: 2346591


package Java.exercicios.lista4;

public class Motor{
    
    int qtdPistoes;
    int potencia;


    public Motor() {
    }

    public Motor(int qtdPistores, int potencia) {
        this.qtdPistoes = qtdPistores;
        this.potencia = potencia;
    }


    public int getQtdPistores() {
        return this.qtdPistoes;
    }

    public void setQtdPistores(int qtdPistores) {
        this.qtdPistoes = qtdPistores;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}