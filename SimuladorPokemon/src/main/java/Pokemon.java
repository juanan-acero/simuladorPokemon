import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    String nombre;
    Tipo tipo;
    Integer ps;
    Integer velocidad;
    List<Movimientos>  movimientos;

    public Pokemon(String nombre, Tipo tipo, Integer ps, Integer velocidad, List<Movimientos> movimientos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ps = ps;
        this.velocidad = velocidad;
        this.movimientos = new ArrayList<Movimientos>();
        this.movimientos = movimientos;


    }
}

