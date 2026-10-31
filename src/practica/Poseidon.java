/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */
public class Poseidon {
    
        // Atributos 
    
    private String nombre;
    private String directiva;
    private String estado;
    private int nivelPurezaAgua;
    
    // Constructor
    
    public Poseidon() {
        this.nombre = "POSEIDÓN";
        this.directiva = "Limpiar océanos y ríos";
        this.estado = "Subordinada a GAIA";
        this.nivelPurezaAgua = 0;
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

    public int getNivelPurezaAgua() {
        return nivelPurezaAgua;
    }

    public void setNivelPurezaAgua(int nivelPurezaAgua) {
        this.nivelPurezaAgua = nivelPurezaAgua;
    }
    
    
    
    // Metodos
    
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Nivel de pureza del agua: " + nivelPurezaAgua);
    }

    public void limpiarOceano() {
        nivelPurezaAgua += 15;
        System.out.println(nombre + " limpia un océano. Pureza actual: " + nivelPurezaAgua);
    }

    public void purificarRio() {
        nivelPurezaAgua += 5;
        System.out.println(nombre + " purifica un río. Pureza actual: " + nivelPurezaAgua);
    }
}
