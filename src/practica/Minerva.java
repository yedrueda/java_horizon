/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */
public class Minerva {
    
// Atributos 
    
    private String nombre;
    private String directiva;
    private String estado;
    private int torresConstruidas;

    // Constructor
    
    public Minerva() {
        this.nombre = "MINERVA";
        this.directiva = "Desactivar el enjambre Faro y construir torres de transmisión";
        this.estado = "Subordinada a GAIA";
        this.torresConstruidas = 0;
    }

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

    public int getTorresConstruidas() {
        return torresConstruidas;
    }

    public void setTorresConstruidas(int torresConstruidas) {
        this.torresConstruidas = torresConstruidas;
    }
    
    
    // Metodos 
    
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Torres construidas: " + torresConstruidas);
    }

    public void construirTorre() {
        torresConstruidas++;
        System.out.println(nombre + " construye una torre de transmisión. Total: " + torresConstruidas);
    }

    public void calcularCodigo() {
        System.out.println(nombre + " calcula el código de desactivación del enjambre Faro.");
    }
}
