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
public class MainFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        
        //Pessoas
        PessoaComum p1 = new PessoaComum();
        Aluno p2 = new Aluno();
        Prof p3 = new Prof();
        Funcionario p4 = new Funcionario();
        //Classes sempre com tipo abstrato
        
        
        //Get e Set de nome
        p1.setNome("Sekibanki"); //O nome da pessoa
        p2.setNome("Wakasagihime"); //O nome da Aluna
        p3.setNome("Reimu Hakurei"); //Nome da Professora
        p4.setNome("Sakuya Izayoi"); //Nome da Funcionária
        
        //G/S de SEX
        p1.setSex("F");
        p2.setSex("F");
        p3.setSex("F");
        p4.setSex("F");
        
        //G/S de Idade
        p1.setIdade(18);
        p2.setIdade(19);
        p3.setIdade(32);
        p4.setIdade(28);
        
        //G/S de Zátodos de Cálcio;
        p1.setZatodoDeCalcio(42);
        p2.setZatodoDeCalcio(36);
        p3.setZatodoDeCalcio(64);
        p4.setZatodoDeCalcio(12);
        
        //Get e Set de curso
        p2.setCurso("Informatica");
        
        //G/S de especialidade
        p3.setEspecialidade("Sistemas de Informacao");
        
        //Get e Set para salário
        p3.setSal(2845.12);
        
        //Get e set para setor
        p4.setSetor("Estoque");
        
        
        
        
        //Métodos toString da Classe mãe;
        
        System.out.println("Info: " + p1.toString());
        System.out.println("Info: " + p2.toString());
        System.out.println("Info: " + p3.toString());
        System.out.println("Info: " + p4.toString());        
        //Métodos dos objetos
        //Aumento de Salário
        //p1.receberAus não é possível, pois a classe mãe não possui o método da filha
        p1.emitirZatodos();
        
        p3.receberAus(343.22);
        p4.mudarTrabalho("Empacotador");
        
        p2.getCurso();
        p2.emitirZatodos();
        p2.emitirZatodos();
        
        p2.trancarCu();
        
        p2.dissiparZatodos();
        
        
        
    }
}
