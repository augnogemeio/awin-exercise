package VirtualZoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Monkey extends Animal {

    public Monkey(String name) {        
        super("Monkey", name, new ArrayList<String>(Arrays.asList("bananas")), new ArrayList<String>(Arrays.asList("walk")));                
    }        
    
}
