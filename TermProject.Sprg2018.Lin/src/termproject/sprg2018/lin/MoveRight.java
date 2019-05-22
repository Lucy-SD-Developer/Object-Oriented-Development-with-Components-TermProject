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
public class MoveRight implements MoveTrainInterface{
        
    @Override
    public void move(MyTrain train){
        train.x++;
    }
}
