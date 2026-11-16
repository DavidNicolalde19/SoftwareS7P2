
public class Main {

    public static void main(String[] args) {

        // Crear desarrolladores
        Desarrollador d1 = new Desarrollador(
                "D01", "Ana", "Backend", 20
        );

        Desarrollador d2 = new Desarrollador(
                "D02", "Luis", "Frontend", 15
        );

        Desarrollador d3 = new Desarrollador(
                "D03", "Carlos", "Bases de datos", 25
        );

        // Crear proyecto
        Proyecto proyecto = new Proyecto("Sistema de ventas");

        // Agregar desarrolladores
        proyecto.agregarDesarrollador(d1);
        proyecto.agregarDesarrollador(d2);
        proyecto.agregarDesarrollador(d3);

        // Mostrar equipo
        System.out.println("LISTA DEL EQUIPO");
        System.out.println(proyecto.mostrarEquipo());

        // Calcular total de horas
        System.out.println("Total de horas asignadas: " +
                proyecto.calcularTotalHoras());

        // Buscar desarrollador existente
        System.out.println("\nBUSQUEDA DE DESARROLLADORES");

        Desarrollador encontrado =
                proyecto.buscarDesarrollador("D02");

        if (encontrado != null) {
            System.out.println("Desarrollador encontrado:");
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Desarrollador no encontrado");
        }

        // Buscar desarrollador inexistente
        Desarrollador noEncontrado =
                proyecto.buscarDesarrollador("D05");

        if (noEncontrado != null) {
            System.out.println(noEncontrado.mostrarInformacion());
        } else {
            System.out.println("El desarrollador D05 no existe");
        }

        // Eliminar desarrollador
        System.out.println("\nELIMINAR DESARROLLADOR");

        boolean eliminado = proyecto.eliminarDesarrollador("D03");

        if (eliminado) {
            System.out.println("Desarrollador eliminado correctamente");
        } else {
            System.out.println("No se encontro el desarrollador");
        }

        // Mostrar equipo actualizado
        System.out.println("\nEQUIPO ACTUALIZADO");
        System.out.println(proyecto.mostrarEquipo());

        // Calcular horas restantes
        System.out.println("Total de horas despues de eliminar: " +
                proyecto.calcularTotalHoras());
    }
}
