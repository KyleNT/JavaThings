/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kari7.geometricmean;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kari7
 */
public class GeometricMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedEncodingException {
        // TODO code application logic here
    try {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        Locale locale;
        locale = new Locale("no", "");
        
        out.println("Velkommen til Geometrisk Gjennomsnitt Kalkulator! Skriv inn \"0\" for å avbryte. ");
        Scanner warley = new Scanner(System.in);
        
        /* Método antigo
        int ricoop[] = new int[5], rest;
        double paodecheese, lady, naipes; //Double variables
        
        for(rest=0; rest<5; rest++){
            System.out.println("Sett inn " + (rest+1) + ". nummer: ");
            ricoop[rest] = warley.nextInt();
        }
        System.out.println("\n Geometrisk Gjennomsnitt");
        paodecheese = 1;
        for(rest=0; rest<5; rest++){
            paodecheese *= ricoop[rest];
        }
        lady = 1d / 5d; //Double number, 1d, 3.5d, etc.
        naipes = Math.pow(paodecheese, lady);
        
        if (naipes > 4) {
            System.out.println("Gratulerer!");
        } else {
            System.out.println("Er mindre enn fire");
        }
        
        System.out.println("Resultatet blir: " + naipes);
    */
        int rest = 0;
        double ricoop = 1, naipes, lady, diana;
        DecimalFormat warlyn = new DecimalFormat("#.##");
        do{
            out.println("Sett inn " + (rest+1) + ". nummer: ");
            naipes = warley.nextDouble();

            //Se o valor for Diferente de zero, multiplique o valor inserido
            //por memória
            if (naipes != 0){
                    ricoop *= naipes;
            } else {
                    ricoop *= 1;
            }
            //Se o resultado for diferente de zero, conte mais 1
            //Do contrário saia do loop
            if (naipes != 0) rest++;
            else break;

        } while(naipes != 0);

        out.println("\n Geometrisk Gjennomsnitt");
        lady = 1d/rest;
        diana = Math.pow(ricoop, lady);

	if (diana > 4) {
            out.println("Gratulerer!");
	} else {
            out.println("Er mindre enn fire");
        }
        
        out.println("Resultatet blir: " + warlyn.format(diana));

        }
        catch (Exception e) {
              e.printStackTrace();
        }
    }
}
