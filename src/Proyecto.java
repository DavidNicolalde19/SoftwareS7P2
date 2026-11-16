import java. util. ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    // Constructor
    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    // Paso 3: Agregar desarrolladores existentes
    public void agregarDesarrollador(Desarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    // Paso 4: Buscar por identificacion
    public Desarrollador buscarDesarrollador(String identificacion) {

        for (Desarrollador d : desarrolladores) {
            if (d.getIdentificacion().equals(identificacion)) {
                return d;
            }
        }

        return null;
    }

    // Paso 5: Eliminar por identificacion
    public boolean eliminarDesarrollador(String identificacion) {

        Desarrollador encontrado = buscarDesarrollador(identificacion);

        if (encontrado != null) {
            desarrolladores.remove(encontrado);
            return true;
        }

        return false;
    }

    // Paso 6: Calcular total de horas
    public double calcularTotalHoras() {
        double total = 0;

        for (Desarrollador d : desarrolladores) {
            total += d.getHorasAsignadas();
        }

        return total;
    }

    // Paso 6: Mostrar equipo
    public String mostrarEquipo() {
        String resultado = "Proyecto: " + nombre + "\n";

        for (Desarrollador d : desarrolladores) {
            resultado += d.mostrarInformacion() + "\n";
        }

        return resultado;
    }
}
