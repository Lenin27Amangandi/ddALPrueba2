package ddlaUcranea;

import java.io.InputStream;
import java.util.Scanner;

public class Automata {
    final String alfabeto = "a,b,c,d,t, ";
    private final int ee = -1;
    int matriz[][] = { // a b c d t esp
            { 1, ee, ee, ee, ee, ee },
            { ee, 1, 2, ee, ee, ee },
            { ee, ee, ee, 2, 3, ee },
            { ee, ee, ee, ee, 3, ee },
    };

    public void validarAutomata() {

        InputStream inputStream = getClass().getResourceAsStream("lectura.txt");
        if (inputStream == null) {
            System.out.println("Error: No se encontró el archivo lectura.txt.");
            return;
        }

        @SuppressWarnings("resource")
        Scanner lectura = new Scanner(inputStream);

        while (lectura.hasNextLine()) {
            String tipoArsenal = lectura.nextLine();
            char actual[] = tipoArsenal.toCharArray();
            int n = 0;

            for (char c : actual) {
                int indice = devolverIndice3(c);
                if (indice < 0 || matriz[n][indice] == ee) {
                    n = ee;
                    break;
                }
                n = matriz[n][indice];
            }

            if (n == 1 || n == 2 || n == 3 || n == ee) {
                switch (n) {
                    case 1:
                        ddlaloading();
                        System.out.print(" corrd-02 " + " | " + tipoArsenal);
                        System.out.println();
                        break;
                    case 2:
                        ddlaloading();
                        System.out.print(" corrd-04 " + " | " + tipoArsenal);
                        System.out.println();
                        break;
                    case 3:
                        ddlaloading();
                        System.out.print(" corrd-05 " + " | " + tipoArsenal);
                        System.out.println();
                        break;
                    case ee:
                        System.out.print(" ");
                        break;
                    default:
                        System.out.println("no se acepto");
                        break;
                }
            }
        }
    }

    @SuppressWarnings("resource")
    private int devolverIndice3(char numero) {
        Scanner lecturaAlfabeto = new Scanner(alfabeto).useDelimiter(",");

        for (int k = 0; lecturaAlfabeto.hasNext(); k++) {
            String siguiente = lecturaAlfabeto.next();
            if (numero == siguiente.charAt(0)) {
                return k;
            }
        }
        return -1;
    }

    public void ddlaloading() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + i + "%");
            try {
                Thread.sleep(20);
            } catch (InterruptedException ie) {
            }
        }
    }

}
