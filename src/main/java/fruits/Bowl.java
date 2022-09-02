package fruits;

import java.util.ArrayList;
import java.util.List;

public class Bowl {


    private List<Fruit>  fruitList;
    private ShapeOfBowl shape;

    public Bowl(){
        fruitList = new ArrayList<>();

    }

    public void addFruit(Fruit... fruitsToAdd){
        for(Fruit fruit : fruitsToAdd){
            fruitList.add(fruit);
        }
    }

    public Bowl getAllApplesInBowl(){

        Bowl bowlOfApples = new Bowl();

        for(Fruit fruit: fruitList){
            if(fruit instanceof Apple){
                bowlOfApples.addFruit(fruit);
            }
        }
        return bowlOfApples;
    }

    public int getNumberOfFruitsInBowl(){

        return fruitList.size();
    }
}
