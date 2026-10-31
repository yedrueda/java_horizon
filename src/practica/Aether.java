/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */
public class Aether { // Inicio de la clase publica Aether
    
        // Atributos 
    // definimos los atributos que indican sus caracteristica de manera privada
    private String nombre;
    private String directiva;
    private String estado;
    private int nivelContaminacion;
    
    // Constructor iniciando los atributos
    
    public Aether() {
        // Asigna los parametros a los atributros
        this.nombre = "AETHER";
        this.directiva = "Limpiar el aire y estabilizar el clima";
        this.estado = "Subordinada a GAIA";
        this.nivelContaminacion = 100;
    }
    
    // Usamos metodos Setter y Getteres
    
    // Metodo Getter : permite consultar y obtener el valor del atributo privado
    public String getNombre() {
        return nombre;
    }
    
    // Método Setter: permite modificar el valor del atributo privado
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

    public int getNivelContaminacion() {
        return nivelContaminacion;
    }

    public void setNivelContaminacion(int nivelContaminacion) {
        this.nivelContaminacion = nivelContaminacion;
    }
    
    
    // Metodo de comportamiento que muestra por consola los datos actuales del objeto
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Nivel de contaminación: " + nivelContaminacion);
    }
    
    // metodo que simula la limpieza del aire 
    public void limpiarAire() {
        nivelContaminacion -= 10;
        System.out.println(nombre + " limpia el aire. Contaminación actual: " + nivelContaminacion);
    }
    
    
    // Metodo que simula el control de las condiciones climaticas 
    public void estabilizarClima() {
        System.out.println(nombre + " estabiliza las condiciones climáticas globales.");
    }
    
} // Fin de la clase 
