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
public abstract class sakamotum {
    //Atributos protegidos
    protected String nome;
    protected int idade;
    protected String sex;

    //GetSet
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
    
    //Métodos Abstrato
    public abstract void acao();
    
    //String geral

    @Override
    public String toString() {
        return "Pessoa: {" + "nome = " + nome + ", idade = " + idade + ", sex = " + sex + '}';
    }
    
    
}
