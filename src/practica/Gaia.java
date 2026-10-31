/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 *Inmiciamos la clase publica Gaia
 */
public class Gaia {
        // Atributos 
    
    private String nombre;
    private String directiva;
    private String estado;
    private String ubicacion;
    
    // Constructor iniciando los atributos 
    
    public Gaia(String nombre, String directiva, String estado, String ubicacion) {
        this.nombre = nombre;
        this.directiva = directiva;
        this.estado = estado;
        this.ubicacion = ubicacion;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    // Metodos 
    // Metodo que muestar los datos actuales 
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Ubicación: " + ubicacion);
    }

    public void activarSubordinadas() {
        System.out.println(nombre + " activa sus subrutinas subordinadas.");
    }

    public void verificarSistema() {
        System.out.println(nombre + " verifica que todos los sistemas estén operativos.");
    }
}
