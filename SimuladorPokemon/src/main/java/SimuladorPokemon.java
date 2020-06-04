import java.util.ArrayList;
import java.util.List;

public class SimuladorPokemon {
    public static void main(String[] args) {

        Tipo tipoFuego = new Tipo("Fantasma");
        List<String> deb = new ArrayList<String>();
        deb.add("Agua");
        deb.add("Roca");
        deb.add("Tierra");
        tipoFuego.setDebilidades(deb);

        List<String> efe = new ArrayList<String>();
        efe.add("Hielo");
        efe.add("Planta");
        efe.add("Bicho");
        efe.add("Hada");
        efe.add("Acero");
        tipoFuego.setDebilidades(efe);

        Movimientos[] movimientosCharmander = new Movimientos[4];
        Movimientos[] movimientosPikachu = new Movimientos[4];
        movimientosCharmander[0] = new Movimientos("Normal", 120, 75);
        movimientosPikachu[0] = new Movimientos("Normal", 120, 75);
        Pokemon pikachu = new Pokemon("Pikachu", tipoFuego, 50, 50, movimientosPikachu);

        Pokemon[] equipoPaco = new Pokemon[6];
        Pokemon[] equipoPepe = new Pokemon[6];

        /*equipoPaco[0] = charmander;
        equipoPepe[0] = pikachu;

        Jugador jugador1 = new Jugador("Paco", equipoPaco);
        Jugador jugador2 = new Jugador("Pepe", equipoPepe);

        Combate combate = new Combate(jugador1.pokemon[0], jugador2.pokemon[0]);
        combate.combatir();*/

        List<Pokemon> ejemploLista = new ArrayList<Pokemon>();

        ejemploLista.add(new Pokemon("Charmander", tipoFuego, 50, 50, movimientosCharmander));
        ejemploLista.add(new Pokemon("Pikachu", tipoFuego, 50, 50, movimientosCharmander));
        ejemploLista.add(new Pokemon("Squirtle", tipoFuego, 50, 50, movimientosCharmander));

        System.out.println("Tenemos un total de " + ejemploLista.size() + " pokemon en el equipo");

        System.out.println("El pokemon impreso es más "+ejemploLista.get(0).nombre +" y es de tipo " + ejemploLista.get(0).tipo.getNombre());
        System.out.println("El pokemon impreso es más "+ejemploLista.get(1).nombre);
        System.out.println("El pokemon impreso es más "+ejemploLista.get(2).nombre);



    }

    public static void meterPokemon(List<Pokemon> lista, String nombre, Tipo tipo, Integer ps, Integer velocidad, Movimientos[] movimientos) {
        lista.add(new Pokemon(nombre, tipo, ps, velocidad, movimientos));
    }

    public static void sacarPokemon(List<Pokemon> lista, Integer indice) {
        lista.remove(3);
    }
}
