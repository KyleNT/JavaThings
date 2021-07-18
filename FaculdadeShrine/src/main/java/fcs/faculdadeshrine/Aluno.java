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
public class Aluno extends PessoaComum {
    //Extends é uma herança da classe PessoaComum para a classe aluno
    
    private String curso;
    private int matricular;
    
    //getter e setter

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricular() {
        return matricular;
    }

    public void setMatricular(int matricular) {
        this.matricular = matricular;
    }
    
    //metodos padrão windows 7
    public void trancarCu(){
        
        //O getNome veio pois é da classe-mãe PessoaComum
        this.setCurso("Sem curso");
        System.out.println(this.getNome() + " status: " + this.getCurso());
    }
    
    
}
