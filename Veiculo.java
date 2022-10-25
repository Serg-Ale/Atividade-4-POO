// Nome: Sergio Alexandre A. de Almeida  - RA: 2346591

package Java.exercicios.lista4;

abstract class Veiculo {

    String placa;
    String marca;
    String modelo;
    String cor;
    int qtdRodas;
    int velocMax;

    private Motor motor = new Motor();

    String dataCadastro;

    public Veiculo() {
    }

    public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor,
            String dataCadastro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        this.velocMax = velocMax;
        this.motor = motor;
        this.dataCadastro = dataCadastro;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdRodas() {
        return this.qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getVelocMax() {
        return this.velocMax;
    }

    public void setVelocMax(int velocMax) {
        if (velocMax < 10 || velocMax > 250) {
            System.out.println("A velocidade está fora dos limites brasileiros");
            this.velocMax = 100;
        } else {
            this.velocMax = velocMax;
        }
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    abstract int calcVel();

}
