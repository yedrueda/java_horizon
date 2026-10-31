/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */
public class Artemis { // Inicio de la clase Artemis 
    
        // Atributos 
    // Definicion de carictericticas de las clase de manera privada 
    
    private String nombre;
    private String directiva;
    private String estado;
    private int especiesClonadas;
    
    // Constructor
    
    public Artemis() {
        // asignamos los parametros a los atributos 
        this.nombre = "ARTEMISA";
        this.directiva = "Clonar y liberar especies animales";
        this.estado = "Subordinada a GAIA";
        this.especiesClonadas = 0;
    }
    
    // Metodos Getter y Setter 
    
    // Metodo Getter: Permite consultar y obtener el valor privado 
    public String getNombre() {
        return nombre;
    }
    
    // Metodo setter : Permite modificar el valor del atributo privado 
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

    public int getEspeciesClonadas() {
        return especiesClonadas;
    }

    public void setEspeciesClonadas(int especiesClonadas) {
        this.especiesClonadas = especiesClonadas;
    }
    
    
    // Metodos 
    // Metodo que muestra por consola los valores actuales 
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Especies clonadas: " + especiesClonadas);
    }
    
    
    // metododo que simula clonar una especie animal 
    public void clonarEspecie() {
        especiesClonadas++;
        System.out.println(nombre + " clona una especie animal. Total: " + especiesClonadas);
    }
    
    
    // Metodo que simula la liberacion de una especiae animal en el ecosistema 
    public void liberarEspecie() {
        System.out.println(nombre + " libera una especie al ecosistema.");
    }
}
