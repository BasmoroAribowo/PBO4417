/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
public class GameEnemy {

    private double widht;
    private double height;
    private int positionX;
    private int positionY;
    
    public GameEnemy(){
    }
    
    public GameEnemy(double widht, double height){
        this.widht = widht;
        this.height = height;
    }
    
    public GameEnemy(double widht, double height, int positionX, int positionY){
        this.widht = widht;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setDimension(double widht, double height){
        this.widht = widht;
        this.height = height;
    }
    
    public void setPosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public double getWidht(){
        return widht;
    }
    
    public double getHeight(){
        return height;
    }
    
    public int getX(){
        return  positionX;
    }
    
    public int getY(){
        return  positionY;
    }
    
    public void Run(){
        System.out.println("Enemy is Running");
    }
}
