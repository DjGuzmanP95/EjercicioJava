package POO.Herencia.Abstractas.Shinigami;

public class Zanpakuto {

    private String nombre;
    private double anchura, ataque, resistencia;
    private boolean estado; // false = shikai, true = bankai
    // Necesarios para restaurar en shikai()
    private final double ataque_o, resistencia_o;

    public Zanpakuto(String nombre, double anchura) {
        this.nombre = nombre;
        this.anchura = anchura;
        this.ataque = (int) (Math.random() * (25 - 2 + 1)) + 2;
        this.ataque_o = this.ataque;
        this.resistencia = (int) (Math.random() * (150 - 70 + 1)) + 70;
        this.resistencia_o = this.resistencia;
        this.estado = false;
    }

    public void bankai(double m_ataque, double m_resistencia) {
        if (!this.estado) {
            this.ataque = this.ataque * m_ataque;
            this.resistencia = this.resistencia * m_resistencia;
            this.estado = true;
        } else {
            System.out.println("Ya está en estado bankai");
        }
    }

    public void shikai() {
        if (estado) {
            this.ataque = this.ataque_o;
            this.resistencia = this.resistencia_o;
            this.estado = false;
        } else {
            System.out.println("Ya está en estado shikai");
        }
    }

    public double getAtaque() {
        return this.ataque;
    }

    public double getResistencia() {
        return this.resistencia;
    }

    @Override
    public String toString() {
        String estadoStr = this.estado ? "bankai" : "shikai";
        return this.nombre + " [atq: " + this.ataque + ", res: " + this.resistencia + "] " + estadoStr;
    }
}
