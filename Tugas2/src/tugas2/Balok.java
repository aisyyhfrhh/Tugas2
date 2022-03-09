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
public class Balok extends PersegiPanjang implements HitungRuang{
    double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
     super(panjang, lebar);
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
        return (2 * (super.luas() + (super.getP() * this.tinggi) + (super.getL() * this.tinggi)));
    }
    
}
