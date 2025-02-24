/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.FeriaEmpresarial;

/**
 *
 * @author pc
 */
import java.util.*;

// Clase Empresa para representar las empresas participantes
class Empresa {
    private String nombre;
    private String sector;
    private String email;

    // Constructor de la clase Empresa
    public Empresa(String nombre, String sector, String email) {
        this.nombre = nombre;
        this.sector = sector;
        this.email = email;
    }

    // Métodos getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el atributo sector
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    // Métodos getter y setter para el atributo email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para representar la empresa como una cadena de texto
    @Override
    public String toString() {
        return "Empresa: " + nombre + " | Sector: " + sector + " | Contacto: " + email;
    }
}

// Clase Stand para representar los stands de la feria
class Stand {
    private int numero;
    private String ubicacion;
    private String tamano;
    private Empresa empresaAsignada;
    private List<Comentario> comentarios;

    // Constructor de la clase Stand
    public Stand(int numero, String ubicacion, String tamano) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.empresaAsignada = null; // Inicialmente no hay empresa asignada
        this.comentarios = new ArrayList<>(); // Lista vacía de comentarios
    }

    // Método para obtener el número del stand
    public int getNumero() {
        return numero;
    }

    // Método para asignar una empresa al stand
    public void asignarEmpresa(Empresa empresa) {
        this.empresaAsignada = empresa;
    }

    // Método para verificar si el stand está disponible
    public boolean estaDisponible() {
        return empresaAsignada == null;
    }

    // Método para agregar un comentario al stand
    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    // Método para calcular la calificación promedio de los comentarios
    public double obtenerCalificacionPromedio() {
        if (comentarios.isEmpty()) return 0; // Si no hay comentarios, el promedio es 0
        return comentarios.stream().mapToInt(Comentario::getCalificacion).average().orElse(0);
    }

    // Método toString para representar el stand como una cadena de texto
    @Override
    public String toString() {
        return "Stand: " + numero + " | Ubicación: " + ubicacion + " | Tamaño: " + tamano +
               (empresaAsignada != null ? " | Empresa: " + empresaAsignada.getNombre() : " | Sin empresa asignada") +
               " | Calificación promedio: " + obtenerCalificacionPromedio();
    }
}

// Clase Visitante para representar a los visitantes de la feria
class Visitante {
    private String nombre;
    private String identificacion;
    private String email;

    // Constructor de la clase Visitante
    public Visitante(String nombre, String identificacion, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }

    // Métodos getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el atributo identificacion
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    // Métodos getter y setter para el atributo email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para representar el visitante como una cadena de texto
    @Override
    public String toString() {
        return "Visitante: " + nombre + " | ID: " + identificacion + " | Contacto: " + email;
    }
}

// Clase Comentario para representar las calificaciones de los visitantes
class Comentario {
    private String visitante;
    private int calificacion;
    private String mensaje;

    // Constructor de la clase Comentario
    public Comentario(String visitante, int calificacion, String mensaje) {
        this.visitante = visitante;
        this.calificacion = calificacion;
        this.mensaje = mensaje;
    }

    // Método para obtener la calificación del comentario
    public int getCalificacion() {
        return calificacion;
    }

    // Método toString para representar el comentario como una cadena de texto
    @Override
    public String toString() {
        return "Comentario de " + visitante + " | Calificación: " + calificacion + " | Mensaje: " + mensaje;
    }
}

// Clase principal con menú interactivo
public class FeriaEmpresarial {
    private static List<Empresa> empresas = new ArrayList<>();
    private static List<Stand> stands = new ArrayList<>();
    private static List<Visitante> visitantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Método principal
    public static void main(String[] args) {
        int opcion;
        do {
            // Menú de opciones
            System.out.println("\nBienvenido a la Feria Empresarial");
            System.out.println("1. Registrar Empresa");
            System.out.println("2. Editar/Eliminar Empresa");
            System.out.println("3. Registrar Visitante");
            System.out.println("4. Editar/Eliminar Visitante");
            System.out.println("5. Registrar Stand");
            System.out.println("6. Asignar Stand a Empresa");
            System.out.println("7. Registrar Visita y Comentario");
            System.out.println("8. Ver Reportes");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            // Switch para manejar las opciones del menú
            switch (opcion) {
                case 1: registrarEmpresa(); break;
                case 2: editarEliminarEmpresa(); break;
                case 3: registrarVisitante(); break;
                case 4: editarEliminarVisitante(); break;
                case 5: registrarStand(); break;
                case 6: asignarStand(); break;
                case 7: registrarVisita(); break;
                case 8: mostrarReportes(); break;
                case 9: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 9); // Repetir hasta que el usuario elija salir
    }

    // Método para registrar un stand
    private static void registrarStand() {
        System.out.print("Número del stand: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ubicación del stand (ej: Pabellón A, Stand 10): ");
        String ubicacion = scanner.nextLine();
        System.out.print("Tamaño del stand (pequeño, mediano, grande): ");
        String tamano = scanner.nextLine();
        stands.add(new Stand(numero, ubicacion, tamano));
        System.out.println("Stand registrado con éxito.");
    }

    // Método para asignar un stand a una empresa
    private static void asignarStand() {
        if (empresas.isEmpty()) {
            System.out.println("No hay empresas registradas.");
            return;
        }
        if (stands.isEmpty()) {
            System.out.println("No hay stands registrados.");
            return;
        }
        System.out.println("Seleccione empresa para asignar stand:");
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println((i + 1) + ". " + empresas.get(i));
        }
        int empresaIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        if (empresaIndex >= 0 && empresaIndex < empresas.size()) {
            System.out.println("Seleccione stand para asignar:");
            for (int i = 0; i < stands.size(); i++) {
                System.out.println((i + 1) + ". " + stands.get(i));
            }
            int standIndex = scanner.nextInt() - 1;
            scanner.nextLine();
            if (standIndex >= 0 && standIndex < stands.size()) {
                if (stands.get(standIndex).estaDisponible()) {
                    stands.get(standIndex).asignarEmpresa(empresas.get(empresaIndex));
                    System.out.println("Stand asignado con éxito.");
                } else {
                    System.out.println("El stand ya está ocupado.");
                }
            } else {
                System.out.println("Índice de stand inválido.");
            }
        } else {
            System.out.println("Índice de empresa inválido.");
        }
    }

