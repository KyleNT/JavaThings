package skep.sakamotoenterprise;

/**
 *
 * @author Kari7
 */
public class SakPainel {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        //Classes instanciadas
        
        sak_visitante bmc = new sak_visitante();
        sak_gerente sak = new sak_gerente();
        sak_funcionario mima = new sak_funcionario();
        sak_funcionario hiso = new sak_funcionario();
        
        
        //Getters e Setters
        
            //Blue Mark Cloud
        bmc.setNome("Blue Mark Cloud");
        bmc.setSex("M");
        bmc.setIdade(22);
            //Sakamoto
        sak.setNome("Sakamoto");
        sak.setIdade(20);
        sak.setSex("M");
        sak.setGerenciar(true);
            //Hisokami
        hiso.setNome("Hisokami");
        hiso.setIdade(19);
        hiso.setSex("M");
        hiso.setTrabalhar(true);
            //Mima
        mima.setNome("Mima");
        mima.setIdade(20);
        mima.setSex("F");
        mima.setTrabalhar(true);           
        
        
        //Ações
        bmc.acao();
        sak.gerenciador();
        sak.acao();
        hiso.trabalhar();
        hiso.acao();
        mima.trabalhar();
        mima.acao();
        
        

    }
}
