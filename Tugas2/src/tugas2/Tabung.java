/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author asus
 */
public class Tabung extends Lingkaran implements HitungRuang {
    double tinggi;
    
    public Tabung(double jarijari, double tinggi){
        super(jarijari);
        this.tinggi = tinggi;
    }
    
    public double getBalok(){
        return this.tinggi;
    }
    
    public void setBalok(double tinggi){
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return (super.luas() * this.tinggi);
    }
    
    @Override
    public double LuasPermukaan(){
        return ( 2 * PHI * super.getR() * (super.getR() + this.tinggi) );
    }
    
}
