/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcs.faculdadeExtends;

/**
 *
 * @author Kari7
 * Dica: dê Shift+F6 para rodar este projeto!
 */
public class PadraoQuadro {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        //Instanciamento impossível
        //PessoaBemComum p0 = new PessoaBemComum();
        //É uma classe abstrata.
        
        //Instanciamento possível
        VisitanteOrdinario vs1 = new VisitanteOrdinario();
        
        vs1.setNome("Marisa Kirisame");
        vs1.setIdade(19);
        vs1.setSex("F");
        vs1.setZatodos(28);
        System.out.println(vs1.toString());
        //Visitante não possui estes sets, mas sim herdou da superclasse
        
        AlunoExplosivo al1 = new AlunoExplosivo();
        al1.setNome("Sekibanki");
        al1.setMatricular(41);
        al1.setCurso("Pensamento fora da caixa");
        al1.setIdade(22);
        al1.setSex("F");
        al1.setZatodos(38);
        al1.mensal();
        //Pessoa é uma generaliazação de Aluno
        //Aluno é uma especialização de Pessoa
        
        System.out.println(al1.toString());       
        
        BolsistaNitori bn1 = new BolsistaNitori();
        //Aluno é uma generalização de bolsista
        //Bolsista é uma especialização de Aluno
        bn1.setNome("Cirno");
        bn1.setMatricular(42);
        bn1.setCurso("Informatica");
        bn1.setIdade(19);
        bn1.setSex("F");
        bn1.setZanions(48);
        bn1.setBolsa(13);
        //O bn1.mensal() foi Override, ou seja teve polimorfismo
        bn1.mensal();
        bn1.emitirZanions();
        
        System.out.println(bn1.toString());  
        
        
        TecnecioExp tec1 = new TecnecioExp();
        tec1.setNome("Nitori");
        tec1.setMatricular(42);
        tec1.setCurso("Mecanica");
        tec1.setIdade(19);
        tec1.setSex("F");
        tec1.setRegpro("Conserto de Ferragens");
        tec1.setZatodos(38);
        tec1.praticar();
        //O bn1.mensal() foi Override, ou seja teve polimorfismo
        tec1.mensal();
        System.out.println(tec1.toString());  
        
        
        ProfInfernal pif1 = new ProfInfernal();
        pif1.setNome("Marisa Kirisame");
        pif1.setEspecialidade("Matematica");
        pif1.setSal(5845.21);
        pif1.setIdade(29);
        pif1.setZatodos(38);
        pif1.setSex("F");
        System.out.println(pif1.toString());  
        pif1.receberAus(453.31);
   

    }
}
