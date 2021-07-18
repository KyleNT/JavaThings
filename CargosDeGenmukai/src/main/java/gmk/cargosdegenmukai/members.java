/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmk.cargosdegenmukai;
import java.util.Random;

/**
 *
 * @author Kari7
 */
public class members {
    
    //Atributos
    private String username;
    private int discriminator;
    Random randomal = new Random();
    int discrit = randomal.nextInt((9999 - 1) + 1) + 1;
    //construtor

    public members(String username, int discriminator) {
  
        this.username = username;
        
        
        if(discriminator == 0){
            //aleatorio.nextInt((max - min) + 1) + min;
            //Isso daqui é pura gambiarra.
            this.discriminator = this.discrit;
        } else {
            this.discriminator = discriminator;
        }
    }
    
    //Getter and Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(int discriminator) {
        this.discriminator = discriminator;
    }

    
}
