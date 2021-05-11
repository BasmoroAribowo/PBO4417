/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

/**
 *
 * @author Black_Avous
 */
public class nilai extends matkul_tambahan {

    
    public nilai(){
        nilaimhs.add(0);
    };
    
    public void InputNilaiMhs(int i, int j, int k){
        System.out.println("Hasil : ");
            System.out.println(mahasiswa.get(0));
            System.out.println(mahasiswa.get(1) +" Nilai: " + nilaimhs.add(i));
            System.out.println(mahasiswa.get(2) +" Nilai: " + nilaimhs.add(j));
            System.out.println(mahasiswa.get(3) +" Nilai: " + nilaimhs.add(k));
    };
    
}
