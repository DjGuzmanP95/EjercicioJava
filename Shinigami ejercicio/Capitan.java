package POO.Herencia.Abstractas.Shinigami;

public class Capitan extends Puro {

    public Capitan(String nombre, String origen, int edad, Zanpakuto espada, int escuadron) {
        super(nombre, origen, edad, espada, escuadron);
    }

    @Override
    public void invocarBankai() {
        getEspada().bankai(this.escuadron * 1.5, 1.5);
        System.out.println(this.nombre + " ha invocado su bankai");
    }

    @Override
    public void Pelear(Shinigami rival) {
        double dano;
        if (rival instanceof Capitan) {
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
        return nombre + " [vida: " + this.vida + ", poder: " + this.poder + "] Capitán del escuadrón " + this.escuadron
                + "\n" + getEspada().toString();
    }
}
