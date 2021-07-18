package gmk.cargosdegenmukai;

import java.io.PrintStream;
import java.util.Locale;

/**
 *
 * @author Kari7
 */
public class cargos implements hisokamiGenshin {
    
    //Atributos
    private String nomeDoCargo;
    private members donoDoCargo;
    private boolean estaAtivo;
    
    //Construtor
    public cargos(String nomeDoCargo, members donoDoCargo, boolean estaAtivo) {
        this.nomeDoCargo = nomeDoCargo;
        this.donoDoCargo = donoDoCargo;
        this.estaAtivo = estaAtivo;
    }
    
    //Getter e Setter

    public String getNomeDoCargo() {
        return nomeDoCargo;
    }

    public void setNomeDoCargo(String nomeDoCargo) {
        this.nomeDoCargo = nomeDoCargo;
    }

    public members getDonoDoCargo() {
        return donoDoCargo;
    }

    public void setDonoDoCargo(members donoDoCargo) {
        this.donoDoCargo = donoDoCargo;
    }

    public boolean getEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
    
    //Método Enraizado
    public void respondezil(){
                
        try{
             String condicaoCargo = "";
             
             if (this.getNomeDoCargo() != "Nenhum cargo"){
                if (this.getEstaAtivo() == true){
                    condicaoCargo = "Ele está com cargo";
                } else {
                    condicaoCargo = "Ele está sem cargo";
                }
             } else {
                 condicaoCargo = "Ele está sem cargo";
             }
             
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("pt_BR", "");
                out.println("");
                
                if (this.getNomeDoCargo() != "Nenhum cargo"){
                out.println("--------------- INFORMAÇÕES DO CARGO " + this.getNomeDoCargo().toUpperCase() + " ---------------");
                out.println("Usuário: " + this.getDonoDoCargo().getUsername());
                out.println("Nome do Cargo: " + this.getNomeDoCargo());                
                out.println("Discriminator: " + this.getDonoDoCargo().getDiscriminator());
                } else {
                out.println("--------------- INFORMAÇÕES  ---------------");
                out.println("Antigo dono do Objeto: " + this.getDonoDoCargo().getUsername());
                out.println("Discriminator: " + this.getDonoDoCargo().getDiscriminator());
                }


                out.println("Condição: " + condicaoCargo);

                
                out.print("");
                
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
    
    //Métodos Importados da Interface

    @Override
    public void obter(String obterCargo) {
        
        this.setEstaAtivo(true);
        this.nomeDoCargo = obterCargo;
        
        try{
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("pt_BR", "");
                out.println(this.getDonoDoCargo().getUsername() + " obteve o cargo nomeado de " + obterCargo + ".");
                
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }

    @Override
    public void tirar() {
        
        if(this.getEstaAtivo() == true){
        this.setEstaAtivo(false);
        try{
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("pt_BR", "");
                out.println(this.getDonoDoCargo().getUsername() + " decidiu tirar o cargo nomeado de " + this.getNomeDoCargo() + ".");
                this.setNomeDoCargo("Nenhum cargo");
                
                
                } catch (Exception e) {
                    e.printStackTrace();
                }

        } else {
                try{
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("pt_BR", "");
                out.println("Você não tem cargo " + this.getDonoDoCargo().getUsername() +"!");
                
                
                } catch (Exception e) {
                    e.printStackTrace();
                }            
        } 
    }

    @Override
    public void removerCargo(members removerCargo) {
        
        if(this.getEstaAtivo() == true){
        if(removerCargo.getUsername() != this.getDonoDoCargo().getUsername()){
        this.setEstaAtivo(false);
        try{
             
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("pt_BR", "");
                out.println(removerCargo.getUsername() + " removeu o cargo nomeado de " + this.getNomeDoCargo() + " de " + this.getDonoDoCargo().getUsername() + ".");
                
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
        this.setNomeDoCargo("Nenhum cargo");
        
        } else {
             try{
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("pt_BR", "");
                out.println("Não é possivel fazer este método de remoção, " + this.getDonoDoCargo().getUsername());
                
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }        
        } else {
                try{
                PrintStream out = new PrintStream(System.out, true, "UTF-8");
                Locale locale;
                locale = new Locale("pt_BR", "");
                out.println("Você não possui cargos " + this.getDonoDoCargo().getUsername() +"!");
                
                
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

    }
    
    
    
}
