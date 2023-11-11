package Sensores;

interface Sensor {
    public abstract void liga();
    public abstract void desliga();
    public abstract int medicao();
    public abstract int setValorMaximo(int valor);
    public abstract int setValorMinimo(int valor);
}
