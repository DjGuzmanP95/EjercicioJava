package POO.Herencia.Abstractas.Shinigami;

public class Sustituto extends Mestizo {

    private String zonaAsignada;

    public Sustituto(String nombre, String origen, int edad, Zanpakuto espada, String zonaAsignada) {
        super(nombre, origen, edad, espada);
        this.zonaAsignada = zonaAsignada;
    }

    public void vigilar() {
        System.out.println(this.nombre + " sustituto vigila " + this.zonaAsignada);
    }

    @Override
    public void invocarBankai() {
        getEspada().bankai(this.porcentajeHollow / 10, 2.0);
        System.out.println(this.nombre + " ha invocado su bankai");
    }

    @Override
    public void Pelear(Shinigami rival) {
        double dano;

        if (rival instanceof Sustituto) {
            dano = Math.abs(getEspada().getAtaque() - rival.getEspada().getResistencia());
        } else if (rival instanceof Teniente) {
            dano = Math.abs(getEspada().getAtaque() + this.poder - rival.getEspada().getResistencia());
        } else {
            dano = Math.abs(getEspada().getAtaque() - rival.getEspada().getResistencia() + rival.getPoder());
        }
        rival.setVida(rival.getVida() - dano);
    }

    @Override
    public String toString() {
        return this.nombre + " [vida: " + this.vida + ", poder: " + this.poder + "] Shinigami Sustituto"
                + "\n" + getEspada().toString();
    }
}
