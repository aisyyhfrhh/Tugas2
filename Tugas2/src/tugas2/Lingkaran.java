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
public class Lingkaran implements HitungBidang{
    double jarijari;
    
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    
    public double getR(){
        return this.jarijari;
    }
    
    public void setR(double jarijari){
        this.jarijari = jarijari;
    }
    @Override
    public double luas(){
        return (PHI * this.jarijari * this.jarijari);
    }
    
    @Override
    public double keliling(){
        return (PHI * (2 * this.jarijari));
    }
}
