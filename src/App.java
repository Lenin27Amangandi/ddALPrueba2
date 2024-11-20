import ddlaUcranea.Automata;
import ddlaUcranea.ddlaAlumnos;

public class App {
    public static ddlaAlumnos persona = new ddlaAlumnos();
    public static void main(String[] args) throws Exception {
    
        try {
            App.persona.ingresar();
            Automata aut=new Automata();
            aut.validarAutomata();
        } catch (Exception e) {}
    
    }
}
