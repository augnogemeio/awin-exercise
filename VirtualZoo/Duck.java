package VirtualZoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Duck extends Animal{

    public Duck(String name) {
        super("Duck", name, 
               new ArrayList<String>(Arrays.asList("fish")), 
               new ArrayList<String>(Arrays.asList("swim","walk","fly")));                            
    }
    
}
