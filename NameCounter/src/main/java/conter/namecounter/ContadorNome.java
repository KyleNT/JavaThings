/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conter.namecounter;

import java.util.Scanner;



/**
 *
 * @author mario
 */
public class ContadorNome {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int count = 0;
        String texter;
        int totalCharacters[] = new int[26];
        char letras[] = new char[26];
        char temp;
        
        letras[0] = 'a';
        letras[1] = 'b';
        letras[2] = 'c';
        letras[3] = 'd';
        letras[4] = 'e';
        letras[5] = 'f';
        letras[6] = 'g';
        letras[7] = 'h';
        letras[8] = 'i';
        letras[9] = 'j';
        letras[10] = 'k';
        letras[11] = 'l';
        letras[12] = 'm';
        letras[13] = 'n';
        letras[14] = 'o';
        letras[15] = 'p';
        letras[16] = 'q';
        letras[17] = 'r';
        letras[18] = 's';
        letras[19] = 't';
        letras[20] = 'u';
        letras[21] = 'v';
        letras[22] = 'w';
        letras[23] = 'x';
        letras[24] = 'y';
        letras[25] = 'z';        
        
        System.out.println("Informe um texto em miniusculas, sem acentos:");
        Scanner warley = new Scanner(System.in);
        texter = warley.nextLine();
        
        int stringLength = texter.replace(" ", "").length();
        
        do{
            //Detectar um caractere específico
            temp = texter.charAt(count);
            switch (temp) {
                case 'a':
                    totalCharacters[0] += 1;
                    break;
                case 'b':
                    totalCharacters[1] += 1;
                    break;
                case 'c':
                    totalCharacters[2] += 1;
                    break;
                case 'd':
                    totalCharacters[3] += 1;
                    break;
                case 'e':
                    totalCharacters[4] += 1;
                    break;
                case 'f':
                    totalCharacters[5] += 1;
                    break;
                case 'g':
                    totalCharacters[6] += 1;
                    break;
                case 'h':
                    totalCharacters[7] += 1;
                    break;
                case 'i':
                    totalCharacters[8] += 1;
                    break;
                case 'j':
                    totalCharacters[9] += 1;
                    break;
                case 'k':
                    totalCharacters[10] += 1;
                    break;
                case 'l':
                    totalCharacters[11] += 1;
                    break;
                case 'm':
                    totalCharacters[12] += 1;
                    break;
                case 'n':
                    totalCharacters[13] += 1;
                    break;
                case 'o':
                    totalCharacters[14] += 1;
                    break;
                case 'p':
                    totalCharacters[15] += 1;
                    break;
                case 'q':
                    totalCharacters[16] += 1;
                    break;
                case 'r':
                    totalCharacters[17] += 1;
                    break;
                case 's':
                    totalCharacters[18] += 1;
                    break;
                case 't':
                    totalCharacters[19] += 1;
                    break;
                case 'u':
                    totalCharacters[20] += 1;
                    break;
                case 'v':
                    totalCharacters[21] += 1;
                    break;
                case 'w':
                    totalCharacters[22] += 1;
                    break;
                case 'x':
                    totalCharacters[23] += 1;
                    break;
                case 'y':
                    totalCharacters[24] += 1;
                    break;
                case 'z':
                    totalCharacters[25] += 1;
                    break;
                default:
                    break;
            }
            
           
            //Aqui conta o número de caracteres
            count++;
        } while (count != stringLength);
        
        //Mostre quantas vezes cada letra apareceu

        for(int jota=0; jota<26; jota++){
            if (totalCharacters[jota] == 1){
                System.out.println("A letra "+ letras[jota] +  " apareceu: " + totalCharacters[jota] + " vez");
            } else if (totalCharacters[jota] > 1){
                System.out.println("A letra "+ letras[jota] +  " apareceu: " + totalCharacters[jota] + " vezes");
            }
        }

        
    }
}
