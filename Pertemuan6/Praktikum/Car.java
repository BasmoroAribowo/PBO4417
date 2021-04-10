/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
public class Car extends MotorVehicle {
    
    private Boolean seatbelt = false;
    
    public Car(){
    }

    public void setSeatbelt(Boolean seatbelt) {
        this.seatbelt = seatbelt;
    }
    
    public Boolean getSeatBelt(){
        return seatbelt;
    }
}
