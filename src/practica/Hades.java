/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */
public class Hades {
    
       // Atributos 
    private String nombre;
    private String directiva;
    private String estado;
    private int reiniciosEjecutados;
    
    // constructor Iniciando los atributos 
    public Hades(String nombre, String directiva, String estado, int reinicio) {
        this.nombre = nombre;
        this.directiva = directiva;
        this.estado = estado;
        this.reiniciosEjecutados = reinicio;
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

    public int getReiniciosEjecutados() {
        return reiniciosEjecutados;
    }

    public void setReiniciosEjecutados(int reiniciosEjecutados) {
        this.reiniciosEjecutados = reiniciosEjecutados;
    }
       
    
    // Metodos 

    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Reinicios ejecutados: " + reiniciosEjecutados);
    }

    public void reiniciarProceso() {
        reiniciosEjecutados++;
        System.out.println(nombre + " reinicia el proceso de terraformación. Total: " + reiniciosEjecutados);
    }

    public void activarProtocolo() {
        System.out.println(nombre + " activa el protocolo de extinción controlada.");
    }
}
