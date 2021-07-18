/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kari7.harmonicmean;
import java.util.Scanner;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Locale;


/**
 *
 * @author kari7
 */
public class HarmonicMean {

    /**
     * @param args the command line arguments
     */
    

  
    public static void main(String args[]){
        // TODO code application logic here
/*  JAPANESE HELLO WORLD
      out.println("In Japanese:");
      out.println("\u4eca\u65e5\u306f\u4e16\u754c");
      out.println();
*/

      try {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        Locale locale;
        locale = new Locale("ja", "");
        
        String text1 = "調和平均計算機へようこそ！キャンセルするには「0」を入力して。";
        String text2 = "第";
        String text2_5 = "項を入力してください";
        String text3 = "調和平均";
        String text4 = "結果は次のようになります:";
        
    
        out.println(text1);
        Scanner flandre = new Scanner(System.in);
        /*
        int koakuma[] = new int[5], sakamotum;
        double cirno, reimu;
        
        for(sakamotum=0; sakamotum<5; sakamotum++){
            out.println(text2 + (sakamotum+1) + text2_5);
            koakuma[sakamotum] = flandre.nextInt();
        }
        out.println("\n "+ text3);        
        cirno = 0d;
        for(sakamotum=0; sakamotum<5; sakamotum++){
            cirno += 1d/koakuma[sakamotum];
        }
        reimu = 5d/cirno;*/
        
        int sakamotum = 0;
        double cirno = 0, reimu;
        double koakuma;
        DecimalFormat doremy = new DecimalFormat("#.##");
        
        do{
            out.println(text2 + (sakamotum+1) + text2_5);
            koakuma = flandre.nextDouble();


            if (koakuma != 0){
                cirno += 1d/koakuma;
            } else {
                cirno += 0;
            }

            if (koakuma != 0) sakamotum++;
            else break;
	
        } while(koakuma != 0);
        
        out.println("\n "+ text3);

        reimu = sakamotum/cirno;
        
        out.println(text4 + doremy.format(reimu));
        
        }
        catch (Exception e) {
              e.printStackTrace();
        }
        
    }
}
