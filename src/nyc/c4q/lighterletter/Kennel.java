package nyc.c4q.lighterletter;

import java.util.ArrayList;

/**
 * Created by c4q-john on 3/28/15.
 */



public class Kennel {

    ArrayList<Dog> kennel = new ArrayList<Dog>();

    public Kennel(int numOfDogs){
        this.kennel = new ArrayList<Dog>();
    }


    public void addDog(Dog dog){

        this.kennel.add(dog);
    }
    public Dog removeDog(int index ){
        return kennel.remove(index);
    }
    public void printKennel(){
        for (int i =0; i<kennel.size(); i++){
            System.out.println(kennel.get(i).getName());
        }
    }
    public void shutDownKennel(){
        this.kennel.clear();
    }

}




