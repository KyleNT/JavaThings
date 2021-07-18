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
public abstract class PessoaBemComum {
    //Aqui não pode ter filhos, e nem pode ser instanciada.
    
    //Atributos protegidos, pois dá acesso a classe e subclasses
    protected String nome;
    protected int idade;
    protected String sex;
    protected int zatodos; //De Cálcio!
    
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

    public int getZatodos() {
        return zatodos;
    }

    public void setZatodos(int zatodos) {
        this.zatodos = zatodos;
    }
    
    //Métodos Enraizados Abstratos FINAIS
    
    //Isto é, eles não podem ser sobrescritos.
    public final void fazerAniv(){
        this.setIdade(getIdade() + 1);
    }
    
    public final void emitirZatodos(){
        
        if(getZatodos() >= 0){
            this.setZatodos(getZatodos() + 1);
            System.out.println(this.getNome() + " emitiu " + this.getZatodos() + " zatodos de Calcio!");
        } else {
            System.out.println("Sem Zatodos");
        }
    }
    
    public final void dissiparZatodos(){
        
         if(getZatodos() >= 0){
            this.setZatodos(getZatodos() - 1);
            System.out.println(this.getNome() + " emitiu " + this.getZatodos() + " zatodos de Calcio!");
        } else {
            System.out.println("Sem Zatodos");
        }       
        
    }

    @Override
    public String toString() {
        return "Dados: {" + "nome=" + nome + ", idade=" + idade + ", sex=" + sex + ", zatodos=" + zatodos + '}';
    }
    
    
    
    
}
