package POO.Herencia.Abstractas.Shinigami;
public abstract class Puro extends Shinigami {

    protected int escuadron;

    public Puro (String nombre, String origen, int edad, Zanpakuto espada, int escuadron) {
        super(nombre, origen, edad, espada);
        if (escuadron < 1 || escuadron > 13) {
            this.escuadron = (int)(Math.random() * 13) + 1;
        } else {
            this.escuadron = escuadron;
        }
    }

    public void shunpo() {
        System.out.println(this.nombre + " se ha desplazado usando shunpo");
    }
}