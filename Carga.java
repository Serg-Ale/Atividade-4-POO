// Nome: Sergio Alexandre A. de Almeida  - RA: 2346591

package Java.exercicios.lista4;

public class Carga extends Veiculo implements Calc {

    int tara;
    int cargaMax;

    public Carga() {
    }

    public Carga(int tara, int cargaMax) {
        this.tara = tara;
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return this.tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return this.cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getVelocMax() {
        return this.velocMax;
    }

    // - a velocidade do caminhão (veículo de carga) deverá ser calculada e exibida em Cm/h (centímetros por hora);
    @Override
    int calcVel() {

        return getVelocMax() * 100_000;
    }

    // soma de todos os valores de todos contidos em todos os atributos numéricos;
    @Override
    public int calcular() {

        return qtdRodas + velocMax + tara + cargaMax; // nao fora incluido atributos de motor
    }

}
