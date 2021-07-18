/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmk.cargosdegenmukai;

/**
 *
 * @author mario
 */
public class PainelGenmukai {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        //10 pessoas
        members membros[] = new members[10];
        membros[0] = new members("Blue Mark Cloud", 1);
        membros[1] = new members("Hisokami", 0);
        membros[2] = new members("GabrielJP", 6302);
        membros[3] = new members("Josoveldo", 54);
        membros[4] = new members("Karimasen", 0);
        membros[5] = new members("Nep", 9356);
        membros[6] = new members("Oreko", 69);
        membros[7] = new members("Rx7 Slayer", 3306);
        membros[8] = new members("Sakamoto", 9494);
        membros[9] = new members("StarWorld7", 7);
        
        
        //10 cargos
        cargos roles[] = new cargos[10];
        
        //DONO
        roles[0] = new cargos("Kokoro", membros[1], true);
        
        //ADMS
        roles[1] = new cargos("Administrador", membros[4], true);
        roles[2] = new cargos("Administrador", membros[8], true);
        
        //MEMBROS
        roles[3] = new cargos("Youkai", membros[0], true);
        roles[4] = new cargos("Youkai", membros[2], true);
        roles[5] = new cargos("Youkai", membros[3], true);
        roles[6] = new cargos("Youkai", membros[5], true);
        roles[7] = new cargos("Youkai", membros[6], true);
        roles[8] = new cargos("Youkai", membros[7], true);
        roles[9] = new cargos("Youkai", membros[9], true);   
        
        
        //Operações
        
        
        roles[9].obter("Satori");
        roles[1].removerCargo(membros[4]);
        roles[4].tirar();
        roles[4].obter("O poderoso e superior cargo de todos!");
        roles[4].removerCargo(membros[8]);
        

        
        roles[0].respondezil(); //Hisokami
        roles[1].respondezil(); //Eu
        roles[9].respondezil(); //StarWorld7
        roles[4].respondezil(); //GabrielJP
        roles[2].respondezil(); //Sakamoto
        
    }
}
