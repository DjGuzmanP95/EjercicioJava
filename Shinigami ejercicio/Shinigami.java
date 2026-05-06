package POO.Herencia.Abstractas.Shinigami;

public abstract class Shinigami {

    protected String nombre;
    protected double vida, poder;
    protected String origen;
    protected int edad;
    private Zanpakuto espada;

    public Shinigami(String nombre, String origen, int edad, Zanpakuto espada) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.espada = espada;
        this.vida = 1500;
        this.poder = (int) (Math.random() * (50 - 5 + 1)) + 5;
    }

    public abstract void invocarBankai();

    public abstract void Pelear(Shinigami rival);

    // Getter necesario para que las subclases accedan a la espada del rival en Pelear()
    public Zanpakuto getEspada() {
        return this.espada;
    }

    public double getVida() {
        return this.vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getPoder() {
        return this.poder;
    }

    @Override
    public String toString() {
        return this.nombre + " [vida: " + this.vida + ", poder: " + this.poder + "]\n" + this.espada.toString();
    }
}
