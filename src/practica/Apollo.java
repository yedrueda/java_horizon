/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */

// Se declara el inicio de la clase pública Apollo
public class Apollo {
   
    // definimos los atributos que indican sus caracteristica de manera privada 
    private String nombre;
    private String directiva;
    private String estado;
    private int registrosAlmacenados;
    
    // Constructor Iniciando los atributos 
    
    public Apollo(String nombre, String directiva, String estado, int registros) {
        
        // asigna los parametros a los atributos 
        this.nombre = nombre ;
        this.directiva = directiva;
        this.estado = estado;
        this.registrosAlmacenados = registros;
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

    public int getRegistrosAlmacenados() {
        return registrosAlmacenados;
    }

    public void setRegistrosAlmacenados(int registros) {
        if (registros >= 0) this.registrosAlmacenados = registros;
    }
    
    
    // Metodos 
    // Método de comportamiento que imprime en consola todos los datos actuales del objeto
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Registros almacenados: " + registrosAlmacenados);
    }
    
    
    // Método que simula la acción de guardar un nuevo registro de conocimiento
    public void almacenarConocimiento() {
        registrosAlmacenados++;
        System.out.println(nombre + " almacena un nuevo registro de conocimiento. Total: " + registrosAlmacenados);
    }
    
    // Método que simula la acción de transmitir información a un humano
    public void educarHumano() {
        System.out.println(nombre + " transmite conocimiento a un nuevo humano.");
    }
    
} // Fin de la Clase publica 
