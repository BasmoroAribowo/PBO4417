/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
public class MobilDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil Mobil2 = new Mobil();
        Mobil2.hidupkanMobil();
        System.out.println(Mobil2.on);
        Mobil2.matikanMobil();
        System.out.println(Mobil2.on);
        Mobil2.ubahGigi(3);
        System.out.println(Mobil2.Gigi);
    }
    
}


class Mobil{

    boolean on = true;
    int Gigi = 0;
    
    void hidupkanMobil(){
        on = true;
    }

    void matikanMobil(){
        on = false;
    }
    void ubahGigi(int i){
        Gigi = i;
    }
    
}
