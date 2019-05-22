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
public class BrakeTender extends TrainDecorator {
    MyTrain myTrain;
    
    public BrakeTender(MyTrain myTrain) {
        this.myTrain = myTrain;
    }
    
    public String describe() {
        return myTrain.describe() + ", add a brake tender";
    }
    
    public int cost() {
        return 70 + myTrain.cost();
    }
}
