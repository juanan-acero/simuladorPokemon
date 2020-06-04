import java.util.List;

public class Tipo {
    String nombre;
    List<String> debilidades;
    List<String> efectividades;

    public Tipo(String nombre, List<String> debilidades, List<String> efectividades) {
        this.nombre = nombre;
        this.debilidades = debilidades;
        this.efectividades = efectividades;
    }

    public Tipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(List<String> debilidades) {
        this.debilidades = debilidades;
    }

    public List<String> getEfectividades() {
        return efectividades;
    }

    public void setEfectividades(List<String> efectividades) {
        this.efectividades = efectividades;
    }
}
