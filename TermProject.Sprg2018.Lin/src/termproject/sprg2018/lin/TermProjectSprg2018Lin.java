/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termproject.sprg2018.lin;
import java.util.*;

/**
 * @author Lu Lin
 */
public class TermProjectSprg2018Lin {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //prompt user for input first train
        System.out.println("Now let's build your whole train set!");
        System.out.println("Would you like to build your first train? Input 'yes' if you do.");
        Scanner sc = new Scanner(System.in);
        
        //build a collection to store train set
        TrainCollection collection = new TrainCollection();
        int costOfTrainSet = 0;
        while (sc.hasNext()) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                //Decorator pattern 
                System.out.println("The most basic train mode is one locomotive only!");
                MyTrain train = new BasicTrain();
                train.display();
                System.out.println("Enter what components you want to add to the train till input 'quit' to quit:");
                while (sc.hasNext()) {
                    String trainPart = sc.nextLine();
                    if (trainPart.replaceAll("\\s+","").equalsIgnoreCase("FuelTender")) {
                        train = new FuelTender(train);
                        train.display();
                    }
                    if (trainPart.replaceAll("\\s+","").equalsIgnoreCase("BrakeTender")) {
                        train = new BrakeTender(train);
                        train.display();
                    }
                    if (trainPart.replaceAll("\\s+","").equalsIgnoreCase("PoweredTender")) {
                        train = new PoweredTender(train);
                        train.display();
                    }
                    if (trainPart.replaceAll("\\s+","").equalsIgnoreCase("WaterCart")) {
                        train = new WaterCart(train);
                        train.display();
                    }
                    if (trainPart.replaceAll("\\s+","").equalsIgnoreCase("Quit")) {
                        break;
                    }
                }
                costOfTrainSet += train.cost();
                collection.addTrain(train);
                System.out.println("Would you like to build another train? Input 'yes' if you do.");
            } else {
                System.out.println("Congratulations for your train set!");
                System.out.println("The estimate for your established train set is $" + costOfTrainSet);
                break;
            }
        }
        
        //Iterator pattern
        System.out.println("Start testing trains here... ... ...");
        TrainIterator iterator = collection.createIterator();
        int counter = 0;
        while (iterator.hasNext()) {
            counter++;
            MyTrain testee = iterator.next();
            System.out.println("Train No." + counter + " original position is at x = 0 and y = 0.");
            //Strategy pattern
            System.out.println("Enter (left, right, up, down) to move the train till input 'quit' to quit: ");
            while (sc.hasNext()) {
                String direction = sc.nextLine().replaceAll("\\s+","");
                if (direction.equalsIgnoreCase("Quit")) {
                    break;
                }
                if (direction.equalsIgnoreCase("Left")) {
                    testee.moveLeft();
                }
                if (direction.equalsIgnoreCase("Right")) {
                    testee.moveRight();
                }
                if (direction.equalsIgnoreCase("Up")) {
                    testee.moveUp();
                }
                if (direction.equalsIgnoreCase("down")) {
                    testee.moveDown();
                }
                System.out.println("The train's current position is: x axis = " + testee.x + " and y axis = " + testee.y);
            }
        }
    }
}    
