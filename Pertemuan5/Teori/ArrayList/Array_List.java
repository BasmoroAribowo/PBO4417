/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
import java.util.ArrayList;

class L1{
    ArrayList<String>  Array = new ArrayList<String>();
    
    public void TambahArray(String i){
        Array.add(i);
    }
    
    public void HapusArray(String n){
        Array.remove(n);
    }  
}

class L2 extends L1{
    
    public void GantiArray(int x, String y){
    Array.set(x, y);
    }
    
    public void Cetak(){
    System.out.println(Array);
    }
        
}
public class Array_List{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    L2 data = new L2();
    System.out.println("====Isi Array====");
    data.Cetak();
    System.out.println("====Menambah Array====");
    data.TambahArray("Bima");
    data.TambahArray("Nakula");
    data.TambahArray("Sadewa");
    data.TambahArray("Indra");
    data.TambahArray("Janaka");
    data.Cetak();
    data.HapusArray("Sadewa");
    data.HapusArray("Janaka");
    System.out.println("====Setelah Dihapus====");
    data.Cetak();
    data.GantiArray(1, "Gatok Kaca");
    System.out.println("====Setelah DiGanti====");
    data.Cetak();
    }
    
}
