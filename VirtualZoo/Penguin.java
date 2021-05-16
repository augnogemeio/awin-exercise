package VirtualZoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Penguin extends Animal{

    public Penguin(String name) {
        super("Penguin", name, new ArrayList<String>(Arrays.asList("fish")), new ArrayList<String>(Arrays.asList("swim","walk")));                            
    }
    
}
