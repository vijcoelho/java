package Sensores;

class SensorTemperatura implements Sensor, Runnable {
    private boolean estaLigado;
    private int max;
    private int min;

    public void ligar() {
        this.estaLigado = true;
    }

    public void desligar() {
        this.estaLigado = false;
    }

    public int medicao() {
        if(!estaLigado) {
            return 0;
        }

        return (int) ((Math.random() * 100) % this.max);
    }

    public int setValorMaximo(int valor) {
        return this.max = valor;
    }

    public int setValorMinimo(int valor) {
        return this.min = valor;
    }

    public void run() {
        while(true) {
            int temperatura = medicao();
            System.out.println("UMIDADE: "+ temperatura);

            if(temperatura > max) {
                System.out.println("TEMPERATURA MUITO ELEVADA...");
            } 
            else if(temperatura < min) {
                System.out.println("TEMPERATURA ABAIXO DO MIN...");
            }
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}