    // Método para registrar una empresa
    private static void registrarEmpresa() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Sector: ");
        String sector = scanner.nextLine();
        System.out.print("Correo: ");
        String email = scanner.nextLine();
        empresas.add(new Empresa(nombre, sector, email));
        System.out.println("Empresa registrada con éxito.");
    }

    // Método para editar o eliminar una empresa
    private static void editarEliminarEmpresa() {
        if (empresas.isEmpty()) {
            System.out.println("No hay empresas registradas."); return;
        }
        System.out.println("Seleccione empresa a editar/eliminar:");
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println((i + 1) + ". " + empresas.get(i));
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index >= 0 && index < empresas.size()) {
            System.out.println("1. Editar\n2. Eliminar");
            int opc = scanner.nextInt();
            scanner.nextLine();
            if (opc == 1) {
                System.out.print("Nuevo nombre: ");
                empresas.get(index).setNombre(scanner.nextLine());
                System.out.print("Nuevo sector: ");
                empresas.get(index).setSector(scanner.nextLine());
                System.out.print("Nuevo correo: ");
                empresas.get(index).setEmail(scanner.nextLine());
                System.out.println("Empresa editada con éxito.");
            } else if (opc == 2) {
                empresas.remove(index);
                System.out.println("Empresa eliminada.");
            }
        }
    }

    // Método para registrar un visitante
    private static void registrarVisitante() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Identificación: ");
        String identificacion = scanner.nextLine();
        System.out.print("Correo: ");
        String email = scanner.nextLine();
        visitantes.add(new Visitante(nombre, identificacion, email));
        System.out.println("Visitante registrado con éxito.");
    }

    // Método para editar o eliminar un visitante
    private static void editarEliminarVisitante() {
        if (visitantes.isEmpty()) {
            System.out.println("No hay visitantes registrados."); return;
        }
        System.out.println("Seleccione visitante a editar/eliminar:");
        for (int i = 0; i < visitantes.size(); i++) {
            System.out.println((i + 1) + ". " + visitantes.get(i));
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index >= 0 && index < visitantes.size()) {
            System.out.println("1. Editar\n2. Eliminar");
            int opc = scanner.nextInt();
            scanner.nextLine();
            if (opc == 1) {
                System.out.print("Nuevo nombre: ");
                visitantes.get(index).setNombre(scanner.nextLine());
                System.out.print("Nueva identificación: ");
                visitantes.get(index).setIdentificacion(scanner.nextLine());
                System.out.print("Nuevo correo: ");
                visitantes.get(index).setEmail(scanner.nextLine());
                System.out.println("Visitante editado con éxito.");
            } else if (opc == 2) {
                visitantes.remove(index);
                System.out.println("Visitante eliminado.");
            }
        }
    }

    // Método para registrar una visita y un comentario
    private static void registrarVisita() {
        if (visitantes.isEmpty()) {
            System.out.println("No hay visitantes registrados."); return;
        }
        if (stands.isEmpty()) {
            System.out.println("No hay stands registrados."); return;
        }
        System.out.println("Seleccione visitante:");
        for (int i = 0; i < visitantes.size(); i++) {
            System.out.println((i + 1) + ". " + visitantes.get(i));
        }
        int visitanteIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        if (visitanteIndex >= 0 && visitanteIndex < visitantes.size()) {
            System.out.println("Seleccione stand visitado:");
            for (int i = 0; i < stands.size(); i++) {
                System.out.println((i + 1) + ". " + stands.get(i));
            }
            int standIndex = scanner.nextInt() - 1;
            scanner.nextLine();
            if (standIndex >= 0 && standIndex < stands.size()) {
                System.out.print("Calificación (1-5): ");
                int calificacion = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Comentario: ");
                String mensaje = scanner.nextLine();
                stands.get(standIndex).agregarComentario(new Comentario(visitantes.get(visitanteIndex).getNombre(), calificacion, mensaje));
                System.out.println("Visita registrada con éxito.");
            }
        }
    }

    // Método para mostrar reportes
    private static void mostrarReportes() {
        System.out.println("\n--- Reporte de Empresas y Stands ---");
        for (Stand stand : stands) {
            System.out.println(stand);
        }

        System.out.println("\n--- Reporte de Visitantes y Stands Visitados ---");
        for (Visitante visitante : visitantes) {
            System.out.println(visitante);
        }

        System.out.println("\n--- Reporte de Calificaciones Promedio por Stand ---");
        for (Stand stand : stands) {
            System.out.println("Stand " + stand.getNumero() + ": " + stand.obtenerCalificacionPromedio());
        }
    }
}
