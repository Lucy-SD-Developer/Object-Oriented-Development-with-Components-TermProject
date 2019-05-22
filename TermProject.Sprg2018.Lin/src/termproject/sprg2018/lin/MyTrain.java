/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termproject.sprg2018.lin;

/**
 *
 * @author Lu Lin
 */
public abstract class MyTrain {
    String description = "";
    MoveTrainInterface moveTrain;
    int x; //default value is int 0
    int y; //default value is int 0
    
    public String describe() {
        return description;
    }
    
    public abstract int cost();
    
    public void display() {
        System.out.println(describe() + ", the cost is $" + cost());
    }
    
    public void moveUp() {
        moveTrain = new MoveUp();
        moveTrain.move(this);
    }
    
    public void moveDown() {
        moveTrain = new MoveDown();
        moveTrain.move(this);
    }
    
    public void moveLeft() {
        moveTrain = new MoveLeft();
        moveTrain.move(this);
    }
    
    public void moveRight() {
        moveTrain = new MoveRight();
        moveTrain.move(this);
    }
    
}
