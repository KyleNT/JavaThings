/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcs.faculdadeshrine;

/**
 *
 * @author Kari7
 */
public class Funcionario extends PessoaComum {
    //Atributos
    private String setor;
    private boolean trabalhar;
    
    //Getters e Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhar() {
        return trabalhar;
    }

    public void setTrabalhar(boolean trabalhar) {
        this.trabalhar = trabalhar;
    }
    
    //Métodos
    public void mudarTrabalho(String trab){
        
        //O getNome veio pois é da classe-mãe PessoaComum
         System.out.println(this.getNome() + " nao trabalha mais em: " + this.getSetor());
         this.setTrabalhar(false);
         System.out.println(this.getNome() + " trabalha agora em: " + trab);
         this.setSetor(trab);
         this.setTrabalhar(true);
    }
    
}
