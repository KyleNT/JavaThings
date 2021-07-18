/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degree.equation2deg;

/**
 *
 * @author Kari7
 */
import java.util.Scanner;

public class E2D {
 
    /**
     * @param args the command line arguments
     */

   
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("APENAS RETORNA VALORES REAIS!");
        System.out.println("Digite 1 para Calular Equação do Segundo Grau, ou 2 para o Terceiro Grau");
        Scanner imperiatsia = new Scanner(System.in);
        int x = imperiatsia.nextInt();
        
        switch(x) {
            
        //Equação do Segundo Grau    
            case 1:
        System.out.println("Digite o termo A: ");
        double aspitsia = imperiatsia.nextFloat();
        
        System.out.println("Digite o termo B: ");
        double bloatovsk = imperiatsia.nextFloat();
        
        System.out.println("Digite o termo C: ");
        double kamchatka = imperiatsia.nextFloat();
        
        double strikeback = Math.pow(bloatovsk, 2) - (4 * aspitsia * kamchatka);
        
        //Produção da fórmula
        if (aspitsia < 0 && bloatovsk < 0 && kamchatka < 0) {
            // -ax² - bx - c
            System.out.println("Equação: -" + Math.abs(aspitsia) + "x² - " + Math.abs(bloatovsk) + "x - " + Math.abs(kamchatka));       
        } else if (aspitsia < 0 && bloatovsk < 0 && kamchatka >= 0 ){
            // -ax² - bx + c
            System.out.println("Equação: -" + Math.abs(aspitsia) + "x² - " + Math.abs(bloatovsk) + "x + " + Math.abs(kamchatka));
        } else if (aspitsia < 0 && bloatovsk >= 0 && kamchatka < 0 ){
            // -ax² + bx - c
            System.out.println("Equação: -" + Math.abs(aspitsia) + "x² + " + Math.abs(bloatovsk) + "x - " + Math.abs(kamchatka));
        } else if (aspitsia < 0 && bloatovsk >= 0 && kamchatka >= 0 ){
            // -ax² + bx + c
            System.out.println("Equação: -" + Math.abs(aspitsia) + "x² + " + Math.abs(bloatovsk) + "x + " + Math.abs(kamchatka));
        } else if (aspitsia >= 0 && bloatovsk < 0 && kamchatka < 0 ){
            // ax² - bx - c
            System.out.println("Equação: " + Math.abs(aspitsia) + "x² - " + Math.abs(bloatovsk) + "x - " + Math.abs(kamchatka));  
        } else if (aspitsia >= 0 && bloatovsk >= 0 && kamchatka < 0 ){
            // ax² + bx - c
            System.out.println("Equação: " + Math.abs(aspitsia) + "x² + " + Math.abs(bloatovsk) + "x - " + Math.abs(kamchatka));  
        } else if (aspitsia >= 0 && bloatovsk < 0 && kamchatka >= 0 ){
            // ax² - bx + c
            System.out.println("Equação: " + Math.abs(aspitsia) + "x² - " + Math.abs(bloatovsk) + "x - " + Math.abs(kamchatka));  
        } else if (aspitsia >= 0 && bloatovsk >= 0 && kamchatka >= 0 ) {
            // ax² + bx + c
            System.out.println("Equação: " + Math.abs(aspitsia) + "x² + " + Math.abs(bloatovsk) + "x + " + Math.abs(kamchatka));  
        }
        
        //Resultado
        if (strikeback < 0) {
            System.out.println("Número não é Real");
        } else {
            //X'
            double xline1 = ((-1 * bloatovsk) + Math.sqrt(strikeback))/(2*aspitsia) ;
            //X"
            double xline2 = ((-1 * bloatovsk) - Math.sqrt(strikeback))/(2*aspitsia) ;
            

            System.out.printf("X' Equivale a %.3f", xline1);
            System.out.printf("\nX'' Equivale a %.3f\n", xline2);
            System.out.println("Delta equivale a: " + strikeback);
        };
        break;
        
        //Equação do Terceiro Grau
       
            case 2:
        System.out.println("Digite o termo A: ");
        double asp = imperiatsia.nextFloat();
        
        System.out.println("Digite o termo B: ");
        double blo = imperiatsia.nextFloat();
        
        System.out.println("Digite o termo C: ");
        double kam = imperiatsia.nextFloat();

	System.out.println("Digite o termo D: ");
	double ddlc = imperiatsia.nextFloat();
        
                
        //Produção da fórmula
        if (asp < 0 && blo < 0 && kam < 0 && ddlc < 0 ) {

//Negative 1
            // -ax³ - bx² - cx - d
            System.out.println("Equação: -" + Math.abs(asp) + "x³ - " + Math.abs(blo) + "x² - " + Math.abs(kam) + "x - " + Math.abs(ddlc));       
        } else if (asp < 0 && blo < 0 && kam < 0 && ddlc >= 0 ){
            // -ax³ - bx² - cx + d
            System.out.println("Equação: -" + Math.abs(asp) + "x³ - " + Math.abs(blo) + "x² - " + Math.abs(kam) + "x - " + Math.abs(ddlc));   
        } else if (asp < 0 && blo < 0 && kam >= 0 && ddlc < 0 ){
            // -ax³ - bx² + cx - d
            System.out.println("Equação: -" + Math.abs(asp) + "x³ - " + Math.abs(blo) + "x² + " + Math.abs(kam) + "x - " + Math.abs(ddlc));   
        } else if (asp < 0 && blo < 0 && kam >= 0 && ddlc >= 0 ){
            // -ax³ - bx² + cx + d
            System.out.println("Equação: -" + Math.abs(asp) + "x³ - " + Math.abs(blo) + "x² + " + Math.abs(kam) + "x + " + Math.abs(ddlc));   

//Negative 2
	} else if (asp < 0 && blo >= 0 && kam < 0 && ddlc < 0 ){
            // -ax³ + bx² - cx - d
            System.out.println("Equação: -" + Math.abs(asp) + "x³ + " + Math.abs(blo) + "x² - " + Math.abs(kam) + "x - " + Math.abs(ddlc));       
        } else if (asp < 0 && blo >= 0 && kam < 0 && ddlc >= 0 ){
            // -ax³ + bx² - cx + d
            System.out.println("Equação: -" + Math.abs(asp) + "x³ + " + Math.abs(blo) + "x² - " + Math.abs(kam) + "x + " + Math.abs(ddlc));   
        } else if (asp < 0 && blo >= 0 && kam >= 0 && ddlc < 0 ){
            // -ax³ + bx² + cx - d
            System.out.println("Equação: -" + Math.abs(asp) + "x³ + " + Math.abs(blo) + "x² + " + Math.abs(kam) + "x - " + Math.abs(ddlc));   
        } else if (asp < 0 && blo >= 0 && kam >= 0 && ddlc >= 0 ){
            // -ax³ + bx² + cx + d
            System.out.println("Equação: -" + Math.abs(asp) + "x³ + " + Math.abs(blo) + "x² + " + Math.abs(kam) + "x + " + Math.abs(ddlc));  


//Positive 1
	} else if (asp >= 0 && blo < 0 && kam < 0 && ddlc < 0 ){
            // ax³ - bx² - cx - d
            System.out.println("Equação: " + Math.abs(asp) + "x³ - " + Math.abs(blo) + "x² - " + Math.abs(kam) + "x - " + Math.abs(ddlc));       
        } else if (asp >= 0 && blo < 0 && kam < 0 && ddlc >= 0 ){
            // ax³ - bx² - cx + d
            System.out.println("Equação: " + Math.abs(asp) + "x³ - " + Math.abs(blo) + "x² - " + Math.abs(kam) + "x - " + Math.abs(ddlc));   
        } else if (asp >= 0 && blo < 0 && kam >= 0 && ddlc < 0 ){
            // ax³ - bx² + cx - d
            System.out.println("Equação: " + Math.abs(asp) + "x³ - " + Math.abs(blo) + "x² + " + Math.abs(kam) + "x - " + Math.abs(ddlc));   
        } else if (asp >= 0 && blo < 0 && kam >= 0 && ddlc >= 0 ){
            // ax³ - bx² + cx + d
            System.out.println("Equação: " + Math.abs(asp) + "x³ - " + Math.abs(blo) + "x² + " + Math.abs(kam) + "x + " + Math.abs(ddlc));   

//Positive 2
	} else if (asp >= 0 && blo >= 0 && kam < 0 && ddlc < 0 ){
            // ax³ + bx² - cx - d
            System.out.println("Equação: " + Math.abs(asp) + "x³ + " + Math.abs(blo) + "x² - " + Math.abs(kam) + "x - " + Math.abs(ddlc));       
        } else if (asp >= 0 && blo >= 0 && kam < 0 && ddlc >= 0 ){
            // ax³ + bx² - cx + d
            System.out.println("Equação: " + Math.abs(asp) + "x³ + " + Math.abs(blo) + "x² - " + Math.abs(kam) + "x - " + Math.abs(ddlc));   
        } else if (asp >= 0 && blo >= 0 && kam >= 0 && ddlc < 0 ){
            // ax³ + bx² + cx - d
            System.out.println("Equação: " + Math.abs(asp) + "x³ + " + Math.abs(blo) + "x² + " + Math.abs(kam) + "x - " + Math.abs(ddlc));   
        } else if (asp >= 0 && blo >= 0 && kam >= 0 && ddlc >= 0 ){
            // ax³ + bx² + cx + d
            System.out.println("Equação: " + Math.abs(asp) + "x³ + " + Math.abs(blo) + "x² + " + Math.abs(kam) + "x + "+  Math.abs(ddlc));  
        }
        
        //Resultado

		//X'
                
                // 5x^3 + 4x^2 + 3x - 1
                double xline_s0_25 = ((Math.pow(blo, 3))*2);        //4^3 * 2 = 128
                double xline_s0_5 = (Math.pow(blo, 2)) - (3*asp*kam); // = (4^2) - (3*5*3) = 16-45 = -29
		double xline_s1 = 4 * (Math.pow(xline_s0_5, 3));    //-29^3 = -24389 * 4 = -97556
		double xline_s2 = xline_s0_25 - (9*asp*blo*kam) + ((Math.pow(asp, 2)) * 27 * ddlc); //128 - 540 - 675 = -1087
		double xline_s2_5 = Math.pow(xline_s2, 2);          //1181569
		double xline_s3 = xline_s0_25 - (9*asp*blo*kam) + ((Math.pow(asp, 2)) * 27 * ddlc); //128 - 540 - 675 = -1087
                double xline_s4 = ((-1)*(blo/(3*asp)));             // -4/15
                double xline_s4_25 = xline_s2_5 - xline_s1;
                double xline_s4_5 = (0.5)*((xline_s3) + Math.sqrt(xline_s4_25));
                double xline_s5 = Math.cbrt(xline_s4_5);            //cbrt(1/2*(-1087 + sqrt(1181569 + 24389))) = 1,77
                double xline_s5_5 = (0.5)*((xline_s3) - Math.sqrt(xline_s4_25));
                double xline_s6 = Math.cbrt(xline_s5_5);            //cbrt(1/2*(-1087 - sqrt(1181569 + 24389))) = -10,299
                

            	double xline1 =  xline_s4 - (((1/(3*asp)) * xline_s5 )) - (((1/(3*asp)) * xline_s6));
                // -4/15 - ((1/15) * 1,77) - ((1/15) * (-10,299))
		//X'''
            //double xline2 = 
		//X'''
           // double xline3 = 

		System.out.printf("X' Equivale a %.5f\n", xline1);
     
		//System.out.printf("\nX'' Equivale a %.3f\n", xline2);
		//System.out.printf("\nX'' Equivale a %.3f\n", xline3);
                break;
        }
    }
}