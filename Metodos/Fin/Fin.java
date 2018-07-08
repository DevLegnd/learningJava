/* 
 * Este programa ha sido desarrollado por Luis Adolfo Pimentel | @lapc18 | DevLegnd | Nice Corp
 * Metodos: FIN
*/

import java.util.Scanner;

class Fin{

    public static Integer intTryParse(String num){
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static Boolean finPrograma(){
        Boolean intentos = true;
        while(intentos){
            Scanner read = new Scanner(System.in);
            System.out.print("Desea salir? \n1 - SI \t2 - NO\n:>");
            String reader = read.next();
            int opcion = intTryParse(reader);
            if(opcion == 1){
                intentos = false;
                break;
            }
            else if(opcion == 2){
                intentos = true;
                break;
            }
        }
        return intentos;
    }

    public static void main(String[] args) {
        Boolean intentos = true;
        while(intentos){
            // Todo el codigo a ejecutar
            System.out.println("Hi");
            //aqui el fin programa
            if(!(finPrograma())){ intentos = false; }
        }
    }
}