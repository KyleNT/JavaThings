/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skep.sakamotoenterprise;

/**
 *
 * @author Kari7
 */
public class sak_visitante extends sakamotum {


        
    //Métodos de Sakamotum
    @Override
    public void acao() {
        
        if (this.getSex().equals("M")){
                System.out.println("O Visitante " + this.getNome() + " esta andando");
        } else if (this.getSex().equals("F")){
                System.out.println("A Visitante " + this.getNome() + " esta andando");
        } else {
                System.out.println(this.getNome() + " esta andando");
        }
                
    }
    /* Aqui será os dados do Visitante */
    
}
