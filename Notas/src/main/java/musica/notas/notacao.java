/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musica.notas;

/**
 *
 * @author mario
 */
public class notacao {

    
    public void incremental(int incremento){
        
        
        String notal[] = {"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A",
                          "A#/Bb", "B"}; //12 Notas de 0 até 11;
        String nNotal[]= {"Do", "Do#/Reb", "Re", "Re#/Mib", "Mi", "Fa", "Fa#/Solb", "Sol",
                          "Sol#/Lab", "La", "La#/Sib", "Si"};
        
        String concatenarMaior = "";
        String concatenarMenorN = "";
        String concatenarMenorH = "";
        String concatenarMenorM = "";
        
        String acordeFTQ = ""; //Fundamental, Terceira, Quarta
        String acordeFTJ = ""; //Fundamental, Terceira Menor, 5 Justa
        String acordeQNA = ""; //Fundamental, Terceira Maior, 5 Aumentada
        String acordeDMT = ""; //Fundamental, Terceira Menor, 5 Diminuta
        String acordeSUS1 = ""; //Fundamental, 2ª Maior, 5ª Justa 0, 2, 7
        String acordeSUS2 = ""; //Fundamental, 4ª Justa, 5ª Justa 0, 5, 7
        
        int contadorIncrementado = 0;
        
        
        
        int temp1 = 8+incremento; //Valor 8 do Valor
        int temp2 = 7+incremento; //Valor 7 do Valor
        int temp3 = 4+incremento; //Valor 4 do Valor
        int temp4 = 0+incremento; //Valor 0 do Valor
        int temp5 = 3+incremento; //Valor 3 do Valor
        int temp6 = 6+incremento; //Valor 6 do Valor
        int temp7 = 5+incremento; //Valor 5 do Valor
        int temp8 = 2+incremento; //Valor 2 de Valor
        
        //Escala Maior
        //T T ST T T T ST
        //Tom pula em 2 em 2
        for(int contador=0; contador<=11; contador+=2){
            contadorIncrementado = contador + incremento;
           //o Terceiro pulo é 6, pois é o terceiro 2 x 3 = 6.
            if (contador == 6){ //Semitom
                contador--;
                contadorIncrementado--;
            }
            //O Contador Incrmentado considera que caso igual a 12
            //Retorne a Zero, e caso for maior que que 12, diminua.
            if (contadorIncrementado == 12){
                contadorIncrementado = 0;
            } else if (contadorIncrementado > 12){
                contadorIncrementado = contadorIncrementado - 12;
            }
            //Temp 1 = 8
            if (temp1 == 12){
                temp1 = 0;
            } else if (temp1 > 12){
                temp1 = temp1 - 12;
            }
            //Temp 2 = 7
            if (temp2 == 12){
                temp2 = 0;
            } else if (temp2 > 12){
                temp2 = temp2 - 12;
            }
            //Temp 3 = 4
            if (temp3 == 12){
                temp3 = 0;
            } else if (temp3 > 12){
                temp3 = temp3 - 12;
            }
            //Temp 4 = 0
            if (temp4 == 12){
                temp4 = 0;
            } else if (temp4 > 12){
                temp4 = temp4 - 12;
            }
            //Temp 6 = 0
            if (temp6 == 12){
                temp6 = 0;
            } else if (temp6 > 12){
                temp6 = temp6 - 12;
            }
            //Temp 8 = 2
            if (temp8 == 12){
                temp8 = 0;
            } else if (temp8 > 12){
                temp8 = temp8 - 12;
            }
            //Temp 7 = 5
            if (temp7 == 12){
                temp7 = 0;
            } else if (temp7 > 12){
                temp7 = temp7 - 12;
            }             
            concatenarMaior += notal[contadorIncrementado] + " ";
            //Provavelmente Acorde Maior
            if (contadorIncrementado == temp4 || contadorIncrementado == temp3 || contadorIncrementado == temp2){
                acordeFTQ += notal[contadorIncrementado] + " ";
            }
            //Acorde com Quinta Aumentada
            if (contadorIncrementado == temp4 || contadorIncrementado == temp3 || contadorIncrementado == temp2){
                if(contadorIncrementado != temp2){
                    acordeQNA += notal[contadorIncrementado] + " ";
                } else {
                    acordeQNA += notal[temp1]+" ";
                }
            }
            //Acorde Suspenso de 2ª Maior   0, 2 ,7 //Mas o último dá "bug", então diminui em -1, logo 6
             if (contadorIncrementado == temp4 || contadorIncrementado == temp8 || contadorIncrementado == temp2){
                if(contadorIncrementado != temp2){
                    acordeSUS1 += notal[contadorIncrementado] + " ";
                } else {
                    acordeSUS1 += notal[temp2]+" ";
                }
            }
            //Acorde Suspenso de 4ª Justa   0, 5 ,7
            if (contadorIncrementado == temp4 || contadorIncrementado == temp7 || contadorIncrementado == temp2){
                if(contadorIncrementado != temp2){
                    acordeSUS2 += notal[contadorIncrementado] + " ";
                } else {
                    acordeSUS2 += notal[temp2]+" ";
                }
            }
            
        }
        
        //Escala Menor Natural
        // T T ST T T ST T
        // 0 0 04 0 0 09 00
        // 0 2 03 5 7 08 10
        
        for(int contador=0; contador<=11; contador+=2){
            contadorIncrementado = contador + incremento;
           //o Terceiro pulo
            if (contador == 4){ //Semitom
                contador--;
                contadorIncrementado--;
            }
            //O Sexto pulo é Semitom
            if (contador == 9){ //Semitom
                contador--;
                contadorIncrementado--;
            }           
            //O Contador Incrmentado considera que caso igual a 12
            //Retorne a Zero, e caso for maior que que 12, diminua.
            if (contadorIncrementado == 12){
                contadorIncrementado = 0;
            } else if (contadorIncrementado > 12){
                contadorIncrementado = contadorIncrementado - 12;
            }
            concatenarMenorN += notal[contadorIncrementado] + " ";
            //Temp 2 = 7
            if (temp2 == 12){
                temp2 = 0;
            } else if (temp2 > 12){
                temp2 = temp2 - 12;
            }
            //Temp 5 = 3
            if (temp5 == 12){
                temp5 = 0;
            } else if (temp3 > 12){
                temp5 = temp5 - 12;
            }
            //Temp 4 = 0
            if (temp4 == 12){
                temp4 = 0;
            } else if (temp4 > 12){
                temp4 = temp4 - 12;
            }
            //Temp 6 = 6
            if (temp6 == 12){
                temp6 = 0;
            } else if (temp4 > 12){
                temp6 = temp4 - 12;
            }
            //Temp 7 = 5
            if (temp7 == 12){
                temp7 = 0;
            } else if (temp7 > 12){
                temp7 = temp7 - 12;
            }
            //Acorde Menor
            if (contadorIncrementado == temp4 || contadorIncrementado == temp5 || contadorIncrementado == temp2){
                acordeFTJ += notal[contadorIncrementado] + " ";
            }
            //Acorde Menor Diminuto (0, 3, 6)
            if (contadorIncrementado == temp4 || contadorIncrementado == temp5 || contadorIncrementado == temp7){
                if(contadorIncrementado != temp7){
                    acordeDMT += notal[contadorIncrementado] + " ";
                } else {
                    acordeDMT += notal[temp6]+ " ";
                }
            }
        }
        
        //Escala Menor Harmônica
        // T T ST T T ST T+ST
        // 0 0 04 0 0 09 10
        // 0 2 03 5 7 08 11
        
        for(int contador=0; contador<=11; contador+=2){
            contadorIncrementado = contador + incremento;
           //o Terceiro pulo
            if (contador == 4){ //Semitom
                contador--;
                contadorIncrementado--;
            }
            //O Sexto pulo é Semitom
            if (contador == 9){ //Semitom
                contador--;
                contadorIncrementado--;
            } 
            //O Sétimo pulo é é Tom + Semitom
             if (contador == 10){ //Semitom
                contador++;
                contadorIncrementado++;
            }            
            //O Contador Incrmentado considera que caso igual a 12
            //Retorne a Zero, e caso for maior que que 12, diminua.
            if (contadorIncrementado == 12){
                contadorIncrementado = 0;
            } else if (contadorIncrementado > 12){
                contadorIncrementado = contadorIncrementado - 12;
            }
            concatenarMenorH += notal[contadorIncrementado] + " ";
        }
        
        //Escala Menor Melódica
        // T T ST T T ST+ST BEQUADRO
        // 0 0 04 0 0 09 00
        // 0 2 03 5 7 09 11
        
        
        
        
        for(int contador=0; contador<=11; contador+=2){
            contadorIncrementado = contador + incremento;
           //o Terceiro pulo
            if (contador == 4){ //Semitom
                contador--;
                contadorIncrementado--;
            }
            //O Sexto pulo é Semitom
            if (contador == 8){ //Semitom
                contador++;
                contadorIncrementado++;
            } 
            //O Sétimo pulo é Semitom
            if (contador == 10){ //Semitom
                contador++;
                contadorIncrementado++;
            }          
             //O Contador Incrmentado considera que caso igual a 12
            //Retorne a Zero, e caso for maior que que 12, diminua.
            if (contadorIncrementado == 12){
                contadorIncrementado = 0;
            } else if (contadorIncrementado > 12){
                contadorIncrementado = contadorIncrementado - 12;
            }
            concatenarMenorM += notal[contadorIncrementado] + " ";

        }
        
                
        
        System.out.println("A Escala maior de " + nNotal[incremento]+ " equivale a " + concatenarMaior);
        System.out.println("O Acorde maior: " + acordeFTQ);
        System.out.println("O Acorde maior com Quinta Aumentada: " + acordeQNA);
        System.out.println("O Acorde suspenso de 2a Maior: " + acordeSUS1);
        System.out.println("O Acorde suspenso de 4a Justa: " + acordeSUS2);
        System.out.println("A Escala menor natural de " + nNotal[incremento]+ " equivale a " + concatenarMenorN);
        System.out.println("O Acorde menor: " + acordeFTJ);
        System.out.println("O Acorde menor com Quinta Diminuta: " + acordeDMT);
        System.out.println("A Escala menor harmonica de " + nNotal[incremento]+ " equivale a " + concatenarMenorH);
        System.out.println("A Escala menor melodica de " + nNotal[incremento]+ " equivale a " + concatenarMenorM);
        
        
    }
}
