import java.util.ArrayList;
import java.util.List;

public class SimuladorPokemon {
    public static void main(String[] args) {

        Tipo tipoFuego = new Tipo("Fuego");
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


        List<Movimientos> listamovchar = new ArrayList<Movimientos>();
        listamovchar.add(new Movimientos("Fuego", 80, 75));
        listamovchar.add(new Movimientos("Fuego", 80, 75));
        listamovchar.add(new Movimientos("Fuego", 80, 75));
        listamovchar.add(new Movimientos("Fuego", 80, 75));
        List<Movimientos> listamovpik = new ArrayList<Movimientos>();
        listamovpik.add(new Movimientos("Electrico", 80, 75));
        listamovpik.add(new Movimientos("Electrico", 80, 75));
        listamovpik.add(new Movimientos("Electrico", 80, 75));
        listamovpik.add(new Movimientos("Electrico", 80, 75));
        List<Movimientos> listamovsquir = new ArrayList<Movimientos>();
        listamovsquir.add(new Movimientos("Agua", 80, 75));
        listamovsquir.add(new Movimientos("Agua", 80, 75));
        listamovsquir.add(new Movimientos("Agua", 80, 75));
        listamovsquir.add(new Movimientos("Agua", 80, 75));

/*        Movimientos[] movimientosCharmander = new Movimientos[4];
        Movimientos[] movimientosPikachu = new Movimientos[4];
        Movimientos[] movimientosSquirtle = new Movimientos[4];

        movimientosCharmander[0] = (Movimientos) listamovchar;
        movimientosPikachu [0] = (Movimientos) listamovpik;
*/

        System.out.println("La potencia impresa es más de "+listamovchar.get(0).potencia );
        System.out.println("La potencia impresa es más de "+listamovpik.get(0).potencia );
        System.out.println("El pokemon impreso es más "+listamovsquir.get(0).potencia );


        Pokemon pikachu = new Pokemon("Pikachu", tipoFuego, 50, 50, listamovpik);

        List<Pokemon> equipoCocacola = new ArrayList<Pokemon>();
        equipoCocacola.add(new Pokemon("Charmander", tipoFuego, 50, 50, listamovchar));
        List<Pokemon> equipoPepsi = new ArrayList<Pokemon>();
        equipoPepsi.add(new Pokemon("Charmander", tipoFuego, 50, 50, listamovchar));

        Combate combate = new Combate(equipoCocacola.get(0), equipoPepsi.get(0));
        /*combate.combatir();*/

        List<Pokemon> ejemploLista = new ArrayList<Pokemon>();

        ejemploLista.add(new Pokemon("Charmander", tipoFuego, 50, 50, listamovchar));
        ejemploLista.add(new Pokemon("Pikachu", tipoFuego, 50, 50, listamovpik));
        ejemploLista.add(new Pokemon("Squirtle", tipoFuego, 50, 50, listamovsquir));

        System.out.println("Tenemos un total de " + ejemploLista.size() + " pokemon en el equipo");

        System.out.println("El pokemon impreso es más "+ejemploLista.get(0).nombre +" y es de tipo " + ejemploLista.get(0).tipo.getNombre());
        System.out.println("El pokemon impreso es más "+ejemploLista.get(1).nombre);
        System.out.println("El pokemon impreso es más "+ejemploLista.get(2).nombre);



    }

    public static void meterPokemon(List<Pokemon> lista, String nombre, Tipo tipo, Integer ps, Integer velocidad, List<Movimientos> movimientos) {
        lista.add(new Pokemon(nombre, tipo, ps, velocidad, movimientos));
    }

    public static void sacarPokemon(List<Pokemon> lista, Integer indice) {
        lista.remove(3);
    }
}
