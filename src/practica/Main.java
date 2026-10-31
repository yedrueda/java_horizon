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
     *
     * @param args
     */
    public static void main(String[] args) {
        
        // CREAMOS NUEVOS OBJETOS 
        // ============ GAIA (IA principal) ============
        Gaia gaia = new Gaia("GAIA", "Restaurar la biosfera de la Tierra", "En línea", " Instalación Principal");
        // Llamamos a los metodos 
        gaia.mostrarInfo();
        gaia.activarSubordinadas();
        gaia.verificarSistema();
        gaia.setEstado("Operativa al 100%"); // seteamos o asignamos otro valor con SET
        System.out.println("Estado actualizado: " + gaia.getEstado()); // obtenemos el nuevo valor usando GET
        System.out.println();

        // ============ MINERVA ============
         Minerva minerva = new Minerva();
        minerva.mostrarInfo();
        minerva.construirTorre();
        minerva.calcularCodigo();
        minerva.setTorresConstruidas(5);
        System.out.println("Torres fijadas: " + minerva.getTorresConstruidas());
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
        aether.setNivelContaminacion(150); // rechazado por validación
        System.out.println("Contaminación tras intento inválido: " + aether.getNivelContaminacion());
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
        apollo.almacenarConocimiento();
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
