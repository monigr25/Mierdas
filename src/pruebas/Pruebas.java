/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Moni
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Esto es una prueba de ver si se sube lo nuevo");
    }
    private static TipoMod llegirAct(String msg) {
        TipoMod act = null;
        try {
            boolean ok = false;
            String s;
            int x = 0;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            while (!ok) {
                System.out.print(msg);
                s = in.readLine();
                x = Integer.parseInt(s);
                ok = (x == 1 || x == 2 || x == 3);
            }
            switch (x) {
                case 1:
                    act = TipoMod.SUST;
                    break;
                case 2:
                    act = TipoMod.ORD;
                    break;
                case 3:
                    act = TipoMod.ORDYSUST;
                    break;
                case 4:
                    act = TipoMod.ANLETRA;
                    break;
                case 5:
                    act = TipoMod.ORDYAN;
                    break;
            }
        } catch (IOException e) {
        } catch (NumberFormatException e) {
        }
        return act;
    }
    
}
