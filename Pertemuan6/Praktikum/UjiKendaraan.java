/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
public class UjiKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle KendaraanMaju = new Vehicle();
        KendaraanMaju.goStraight();
        
        
        Bicycle B1 = new Bicycle();
        B1.ringBell();
        
        MotorVehicle MV1 = new MotorVehicle();
        MV1.getSizeofEnggine();
        MV1.getLicencePlate();
        
        Car C1 = new Car();
        C1.goStraight();
        
        
    }
    
}
