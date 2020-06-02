public class Pokemon {
    String nombre;
    String tipo;
    Integer ps;
    Integer velocidad;
    Movimientos[] movimientos;

    public Pokemon(String nombre, String tipo, Integer ps, Integer velocidad, Movimientos[] movimientos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ps = ps;
        this.velocidad = velocidad;
        this.movimientos = movimientos;
    }
}
