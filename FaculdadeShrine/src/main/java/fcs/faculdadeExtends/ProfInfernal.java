/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcs.faculdadeExtends;

/**
 *
 * @author kari7
 */
public class ProfInfernal extends PessoaBemComum {
    //Attrib
    private String especialidade;
    private double sal;
    
    //Getters e Setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    
    //Metodos
    public void receberAus(double aus){
        
        //O getNome veio pois é da classe-mãe PessoaComum
        System.out.println(this.getNome() + " tinha como salario: R$" + this.getSal());
        System.out.println(this.getNome() + " tem com especialidade:" + this.getEspecialidade());
        this.sal = this.sal + aus;
        System.out.println(this.getNome() + " recebeu um aumento de: R$" + aus);
        System.out.println("Agora " + this.getNome() + " tem de salario: R$" + this.getSal());
    }
}
