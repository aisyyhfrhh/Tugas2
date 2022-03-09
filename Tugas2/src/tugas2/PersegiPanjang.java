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
public class PersegiPanjang implements HitungBidang{
    double panjang, lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getP(){
        return this.panjang;
    }
    
    public void setP(double panjang){
        this.panjang = panjang;
    }
    
    public double getL(){
        return this.lebar;
    }
    
    
    public void setL(double lebar){
        this.lebar = lebar;
    }
    
    @Override
    public double luas(){
        return (this.panjang * this.lebar);
    }
    
    @Override
    public double keliling(){
        return (2 * (this.panjang + this.lebar));
    }

    
}
