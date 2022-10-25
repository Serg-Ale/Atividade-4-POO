// Nome: Sergio Alexandre A. de Almeida  - RA: 2346591

package Java.exercicios.lista4;

public class Passeio extends Veiculo implements Calc {

    int qtdePassageiro;

    //
    public Passeio() {
    }

    public Passeio(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public int getQtdePassageiro() {
        return this.qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public int getVelocMax() {
        return this.velocMax;
    }

    // - a velocidade do carro de passeio deverá ser calculada e exibida em M/h (metros por hora);
    @Override
    int calcVel() {

        return getVelocMax() * 1_000;
    }

    // - soma das quantidades de letras existentes em todos os atributos do tipo String;
    @Override
    public int calcular() {
        return placa.length() + marca.length() + modelo.length() + cor.length() + dataCadastro.length();
    }

}
