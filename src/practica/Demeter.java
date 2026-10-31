/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */
public class Demeter { // inicia la clase publica 
        // Atributos 
    // Definimos los atributos de la clase privados 
    private String nombre;
    private String directiva;
    private String estado;
    private int semillasAlmacenadas;
    
    // Constructor
    
    public Demeter() {
        this.nombre = "DEMÉTER";
        this.directiva = "Almacenar semillas y cultivar la cubierta vegetal";
        this.estado = "Subordinada a GAIA";
        this.semillasAlmacenadas = 0;
    }
    
    /**
     * 
     * Utilizamos Metods Getter y setter 
     * 
     * Metodo getter: permite consultar y obtener los valores de los atributos privados
     * 
     *Metodo setter : Permite Modificar los valores de los atributos privados 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirectiva() {
        return directiva;
    }

    public void setDirectiva(String directiva) {
        this.directiva = directiva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSemillasAlmacenadas() {
        return semillasAlmacenadas;
    }

    public void setSemillasAlmacenadas(int semillasAlmacenadas) {
        this.semillasAlmacenadas = semillasAlmacenadas;
    }
    
    
    // Metodos 
    
    // Metodo de comportamiento que muestra por consola los datos actuales 
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Semillas almacenadas: " + semillasAlmacenadas);
    }
    
    // Metodo de comportamiento que simula el almacena semillas 

    public void almacenarSemilla() {
        semillasAlmacenadas++;
        System.out.println(nombre + " almacena una nueva semilla. Total: " + semillasAlmacenadas);
    }
    
    // Metodo de comportamiento que simula cultivar la semilla obtenida anteriormente 
    public void cultivarVegetacion() {
        System.out.println(nombre + " cultiva la cubierta vegetal en una zona del planeta.");
    }
}
