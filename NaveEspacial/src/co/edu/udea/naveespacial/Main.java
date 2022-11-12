package co.edu.udea.naveespacial;

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final boolean PROBLEMA_TECNICO = true;
        Nave nave = new Nave();
        LeerArchivo.crearNave(nave);
        ArrayList<Rover> rovers = new ArrayList<>();
        Rover rover = new Rover();

        double probabilidad;

        for (int i = 1; i <= 10; i++) {
            if (i != 10) {
                probabilidad = nave.probabilidadCatastrofe();
                if (probabilidad <= 0.4) {
                    probabilidad = nave.probabilidadCatastrofe();
                    if (probabilidad <= 0.1) {
                        nave.aplicarColision(i);
                    } else if (probabilidad > 0.1 && probabilidad <= 0.5) {
                        nave.aplicarLocura(i);
                    } else if (probabilidad > 0.5) {

                        nave.aplicarFuga(i);
                    }
                }
            }
            if (i == 10) {
                //En el tick 10 ya se llego a marte 
                if (PROBLEMA_TECNICO) {
                    System.out.println("PROBLEMA AL LLEGAR A MARTE");
                    /*
                     * llamado al metodo eyectarFamiliasDeNave
                     */
                    nave.eyectarFamiliasDeNave(rovers);

                    //ya tengo los revers con cada familia, lo que sigue es hacer el recorrido de cada rover
                    rover.recorridoRover(rovers);

                    //nave.consultarMatriz();
                    System.out.println(rovers.size());
                  
                    
                    
                } else {
                    nave.consultarMatriz();
                    //nave.registroMuertos();
                    //System.out.println(" ");
                    //nave.registroSobrevivientes();
                }

            }
        }

    }

}
