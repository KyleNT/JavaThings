package skm3.bancotouhou;

import java.io.PrintStream;
import java.util.Locale;

/**
 *
 * @author Kari7
 */
public class BancoSaka {
    //Atributos
    
    private String dono;
    private int saldo; // R$ 1 = Y 21
    private boolean status; //(falso; conta fechada, true; conta aberta)
    public int numConta;
    protected String tipo; //(pp; poupanca, cr; corrente)
    
    //Construtor
    public BancoSaka(boolean statalA, int saldalA){
        this.saldo = saldalA;
        this.status = statalA;
    }
    
    //Métodos Especiais
            //Getters & Setters
    public String getDono(){
        return this.dono;
    }
    public void setDono(String donal){
        this.dono = donal;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipal){
        this.tipo = tipal;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public void setSaldo(int saldal){
        this.saldo = saldal;
    }
    public int getConta(){
        return this.numConta;
    }
    public void setConta(int contal){
        this.numConta = contal;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean estrutural){
        this.status = estrutural;
    }
    //End Specific Methods
    
    public void sakamolog(){
            try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("------------- INDEX OF SAKABANK --------------");
                out.println("銀行口座：" + this.getConta()); //Conta
                out.println("銀行口座の種類 " + this.getTipo());
                out.println("ユーザー名：" + this.getDono());
                out.println("銀行預金残高：" + this.getSaldo() + "¥");
                out.println("状態：" + this.getStatus());  
                out.println("");                 
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
    
    //Métodos
    public void abrirContal(String tipalidade){
        
        this.setTipo(tipalidade); //O tipo será setado por tipalidade
        this.setStatus(true);
        if (tipalidade.equals("Checking account") /*Conta coRrente*/){
            this.setSaldo(1600);
            try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("アカウントに" + this.getSaldo() + "円が追加されました。"); //Esta conta tem inenes
                
                } catch (Exception e) {
                    e.printStackTrace();
                }            
        } else if (tipalidade.equals("Savings") /*PouPança*/){
            this.setSaldo(2603);
             try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("アカウントに" + this.getSaldo() + "円が追加されました。"); //Esta conta tem inenes
                
                } catch (Exception e) {
                    e.printStackTrace();
                }           
        }
        
    }
    public void fecharContal(){
        
        if (this.saldo > 0 ){
            try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("この口座は円を保持しています。"); //Esta conta tem inenes
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
       } else if (this.saldo < 0){
           try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("この口座は借金中です。"); //Esta conta está em débito
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
       } else {
           this.setStatus(false);
           try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("アカウントがキャンセルされました。"); //Esta conta está em débito
                
                } catch (Exception e) {
                    e.printStackTrace();
                }           
       }
        
    }
    public void deposital(int valoral){ //Valoral = Dinheiro colocado
        
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valoral); //Saldo = Saldo + Valores.
             try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println(this.getDono() +"口座に" + valoral + "円の入金に成功。"); //Esta conta Depositou N ienes
                
                } catch (Exception e) {
                    e.printStackTrace();
                }              
        } else {
           try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("入金できません。"); //Impossível depositar
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }
    public void sacal(int sacalia){ //Sacalia = Dinheiro Sacado
        //Dinheiro de sacar
        
        if(this.getStatus() == true){
            if(this.saldo >= sacalia){
                this.setSaldo(this.getSaldo() - sacalia);
             try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println(this.getDono() + "口座への" + sacalia + "円の引き出しに成功。"); //Esta conta tem ienes
                out.println("アカウントは" + this.getSaldo() + "円になりました。");
                
                } catch (Exception e) {
                    e.printStackTrace();
                }                  
            } else {
           try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("操作のバランスが不十分です。"); //Impossível depositar
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
           //End Try
            }
            //End 1st If
        } else {
            try {

                //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("ja", "");
                out.println("撤退できません。"); //Impossível depositar
                
                } catch (Exception e) {
                    e.printStackTrace();
                }            
        }
        
    }
    public void mensal(){ //Pagar mensalidade
        int mensalidade = 0;
        if (this.getTipo().equals("Checking account")){
            mensalidade = 128;
        } else if (this.getTipo().equals("Savings")){
            mensalidade = 4267;
        }
        if (this.getStatus() == true){
            if (this.getSaldo() > mensalidade){
                setSaldo(getSaldo() - mensalidade);
                try {

                    //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                    PrintStream out = new PrintStream(System.out, true, "UTF-8");
                    Locale locale;
                    locale = new Locale("ja", "");
                    out.println("月額" + mensalidade + "円が" + this.getDono() + "の支払いに成功。"); //Foi

                    } catch (Exception e) {
                        e.printStackTrace();
                    }                
            } else {
                try {

                    //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                    PrintStream out = new PrintStream(System.out, true, "UTF-8");
                    Locale locale;
                    locale = new Locale("ja", "");
                    out.println("不十分な資金。"); //Impossível depositar

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                //end try
            }
            //end 1st if
        } else {
              try {

                    //Declare isso para imprimir, utilizando o out para imprimir caracteres  
                    PrintStream out = new PrintStream(System.out, true, "UTF-8");
                    Locale locale;
                    locale = new Locale("ja", "");
                    out.println("支払うことができません。"); //Impossível depositar

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                //end try
        }
        //end 2nd if
        
    }
    //end method
    
    
    
}
