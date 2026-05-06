package POO.Herencia.Abstractas.Shinigami;

public abstract class Mestizo extends Shinigami {

    protected double porcentajeHollow;
    protected double porcentajeQuincy;

    public Mestizo(String nombre, String origen, int edad, Zanpakuto espada) {
        super(nombre, origen, edad, espada);
        this.porcentajeHollow = (int)(Math.random() * (50 - 10 + 1)) + 10;
        this.porcentajeQuincy = 50 - this.porcentajeHollow;
    }
}