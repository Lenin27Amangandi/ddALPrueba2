import ddlaUcranea.Automata;
import ddlaUcranea.ddlaAlumnos;

public class App {
    public static ddlaAlumnos persona = new ddlaAlumnos();
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("*    Escuela Politécnica Nacional     *");
        System.out.println("*                                     *");
        System.out.println("*    Integrantes                      *");
        System.out.println("*    Nombre1:AmangandiLenin           *");
        System.out.println("*    Cedula1:1753193828               *");
        System.out.println("*    Nombre1:DiazDavis                *");
        System.out.println("*    Cedula2:1760120145               *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
        System.out.println();
    
        try {
            App.persona.ingresar();
            // aut.validarAutomata();
        } catch (Exception e) {}
    
    }
}
