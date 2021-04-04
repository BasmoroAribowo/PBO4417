/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
import java.util.Queue;
import java.util.*;

class Q1{
    Queue<String> queue = new LinkedList<>();
    
    public void TambahQueue(String i){
    queue.add(i);
    }
    
    public void HapusQueue(String i){
    queue.remove(i);
    }
}

class Q2 extends Q1{
    
    public void iterasi(){
    Iterator iterator = queue.iterator();
  
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
    }
    }
    
    public void Melihat(){
    System.out.println("Element Paling Atas: " + queue.peek());
    }
    
    public void Cetak(){
    System.out.println(queue);
    }

}

public class Queue_List{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        Q2 queue1 = new Q2();
        System.out.println("====Isi Stack====");
        queue1.Cetak();
        System.out.println("====Menambah Array====");
        queue1.TambahQueue("Bima");
        queue1.TambahQueue("Nakula");
        queue1.TambahQueue("Sadewa");
        queue1.TambahQueue("Indra");
        queue1.TambahQueue("Janaka");
        queue1.Cetak();
        System.out.println("====Menghapus Element====");
        queue1.HapusQueue("Nakula");
        queue1.HapusQueue("Indra");
        queue1.Cetak();
        System.out.println("====Iterasi Antrian====");
        queue1.iterasi();
        System.out.println("");
        queue1.Melihat();
        
    }
    
}
