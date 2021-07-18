/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcs.faculdadeExtends;

/**
 *
 * @author Kari7
 */
public class TecnecioExp extends AlunoExplosivo {
    private String regpro;
    
    //GetSet

    public String getRegpro() {
        return regpro;
    }

    public void setRegpro(String regpro) {
        this.regpro = regpro;
    }
    
    //Tecnécio
    public void praticar(){
        System.out.println(this.getNome() + " praticou!");
    }

    
}
