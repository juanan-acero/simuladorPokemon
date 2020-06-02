public class Pokemon {
    String nombre;
    String Tipo;
    Integer ps;
    Integer velocidad;
    Movimientos[] movimientos;

    public Pokemon(String nombre, String tipo, Integer ps, Integer velocidad, Movimientos[] movimientos) {
        this.nombre = nombre;
        Tipo = tipo;
        this.ps = ps;
        this.velocidad = velocidad;
        this.movimientos = movimientos;
    }
}
