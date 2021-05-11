/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

import java.util.ArrayList;

/**
 *
 * @author Black_Avous
 */
public abstract class univ {
        ArrayList  mahasiswa = new ArrayList();
        ArrayList  dosen = new ArrayList();
        ArrayList<String>  matkul_utm = new ArrayList<>();
        ArrayList<String>  matkul_tam = new ArrayList<>();
        ArrayList<Integer>  nilaimhs = new ArrayList<>();
    
    public abstract void cetak(int i);
    public abstract void input(String i, int j);
}
