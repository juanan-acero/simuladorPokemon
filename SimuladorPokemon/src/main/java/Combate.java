public class Combate {
    Pokemon local;
    Pokemon visitante;

    public Combate(Pokemon local, Pokemon visitante) {
        this.local = local;
        this.visitante = visitante;
    }

    public void combatir() {
        System.out.println("El pokemon " + this.local.nombre + " gana el combate");
    }
}
