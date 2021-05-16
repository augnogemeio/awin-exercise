package VirtualZoo;

import java.util.List;
import java.util.ArrayList;

public class Animal implements AnimalInterface{

    private String type;
    private String name;
    private List<String> foods = new ArrayList<>();
    private List<String> movements = new ArrayList<>();

    public Animal(String type, String name, List<String> food, List<String> movements) {
        this.type = type;
        this.name = name;
        this.foods = food;
        this.movements = movements;
    }
    
    public void sayHi(){
        System.out.println("Hi, my name is "+this.name+". I'm a "+this.type+".");
        System.out.println("My food is: " + this.foods.toString() +".");
        System.out.println("I can move by: " + this.movements.toString() +".");
        System.out.println();
    }

    @Override
    public void eat(String food){
        if (isFoodAccepted(food)){
            System.out.println(this.name + ": Thanks, I like this food. I'll eat " + food);
        } else {
            System.out.println(this.name + ": I'm sorry, but I don't eat " + food);
        }
    }

    private boolean isFoodAccepted(String food){
        for (String possibleFood : this.foods) {
            if (possibleFood.equals(food)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void move(){
        System.out.println(this.name + ": I can move by: " + this.movements.toString());        
        int rand = (int) (Math.random()*this.movements.size())+1;       
        System.out.println(this.name + ": I will " + this.movements.get(rand-1) +" now.");

    }

    @Override
    public void move(String move){
        if (isValidMove(move)){
            System.out.println(this.name + ": Ok, I know " + move +". I'll do it now.");
        } else {
            System.out.println(this.name + ": I'm sorry, but I don't " + move);
        }
    }

    private boolean isValidMove(String move){
        for (String possibleMove : this.movements) {
            if (possibleMove.equals(move)) {
                return true;
            }
        }
        return false;
    }

    public String getMovements(){
        return this.movements.toString();
    }
    
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    
}
