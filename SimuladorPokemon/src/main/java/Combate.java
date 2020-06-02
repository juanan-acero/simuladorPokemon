public class Combate {
    Pokemon local;
    Pokemon visitante;

    public Combate(Pokemon local, Pokemon visitante) {
        this.local = local;
        this.visitante = visitante;
    }

    public void combatir() {
        while (local.ps > 0 && visitante.ps > 0) {
            calcularDamage();
        }
       // System.out.println("El pokemon " + this.local.nombre + " gana el combate");
       // System.out.println("El pokemon " + this.visitante.nombre + " pierde el combate");
    }

    public void calcularDamage() {
        Integer damage;
        if (local.velocidad > visitante.velocidad) {
            //local ataca primero
            damage = local.movimientos[0].potencia;
            if (local.tipo == local.movimientos[0].tipo) {
                damage = damage*2;
            }
            if (local.movimientos[0].tipo == visitante.tipo) {
                damage = damage/2;
            }

            visitante.ps = visitante.ps - damage;
            if (local.ps <= 0) {
                System.out.println("El pokemon " + this.local.nombre + " se ha debilitado");
            }
            else if (visitante.ps <= 0) {
                System.out.println("El pokemon " + this.visitante.nombre + " se ha debilitado");
            }
            else {
                damage = visitante.movimientos[0].potencia;
                if (visitante.tipo == visitante.movimientos[0].tipo) {
                    damage = damage*2;
                }
                if (visitante.movimientos[0].tipo == local.tipo) {
                    damage = damage/2;
                }

                local.ps = local.ps - damage;
                if (local.ps <= 0) {
                    System.out.println("El pokemon " + this.local.nombre + " se ha debilitado");
                }

                if (visitante.ps <= 0) {
                    System.out.println("El pokemon " + this.visitante.nombre + " se ha debilitado");
                }
            }
        }
        else if (local.velocidad < visitante.velocidad) {
            //visitante ataca primero
            damage = visitante.movimientos[0].potencia;
            if (visitante.tipo == visitante.movimientos[0].tipo) {
                damage = damage*2;
            }
            if (visitante.movimientos[0].tipo == local.tipo) {
                damage = damage/2;
            }

            local.ps = local.ps - damage;
            if (local.ps <= 0) {
                System.out.println("El pokemon " + this.local.nombre + " se ha debilitado");
            }

            else if (visitante.ps <= 0) {
                System.out.println("El pokemon " + this.visitante.nombre + " se ha debilitado");
            }

            damage = local.movimientos[0].potencia;
            if (local.tipo == local.movimientos[0].tipo) {
                damage = damage*2;
            }
            if (local.movimientos[0].tipo == visitante.tipo) {
                damage = damage/2;
            }

            visitante.ps = visitante.ps - damage;
            if (local.ps <= 0) {
                System.out.println("El pokemon " + this.local.nombre + " se ha debilitado");
            }
            else if (visitante.ps <= 0) {
                System.out.println("El pokemon " + this.visitante.nombre + " se ha debilitado");
            }
        }
        /*else {
            Double orden = Math.random();
            if (orden > 0.5) {
                damage = local.movimientos[0].potencia;
                if (local.tipo == local.movimientos[0].tipo) {
                    damage = damage*2;
                }
                if (local.movimientos[0].tipo == visitante.tipo) {
                    damage = damage/2;
                }

                visitante.ps = visitante.ps - damage;
                if (local.ps <= 0) {
                    System.out.println("El pokemon " + this.local.nombre + " se ha debilitado");
                }

                if (visitante.ps <= 0) {
                    System.out.println("El pokemon " + this.visitante.nombre + " se ha debilitado");
                }
            } else {
                damage = visitante.movimientos[0].potencia;
                if (visitante.tipo == visitante.movimientos[0].tipo) {
                    damage = damage*2;
                }
                if (visitante.movimientos[0].tipo == local.tipo) {
                    damage = damage/2;
                }


                local.ps = local.ps - damage;
                if (local.ps <= 0) {
                    System.out.println("El pokemon " + this.local.nombre + " se ha debilitado");
                }

                if (visitante.ps <= 0) {
                    System.out.println("El pokemon " + this.visitante.nombre + " se ha debilitado");
                }
            }
        }
        return damage;*/
    }
}
