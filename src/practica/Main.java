/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;



public class Main {

    public static void main(String[] args) {
        
        // CREAMOS NUEVOS OBJETOS 
        // ============ GAIA (IA principal) ============
        Gaia gaia = new Gaia("GAIA", "Restaurar la biosfera de la Tierra", "En línea", " Instalación Principal");
        gaia.mostrarInfo();
        gaia.activarSubordinadas();
        gaia.verificarSistema();
        System.out.println();

        // ============ MINERVA ============
        Minerva minerva = new Minerva();
        minerva.mostrarInfo();
        minerva.construirTorre();
        minerva.calcularCodigo();
        System.out.println();

        // ============ HEFESTO ============
        Hefesto hefesto = new Hefesto();
        hefesto.mostrarInfo();
        hefesto.fabricarMaquina();
        hefesto.abrirCauldron();
        System.out.println();

        // ============ AETHER ============
        Aether aether = new Aether();
        aether.mostrarInfo();
        aether.limpiarAire();
        aether.estabilizarClima();
        System.out.println();

        // ============ POSEIDÓN ============
        Poseidon poseidon = new Poseidon();
        poseidon.mostrarInfo();
        poseidon.limpiarOceano();
        poseidon.purificarRio();
        System.out.println();

        // ============ DEMÉTER ============
        Demeter demeter = new Demeter();
        demeter.mostrarInfo();
        demeter.almacenarSemilla();
        demeter.cultivarVegetacion();
        System.out.println();

        // ============ ARTEMISA ============
        Artemis artemis = new Artemis();
        artemis.mostrarInfo();
        artemis.clonarEspecie();
        artemis.liberarEspecie();
        System.out.println();

        // ============ ELEUTHIA ============
        Eleuthia eleuthia = new Eleuthia();
        eleuthia.mostrarInfo();
        eleuthia.clonarHumano();
        eleuthia.criarHumano();
        System.out.println();

        // ============ APOLO ============
        Apollo apollo = new Apollo("APOLO","Educar a la humanidad y preservar el conocimiento","Subordinada a GAIA",0 );
        apollo.mostrarInfo();
        apollo.almacenarConocimiento();
        apollo.educarHumano();
        System.out.println();

        // ============ HADES ============
        Hades hades = new Hades("HADES"," Protocolo de emergencia: reiniciar el proceso de terraformación" ,"Estado: En espera", 0);
        hades.mostrarInfo();
        hades.reiniciarProceso();
        hades.activarProtocolo();
    }
}



class Gaia {
    
    // Atributos 
    
    String nombre;
    String directiva;
    String estado;
    String ubicacion;
    
    // Constructor iniciando los atributos 
    
    public Gaia(String nombre, String directiva, String estado, String ubicacion) {
        this.nombre = nombre;
        this.directiva = directiva;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }
    
    // Metodos 
    
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



class Minerva {
    
    // Atributos 
    
    String nombre;
    String directiva;
    String estado;
    int torresConstruidas;

    // Constructor
    
    public Minerva() {
        this.nombre = "MINERVA";
        this.directiva = "Desactivar el enjambre Faro y construir torres de transmisión";
        this.estado = "Subordinada a GAIA";
        this.torresConstruidas = 0;
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



class Hefesto {
    
    // Atributos 
    
    String nombre;
    String directiva;
    String estado;
    int maquinasCreadas;
    
    // Constructor
    
    public Hefesto() {
        this.nombre = "HEFESTO";
        this.directiva = "Controlar fábricas subterráneas y construir máquinas terraformadoras";
        this.estado = "Subordinada a GAIA";
        this.maquinasCreadas = 0;
    }
    
    // Metodos 
    
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Máquinas creadas: " + maquinasCreadas);
    }

    public void fabricarMaquina() {
        maquinasCreadas++;
        System.out.println(nombre + " fabrica una máquina terraformadora. Total: " + maquinasCreadas);
    }

    public void abrirCauldron() {
        System.out.println(nombre + " abre una Cauldron para producción en serie.");
    }
}



class Aether {
    
    // Atributos 
    
    String nombre;
    String directiva;
    String estado;
    int nivelContaminacion;
    
    // Constructor
    
    public Aether() {
        this.nombre = "AETHER";
        this.directiva = "Limpiar el aire y estabilizar el clima";
        this.estado = "Subordinada a GAIA";
        this.nivelContaminacion = 100;
    }

    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Nivel de contaminación: " + nivelContaminacion);
    }

