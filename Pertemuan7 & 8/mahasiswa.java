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
public class mahasiswa extends nilai {
    String PBO, DP, RPL, SO, BD, DM; 
    int A, B, C, total;
    double utm = 0.6;
    double tam = 0.4;
    public mahasiswa (){
    };
    
    
    @SuppressWarnings("empty-statement")
    public void InputMtMhs (String i, int j, int d, int x){
        mahasiswa.add(i);
        switch (j) {
            case 1 -> {mahasiswa.add(matkul_utm.get(1));
                     PBO = i;
            }
            case 2 -> {mahasiswa.add(matkul_utm.get(2));
                     DP = i;
            }
            case 3 -> {mahasiswa.add(matkul_utm.get(3));
                     RPL = i;
            }
            default -> {
            }
        };
        switch (d) {
            case 1 -> {mahasiswa.add(matkul_utm.get(1));
                      PBO = i;
            }
            case 2 -> {mahasiswa.add(matkul_utm.get(2));
                      DP = i;
            }
            case 3 -> {mahasiswa.add(matkul_utm.get(3));
                      RPL = i;
            }
            default -> {
            }
        };
        switch (x) {
            case 1 -> {mahasiswa.add(matkul_tam.get(1));
                        SO = i;
                        break;
            }
            case 2 -> {mahasiswa.add(matkul_tam.get(2));
                        BD = i;
                        break;
            }
            case 3 -> {mahasiswa.add(matkul_tam.get(3));
                        DM = i;
                        break;
            }
            default -> {
            }
        };
        
    };
    
    @SuppressWarnings("empty-statement")
    public void CetaMhsFromMatkul(int v){
        switch (v) {
            case 1 -> {System.out.println(matkul_utm.get(1) +" : " + PBO);
            }
            case 2 -> {System.out.println(matkul_utm.get(2) +" : " + DP);
            }
            case 3 -> {System.out.println(matkul_utm.get(3) +" : " + RPL);
            }
            case 11 -> {System.out.println(matkul_tam.get(1) +" : " + SO);
            }
            case 12 -> {System.out.println(matkul_tam.get(2) +" : " + BD);
            }
            case 13 -> {System.out.println(matkul_tam.get(3) +" : " + DM);
            }
            default -> {
            }
        };      
    };
    
    public void cetmhsMat (){
        System.out.println(mahasiswa.get(0));
            System.out.println("Mengikuti Matkul: ");
            System.out.println(mahasiswa.get(1));
            System.out.println(mahasiswa.get(2));
            System.out.println(mahasiswa.get(3));
    };
    
    public void cetmhsNilai (){
        System.out.println(mahasiswa.get(0));
            System.out.println("Mengikuti Matkul: ");
            System.out.println(mahasiswa.get(1) +" Nilai: " + nilaimhs.get(0));
            System.out.println(mahasiswa.get(2)+" Nilai: " + nilaimhs.get(1));
            System.out.println(mahasiswa.get(3)+" Nilai: " + nilaimhs.get(2));
            System.out.println("Nilai Akhir Rata2: ");
            A = nilaimhs.get(0);
            B = nilaimhs.get(1);
            C = nilaimhs.get(2);
            total = (int) (A * utm + B * utm + C * tam);
            System.out.println(total);
    };
    
    public void MatkulUtm (){
        System.out.println("Silakan Pilih Matkul Utama 2");
        System.out.println("Mata Kuliah Utama" + matkul_utm);
    };
    public void MatkulTam (){
        System.out.println("Silakan Pilih Matkul Tambahan 1");
        System.out.println("Mata Kuliah Tambahan" + matkul_tam);
    };
}
