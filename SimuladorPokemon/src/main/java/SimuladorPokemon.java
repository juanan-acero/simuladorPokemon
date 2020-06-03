public class SimuladorPokemon {
    public static void main(String[] args) {
        Movimientos[] movimientosCharmander = new Movimientos[4];
        Movimientos[] movimientosPikachu = new Movimientos[4];
        movimientosCharmander[0] = new Movimientos("Normal", 120, 75);
        movimientosPikachu[0] = new Movimientos("Normal", 120, 75);
        Pokemon charmander = new Pokemon("Charmander", "Fuego", 50, 50, movimientosCharmander);
        Pokemon pikachu = new Pokemon("Pikachu", "Fuego", 50, 50, movimientosPikachu);

        Pokemon[] equipoPaco = new Pokemon[6];
        Pokemon[] equipoPepe = new Pokemon[6];

        equipoPaco[0] = charmander;
        equipoPepe[0] = pikachu;

        Jugador jugador1 = new Jugador("Paco", equipoPaco);
        Jugador jugador2 = new Jugador("Pepe", equipoPepe);

        Combate combate = new Combate(jugador1.pokemon[0], jugador2.pokemon[0]);
        combate.combatir();

    }
}
