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
public class WaterCart extends TrainDecorator {
    MyTrain myTrain;
    
    public WaterCart(MyTrain myTrain) {
        this.myTrain = myTrain;
    }
    
    public String describe() {
        return myTrain.describe() + ", add a water cart";
    }
    
    public int cost() {
        return 50 + myTrain.cost();
    }
}
