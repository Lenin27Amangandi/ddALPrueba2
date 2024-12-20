package ddlaUcranea;

public class ddlaAlumnos {

    private String ddlausuario1;
    private String ddlausuario2;
    private String ddlausuario3;
    private String ddlaclave;
    private Automata autonoma;

    public ddlaAlumnos() {
        autonoma=new Automata();
        setDdlausuario1("diaz");
        setDdlausuario2("amangandi");
        setDdlausuario3("paccha");
        setDdlaclave("1234");
    }

    public boolean ingresar() {
        System.out.println("\nVamos a validar thus credenciales\n");
        String usuario;
        String ddlaclave;
        boolean sinLogeo = true;
        int ddlaintentos = 0;
        final int ddlaIntmax = 3;

        do {
            System.out.print("Ingrese su usuario: ");
            usuario = utilitario.sc.nextLine();
            System.out.print("Ingrese su ddlaclave: ");
            ddlaclave = utilitario.sc.nextLine();
            if ((this.ddlausuario1.equalsIgnoreCase(usuario) || this.ddlausuario2.equalsIgnoreCase(usuario)
                    || this.ddlausuario3.equalsIgnoreCase(usuario)) && this.ddlaclave.equalsIgnoreCase(ddlaclave)) {
                        ddlaLlamarAutonoma();
                return true;
            }

            ddlaintentos++;
            if (ddlaintentos >= ddlaIntmax) {
                System.out.println("Has excedido el número máximo de ddlaintentos.");
                return false;
            }

            System.out.print("Su usuario o ddlaclave son erroneos\nPara salir digite la letra [e]: ");
            if (utilitario.sc.nextLine().equalsIgnoreCase("e")) {
                return false;
            }
        } while (sinLogeo);
        return false;
    }

    public void ddlaLlamarAutonoma() {
        System.out.println("Vamos ");
        autonoma.validarAutomata();
    }

    public String getUsuario1() {
        return ddlausuario1;
    }

    public void setDdlausuario1(String ddlausuario1) {

        if (ddlausuario1 == null || ddlausuario1.isEmpty()) {
            ddlausuario1 = "Usuario Comun";
        }
        this.ddlausuario1 = ddlausuario1.toUpperCase();
    }

    public String getUsuario2() {
        return ddlausuario2;
    }

    public void setDdlausuario2(String ddlausuario2) {
        if (ddlausuario2 == null || ddlausuario2.isEmpty()) {
            ddlausuario2 = "Usuario Comun";
        }
        this.ddlausuario2 = ddlausuario2.toUpperCase();
    }

    public String getUsuario3() {
        return ddlausuario3;
    }

    public void setDdlausuario3(String ddlausuario3) {
        if (ddlausuario3 == null || ddlausuario3.isEmpty()) {
            ddlausuario3 = "Usuario Comun";
        }
        this.ddlausuario3 = ddlausuario3.toUpperCase();
    }

    public String getClave() {
        return ddlaclave;
    }

    public void setDdlaclave(String ddlaclave) {

        if (ddlaclave == null || ddlaclave.isEmpty()) {
            ddlaclave = "";
        }
        this.ddlaclave = ddlaclave;
    }

    public String getDdlaclave() {
        return ddlaclave;
    }

}
