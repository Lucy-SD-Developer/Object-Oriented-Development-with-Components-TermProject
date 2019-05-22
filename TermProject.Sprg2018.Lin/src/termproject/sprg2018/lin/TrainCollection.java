/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termproject.sprg2018.lin;

import java.util.*;

/**
 *
 * @author Lu Lin
 */
public class TrainCollection implements iContainer{
    
    private final ArrayList<MyTrain> _trainList;
    
    public TrainCollection() {
        this._trainList = new ArrayList<>();
    }
    
    @Override
    public TrainIterator createIterator() {
        TrainIterator iter = new TrainIterator(this._trainList);
        return iter;
    }
    
    public void addTrain(MyTrain train) {
        this._trainList.add(train);
    }
}
