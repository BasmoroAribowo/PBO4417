/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
import java.util.Stack;

class S1{
    Stack<String> stack = new Stack<String>();
    
    public void TambahStack(String i){
    stack.push(i);
    }
    
    public void HapusStack(){
    System.out.println("Hapus Element: " + stack.pop());
    }   
}

class S2 extends S1{
    
    public void Atas(){
    System.out.println("Elemen Paling Atas: " + stack.peek());
    }
    
    public void Cetak(){
    System.out.println(stack);
    }
}


public class Stack_List{

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
        S2 stack1 = new S2();
        System.out.println("====Isi Stack====");
        stack1.Cetak();
        System.out.println("====Menambah Array====");
        stack1.TambahStack("Bima");
        stack1.TambahStack("Nakula");
        stack1.TambahStack("Sadewa");
        stack1.TambahStack("Indra");
        stack1.TambahStack("Janaka");
        stack1.Cetak();
        System.out.println("====Menghapus Element Paling Atas====");
        stack1.HapusStack();
        stack1.HapusStack();
        stack1.Cetak();
        System.out.println("====Melihat Element Paling Atas====");
        stack1.Atas();
        stack1.Cetak();
    }
}

        
