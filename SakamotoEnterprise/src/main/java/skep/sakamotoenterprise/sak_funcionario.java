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
public class sak_funcionario extends sak_gerente {
    
    
    //Atributos
    private boolean trabalhar;
    
    //GetSet
    public boolean getTrabalhar() {
        return trabalhar;
    }
    public void setTrabalhar(boolean trabalhar) {
        this.trabalhar = trabalhar;
    }
    
 //Método
    public void trabalhar(){
        if(this.getTrabalhar() == false){
            this.setTrabalhar(true);
            System.out.println(this.getNome() + " esta trabalhando");
        }
    }
    
    public void naotrabalhar(){
        if(this.getTrabalhar() == true){
            this.setTrabalhar(false);
            System.out.println(this.getNome() + " nao esta trabalhando");
        }        
    }
    
    //Métodos de Sakamotum
  @Override
    public void acao() {
        
        if(this.getSex().equals("M")){
            if(this.getTrabalhar() == true){
                System.out.println("O funcionario " + this.getNome() + " esta trabalhando");
            } else {
                System.out.println("O funcionario " + this.getNome() + " nao esta trabalhando");
            }
        } else if(this.getSex().equals("F")){
            if(this.getTrabalhar() == true){
                System.out.println("A funcionaria " + this.getNome() + " esta trabalhando");
            } else {
                System.out.println("A funcionaria " + this.getNome() + " nao esta trabalhando");
            }
        } else{
            if(this.getTrabalhar() == true){
                System.out.println(this.getNome() + " esta trabalhando");
            } else {
                System.out.println(this.getNome() + " nao esta trabalhando");
            }
        }
        
    }
    
    
}
