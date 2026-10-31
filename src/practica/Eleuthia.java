/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */
public class Eleuthia {// Ininiciamos las clase publica Eluthia 
    
     // Atributos 
    private String nombre;
    private String directiva;
    private String estado;
    private int humanosCriados;
    
    // Constructor
    
    public Eleuthia() {
        this.nombre = "ELEUTHIA";
        this.directiva = "Clonar, preservar y criar a la humanidad";
        this.estado = "Subordinada a GAIA";
        this.humanosCriados = 0;
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

    public int getHumanosCriados() {
        return humanosCriados;
    }

    public void setHumanosCriados(int humanosCriados) {
        this.humanosCriados = humanosCriados;
    }
    
    
    
    // Metodos
    // Metodo que muestra por consola los datos actuales 
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Humanos criados: " + humanosCriados);
    }
    
    // Metodo sde comportamiento que simula la clonacion de uin ser huamano 
    public void clonarHumano() {
        System.out.println(nombre + " clona un nuevo ser humano desde el banco genético.");
    }
    
    // Metodo de comportamiento que simula la crianza del ser humano clonado 
    public void criarHumano() {
        humanosCriados++;
        System.out.println(nombre + " cría a un humano. Total: " + humanosCriados);
    }

    
}
