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
public class PessoaComum {
    //Atributos
    private String nome;
    private int idade;
    private String sex;
    private int zatodoDeCalcio;
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getZatodoDeCalcio() {
        return zatodoDeCalcio;
    }

    public void setZatodoDeCalcio(int zatodoDeCalcio) {
        this.zatodoDeCalcio = zatodoDeCalcio;
    }
    
    //Métodos padrão
    
    //Para fins didáticos não iremos utilizar a interface
    public void fazerAniversario(){
        this.setIdade(getIdade() + 1);
    }
    
    public void emitirZatodos(){
        if(this.getZatodoDeCalcio() >= 0){
            this.setZatodoDeCalcio(this.getZatodoDeCalcio() + 1);
            System.out.println(this.getNome() + " emitiu " + this.getZatodoDeCalcio() + " zatodos de Calcio!");
        } else {
            System.out.println("Sem Zatodos");
        }
    }
    
    public void dissiparZatodos(){
        if(this.getZatodoDeCalcio() >= 0){
            this.setZatodoDeCalcio(this.getZatodoDeCalcio() - 1);
            System.out.println(this.getNome() + " emitiu " + this.getZatodoDeCalcio() + " zatodos de Calcio!");
        } else {
            System.out.println("Sem Zatodos");
        }
    }
    
    //Função to String

    @Override
    public String toString() {
        return "PessoaComum{" + "nome = " + nome + ", idade = " + idade + ", sex = " + sex + ", zatodoDeCalcio = " + zatodoDeCalcio + '}';
    }
    
    
}
