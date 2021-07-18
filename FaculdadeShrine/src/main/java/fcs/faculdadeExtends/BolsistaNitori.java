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
public class BolsistaNitori extends AlunoExplosivo {
    //Você viu que aqui não extendeu para Pessoa, mas sim do Aluno.
    //Bolsista é uma especialização de Aluno
    //Vai ter tudo de pessoa, e também de Aluno
    
    //Atributos
    private int bolsa;
    private int zanions;
    
    //Getter e Setter

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public int getZanions() {
        return zanions;
    }

    public void setZanions(int zanions) {
        this.zanions = zanions;
    }
    
    //Métodos
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    public void emitirZanions(){
        if(this.getZanions() >= 0){
            this.setZanions(this.getZanions() + 1);
            System.out.println(this.getNome() + " emitiu " + this.getZanions() + " zanions!");
        } else {
            System.out.println("Sem Zanions");
        }
    }
    
    public void dissiparZanions(){
        if(this.getZanions() >= 0){
            this.setZanions(this.getZanions() - 1);
            System.out.println(this.getNome() + " emitiu " + this.getZanions() + " zanions!");
        } else {
            System.out.println("Sem Zanions");
        }        
    }
    
    //Bolsista paga diferente de Aluno comum
    //Logo irá sobrepor
    
    @Override
    public void mensal(){
        //Encapsulamento: Proteger tudo
        //Herança: Dar características e comportamentos para filhas
        //Polimorfismo: Fazer coisas diferentes
        if (getSex().equals("M")){
            System.out.println(this.getNome() + " e bolsista integral. Ele e foda.");
        } else if (getSex().equals("F")){
            System.out.println(this.getNome() + " e bolsista integral. Ela e foda.");
        } else {
            System.out.println(this.getNome() + " e bolsista integral. Respeito as diferencas!");
        }
    }
    
}