    public void limpiarAire() {
        nivelContaminacion -= 10;
        System.out.println(nombre + " limpia el aire. Contaminación actual: " + nivelContaminacion);
    }

    public void estabilizarClima() {
        System.out.println(nombre + " estabiliza las condiciones climáticas globales.");
    }
}


class Poseidon {
    
    // Atributos 
    
    String nombre;
    String directiva;
    String estado;
    int nivelPurezaAgua;
    
    // Constructor
    
    public Poseidon() {
        this.nombre = "POSEIDÓN";
        this.directiva = "Limpiar océanos y ríos";
        this.estado = "Subordinada a GAIA";
        this.nivelPurezaAgua = 0;
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



class Demeter {
    
    // Atributos 
    
    String nombre;
    String directiva;
    String estado;
    int semillasAlmacenadas;
    
    // Constructor
    
    public Demeter() {
        this.nombre = "DEMÉTER";
        this.directiva = "Almacenar semillas y cultivar la cubierta vegetal";
        this.estado = "Subordinada a GAIA";
        this.semillasAlmacenadas = 0;
    }
    
    // Metodos 
    
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Semillas almacenadas: " + semillasAlmacenadas);
    }

    public void almacenarSemilla() {
        semillasAlmacenadas++;
        System.out.println(nombre + " almacena una nueva semilla. Total: " + semillasAlmacenadas);
    }

    public void cultivarVegetacion() {
        System.out.println(nombre + " cultiva la cubierta vegetal en una zona del planeta.");
    }
}



class Artemis {
    
    // Atributos 
    
    String nombre;
    String directiva;
    String estado;
    int especiesClonadas;
    
    // Constructor
    
    public Artemis() {
        this.nombre = "ARTEMISA";
        this.directiva = "Clonar y liberar especies animales";
        this.estado = "Subordinada a GAIA";
        this.especiesClonadas = 0;
    }
    
    // Metodos 
    
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Especies clonadas: " + especiesClonadas);
    }

    public void clonarEspecie() {
        especiesClonadas++;
        System.out.println(nombre + " clona una especie animal. Total: " + especiesClonadas);
    }

    public void liberarEspecie() {
        System.out.println(nombre + " libera una especie al ecosistema.");
    }
}



class Eleuthia {
    
    // Atributos 
    String nombre;
    String directiva;
    String estado;
    int humanosCriados;
    
    // Constructor
    
    public Eleuthia() {
        this.nombre = "ELEUTHIA";
        this.directiva = "Clonar, preservar y criar a la humanidad";
        this.estado = "Subordinada a GAIA";
        this.humanosCriados = 0;
    }
    
    
    // Metodos
    
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Humanos criados: " + humanosCriados);
    }

    public void clonarHumano() {
        System.out.println(nombre + " clona un nuevo ser humano desde el banco genético.");
    }

    public void criarHumano() {
        humanosCriados++;
        System.out.println(nombre + " cría a un humano. Total: " + humanosCriados);
    }
}


class Apollo {
    
    // Atributos 

    String nombre;
    String directiva;
    String estado;
    int registrosAlmacenados;
    
    // Constructor Iniciando los atributos 
    
    public Apollo(String nombre, String directiva, String estado, int registros) {
        this.nombre = nombre ;
        this.directiva = directiva;
        this.estado = estado;
        this.registrosAlmacenados = registros;
    }
    
    // Metodos 
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Directiva: " + directiva);
        System.out.println("Estado: " + estado);
        System.out.println("Registros almacenados: " + registrosAlmacenados);
    }

    public void almacenarConocimiento() {
        registrosAlmacenados++;
        System.out.println(nombre + " almacena un nuevo registro de conocimiento. Total: " + registrosAlmacenados);
    }

    public void educarHumano() {
        System.out.println(nombre + " transmite conocimiento a un nuevo humano.");
    }
}



class Hades {
    
    // Atributos 
    String nombre;
    String directiva;
    String estado;
    int reiniciosEjecutados;
    
    // constructor Iniciando los atributos 
    public Hades(String nombre, String directiva, String estado, int reinicio) {
        this.nombre = nombre;
        this.directiva = directiva;
        this.estado = estado;
        this.reiniciosEjecutados = reinicio;
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