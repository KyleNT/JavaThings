package haachama.hidranitric;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HidraNitric {

    public static void main(String args[]) {
        // TODO code application logic here
        DecimalFormat dxn = new DecimalFormat("0.0000E0");
        DecimalFormat dpm = new DecimalFormat("#.##");
        System.out.println("BEM-VINDO AO ANALIZADOR DE HIDRAZINA-ACIDO NITRICO");
        Scanner apeiron = new Scanner(System.in);
        System.out.println("Escolha 1 para Hidrazina ou 2 para Acido Nitrico");
        int apex = apeiron.nextInt();
        double mol = 6.22 * Math.pow(10, 23);
        
        
        switch (apex){
            case 1:
                System.out.println("Escreva a massa em gramas, da Hidrazina");
                double hidrazina = apeiron.nextDouble();
                double hidromol,hidrobuild,hidroxyn;
                
                hidromol = mol * hidrazina/32d; //32u
                hidrobuild = 1440d * (1d)/1000d; //Densiade é 1 g/cm³
                hidroxyn = 1d * hidrazina/1d; //Basicamente é o peso do N2H4
                
                System.out.println(dxn.format(hidromol) + " moleculas");
                System.out.println(dpm.format(hidrobuild) + " kg");
                System.out.println(dpm.format(hidroxyn) + " g");
            break;
            case 2:
                System.out.println("Escreva a massa em gramas, do Acido Nitrico");
                double nitrico = apeiron.nextDouble();
                double nitricomol,nitricobuild,nitricoxyn;
                
                nitricomol = mol * nitrico/63.01d; //32u
                nitricobuild = 1440 * (1.51d)/1000d; //Densiade é 1.51 g/cm³
                nitricoxyn = 1.51d * nitrico/1.51d; //Basicamente é o peso do HNO3
                
                System.out.println(dxn.format(nitricomol) + " moleculas");
                System.out.println(dpm.format(nitricobuild) + " kg");
                System.out.println(dpm.format(nitricoxyn) + " g");
            break;
                
        }
    }
}
