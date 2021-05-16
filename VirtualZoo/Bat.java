package VirtualZoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Bat extends Animal{

    public Bat(String name) {
        super("Bat", name, new ArrayList<String>(Arrays.asList("fruits")), new ArrayList<String>(Arrays.asList("fly")));                            
    }
    
}
