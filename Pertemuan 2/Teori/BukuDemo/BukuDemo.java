/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
public class BukuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku2 = new Buku("PBO dengan Java" ,"Indrajani" ,
                "Elexmedia Komputindo", 2007);
        buku2.cetakBuku();
        Buku buku3 = new Buku("Dasar Pemograman Java" ,"Abdul Kadir" ,
                "Andi Offset", 2004);
        buku3.cetakBuku();
        
    }
    
}

class Buku{
    String judul;
    String pengarang;
    String Penerbit;
    private int tahun;
    
    Buku(){}
    
    Buku(String judul, String pengarang, String Penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.Penerbit = Penerbit;
        this.tahun = tahun;
    }
    
    void cetakBuku(){
        System.out.println("============================");
        System.out.println("Judul    :" + this.judul);
        System.out.println("Pengarang:" + this.pengarang);
        System.out.println("Penerbit :" + this.Penerbit);
        System.out.println("Tahun    :" + this.tahun);
    }
}
