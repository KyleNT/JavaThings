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
public class sak_gerente extends sakamotum {
    //Atributos
    private boolean gerenciar;
   
    
    //GetSet
    public boolean getGerenciar() {
        return gerenciar;
    }

    public void setGerenciar(boolean gerenciar) {
        this.gerenciar = gerenciar;
    }
    
    //Método
    public void gerenciador(){
        if(this.getGerenciar() == false){
            this.setGerenciar(true);
            System.out.println(this.getNome() + " esta gerenciando");
        }
    }
    
    public void desgerenciar(){
        if(this.getGerenciar() == true){
            this.setGerenciar(false);
            System.out.println(this.getNome() + " esta desgerenciando");
        }        
    }

    //Métodos de Sakamotum
    @Override
    public void acao() {
        
        if(this.getSex().equals("M")){
            if(this.getGerenciar() == true){
                System.out.println("O gerente " + this.getNome() + " esta gerenciando");
            } else {
                System.out.println("O gerente " + this.getNome() + " esta desgerenciando");
            }
        } else if(this.getSex().equals("F")){
            if(this.getGerenciar() == true){
                System.out.println("A gerente " + this.getNome() + " esta gerenciando");
            } else {
                System.out.println("A gerente " + this.getNome() + " esta desgerenciando");
            }
        } else{
            if(this.getGerenciar() == true){
                System.out.println(this.getNome() + " esta gerenciando");
            } else {
                System.out.println(this.getNome() + " esta desgerenciando");
            }
        }
        
    }
    
    
}
