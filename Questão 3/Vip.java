public class VIP extends Ingresso {
    protected double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double valorVIP() {
        return valor + adicional;
    }
}