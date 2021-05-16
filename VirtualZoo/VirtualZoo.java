package VirtualZoo;
import java.util.ArrayList;
import java.util.List;

public class VirtualZoo {
    public static void main(String args[]){
        Monkey monkey = new Monkey("Monkito");
        Dolphin dolphin = new Dolphin("Aqua");
        Bat bat = new Bat("Batman");
        Penguin penguin = new Penguin("Madagascar");
        Duck duck = new Duck("Donald");
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(monkey);
        animals.add(dolphin);
        animals.add(bat);
        animals.add(penguin);
        animals.add(duck);
        
        //Zoo tour
        for (Animal animal : animals) animal.sayHi();                  

        //methods, some examples of use 
        monkey.eat("bananas");
        monkey.move("fly");   
        dolphin.move("swim"); 
        duck.move(); 
        bat.eat("fish"); 

        //given a collection of animals, identify those that can fly, without using reflection
        System.out.println("Here follows the animals that can fly: ");
        for (Animal animal : animals) {
            if (animal.getMovements().contains("fly")){
                System.out.println(animal.getName() + " ("+animal.getType()+")");
            }
        }        
    }
}
