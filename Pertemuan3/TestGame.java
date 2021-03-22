/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Black_Avous
 */
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GamePlayer P1 = new GamePlayer();
        GameEnemy E1 = new GameEnemy();
        P1.Run(60);
        P1.Run(30);
        E1.Run();
    }
    
}

class GamePlayer{
    
    double widht;
    double height;
    int positionX;
    int positionY;
    
    GamePlayer(){
    }
    
    GamePlayer(double widht, double height){
    }
    
    GamePlayer(double widht, double height, int positionX, int positionY){
    }

    void setDimension(double widht, double height){
    }
    
    void setPosition(int positionX, int positionY){
    }
    
    double getWidht(double widht){
        return widht;
    }
    
    double getHeight(double height){
        return height;
    }
    
    int getX(int positionX){
        return  positionX;
    }
    
    int getY(int positionY){
        return  positionY;
    }
    
    void Run(){
        System.out.println("Player is Running");
    }
    
    void Run(int incermentX){
        positionX = incermentX + positionX;
        System.out.println("Player still running... current position = "
                            + positionX);
    }
}

class GameEnemy{
    
    double widht;
    double height;
    int positionX;
    int positionY;
    
    GameEnemy(){
    }
    
    GameEnemy(double widht, double height){
    }
    
    GameEnemy(double widht, double height, int positionX, int positionY){
    }

    void setDimension(double widht, double height){
    }
    
    void setPosition(int positionX, int positionY){
    }
    
    double getWidht(double widht){
        return widht;
    }
    
    double getHeight(double height){
        return height;
    }
    
    int getX(int positionX){
        return  positionX;
    }
    
    int getY(int positionY){
        return  positionY;
    }
    
    void Run(){
        System.out.println("Enemy is Running");
    }
}