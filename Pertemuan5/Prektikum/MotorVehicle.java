/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
public class MotorVehicle {
    public int sizeofEnggine = 1;
    public String licencePlate = "H 1 IDN";
    
    public MotorVehicle(){
    }
    
    public MotorVehicle(int sizeofEnggine, String licencePlate){
        this.sizeofEnggine = sizeofEnggine;
        this.licencePlate = licencePlate;
    }
    
    public int getSizeofEnggine(){
        return sizeofEnggine;
    }
    
    public String getLicencePlate(){
        return licencePlate;
    
    }
}
