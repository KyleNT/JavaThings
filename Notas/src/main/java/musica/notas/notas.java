/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musica.notas;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class notas {
    public static void main(String[] args) {

        int incremento = 0;
        
        notacao vespasiano = new notacao();
        Scanner warlyn = new Scanner(System.in);
        System.out.println("Digite qual nota voce quer ver em escala");
        System.out.println("0 = C | 1 = C# | 2 = D | 3 = D# | 4 = E | 5 = F | 6 = F# | 7 = G |");
        System.out.println("8 = G# | 9 = A | 10 = A# | 11 = B");
        incremento = warlyn.nextInt();
        
        //Nome da Classe e do Método
        
        //Incremento será o inteiro
        vespasiano.incremental(incremento);
 
    }
    
}
