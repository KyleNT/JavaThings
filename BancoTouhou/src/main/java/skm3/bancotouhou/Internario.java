package skm3.bancotouhou;

/**
 *
 * @author Kari7
 */
public class Internario {


    public static void main(String args[]) {
        
        //Banco Objeto
        BancoSaka koishiK = new BancoSaka(false, 0);
        koishiK.setConta(1405); //Koishi Day
        koishiK.setDono("古明地 こいし");
        koishiK.abrirContal("Checking account"); //Conta corrente
        koishiK.deposital(2134);

        BancoSaka aliceM = new BancoSaka(false, 0);
        aliceM.setConta(1607); //Alice Day
        aliceM.setDono("アリス・マーガトロイド");
        aliceM.abrirContal("Savings"); //Poupança
        aliceM.deposital(10669);
        aliceM.sacal(2134);
        
        BancoSaka kokoroH = new BancoSaka(false, 0);
        kokoroH.setConta(1905); //Alice Day
        kokoroH.setDono("秦こころ");
        kokoroH.abrirContal("Checking account"); //Poupança
        kokoroH.deposital(769);
        kokoroH.sacal(134);
        
        
        koishiK.sakamolog();        
        aliceM.sakamolog();
        kokoroH.sakamolog();

       
        
        //Predefinições do bancoTouhou
    }
}
