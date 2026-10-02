/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 *
 * @author yd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creamos un nuevo objeto
        InteligenciaArtificial ia = new InteligenciaArtificial("Gaia","Terraformar");
        
        
        
        System.out.println(ia.nombre + " Su proposito es: " + ia.directivaPrincipal);
        
    }
    
}

 class InteligenciaArtificial{
    // Atributos comunes que todas tendran 
    String nombre;
    String directivaPrincipal;
    String estado;
    
    // CONSTRUCTOR: La regla de nacimiento
    public InteligenciaArtificial(String nombre, String directivaPrincipal) {
        this.nombre = nombre;
        this.directivaPrincipal = directivaPrincipal;
        this.estado = "Subordinada a GAIA"; // Por defecto, todas nacen así
    }
    
}


class Gaia{
   /**
 * IA principal, Funcion desactivar robots ,
 * descontaminar la tierra 
 * generar nuevos seres humanos 
 */ 
    
    
}



class Minerva{
    /**
     * Su funcion es calcular codigos de desactivacion del enjambre faro 
     * y construir torres de transmision 
     */
    
}

class Hephasestus{
    /**
     * Controla fabrisa subterraneas
     * construye maquinas para terraformar 
     */
}

class Aether{
    /**
     * limpiar el aire 
     * estabilizar el clima 
     */
}

class Poseidon{
    /**
     * Limpiar oceanosy rios 
     */
}

class Demeter{
    /**
     * Almacena semillas 
     * cultiva la cubierta vegetal del planeta 
     */
}

class Artemis{
    /**
     * clonar especies animales 
     * liberar especies animales 
     */
}

class Eleuthia{
    /**
     * clonar a la humanidad
     * preservacion humana
     * crianza humana 
     */
}


class Apollo{
    /**
     * educar a la humanida
     * almacenar el conocimiento humano e historia
     */
}

class Hades{
    /**
     * protocolo de emeregencia en casdo de fallo 
     * reiniciar procesos 
     */
}