/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
public class matematikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matematika mat2 = new matematika();
        mat2.pertambahan(20,20);
        mat2.Pengurangan(10,5);
        mat2.Perkalian(10,20);
        mat2.Pembagian(20,2);
    }
    
}

class matematika{
    int a = 0;
    int b = 0;
    int hasil = 0;
    
    void pertambahan(int a, int b){
        hasil = a + b;
        System.out.println("Pertambahan:" + a + "+" + b + "="+ hasil);
    }
    void Pengurangan(int a, int b){
        hasil = a - b;
        System.out.println("Pengurangan:" + a + "-" + b + "="+ hasil);
    }
    void Perkalian(int a, int b){
        hasil = a * b;
        System.out.println("Perkalian:" + a + "x" + b + "="+ hasil);
    }
    void Pembagian(int a, int b){
        hasil = a/b;
        System.out.println("Pembagian:" + a + "/" + b + "="+ hasil);
    }
    

}