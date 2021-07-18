/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kataplum.kerosenetotnt;

/**
 *
 * @author mario
 */
public class conversionKerToTNT {
    
    public double kgKerosene;          //KG do Querosene
    private double tonn = 1;            //Quilogramas
    private double kerosene = 43;      //MegaJoules in Kerosene
    private double mjKerosene = 4184;  //MegaJoules p/ Tonelada
    private double kWh = 1162;
    protected double tonKerosene;
    protected double kilowatthour;
    
    public double calculator (double kero){
        
        kgKerosene = kero;
        tonKerosene = (tonn * kgKerosene * kerosene)/mjKerosene;
        return tonKerosene;
    }
    
    public double kilowatt (double kero){
        
        //1 ton TNT = 1162 kWh
        kgKerosene = kero;
        tonKerosene = (tonn * kgKerosene * kerosene)/mjKerosene;   
        kilowatthour = tonKerosene*kWh;
        
        return kilowatthour;
    }
    
}
