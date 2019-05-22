/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termproject.sprg2018.lin;
import java.util.ArrayList;

/**
 *
 * @author Lu Lin
 */

public class TrainIterator implements iIterator {
    private final ArrayList<MyTrain> _trainList;
    private int _next;
    public TrainIterator(ArrayList<MyTrain> trainList) {
        this._trainList = trainList;
        this._next = 0;
    }
    
    @Override
    public boolean hasNext() {
        return this._trainList != null && 
                this._next < this._trainList.size();
    }

    @Override
    public MyTrain next() {
        return this._trainList.get(this._next++);
    }
}
