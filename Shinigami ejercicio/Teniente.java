package POO.Herencia.Abstractas.Shinigami;

public class Teniente extends Puro {

    public Teniente(String nombre, String origen, int edad, Zanpakuto espada, int escuadron) {
        super(nombre, origen, edad, espada, escuadron);
    }

    @Override
    public void invocarBankai() {
        System.out.println(this.nombre + " aún no puede invocar su bankai");
    }

    @Override
    public void Pelear(Shinigami rival) {
        double dano;

        if (rival instanceof Teniente) {
            dano = Math.abs(getEspada().getAtaque() - rival.getEspada().getResistencia());
        } else {            
            dano = Math.abs(getEspada().getAtaque() - rival.getEspada().getResistencia() + rival.getPoder());
        }
        rival.setVida(rival.getVida() - dano);
    }

    @Override
    public String toString() {
        return nombre + " [vida: " + this.vida + ", poder: " + this.poder + "] Teniente del escuadrón " + this.escuadron
                + "\n" + getEspada().toString();
    }
}