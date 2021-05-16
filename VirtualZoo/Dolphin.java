package VirtualZoo;
import java.util.ArrayList;
import java.util.Arrays;


public class Dolphin extends Animal{

    public Dolphin(String name) {      
        super("Dolphin", name, new ArrayList<String>(Arrays.asList("fish")), new ArrayList<String>(Arrays.asList("swim")));                            
    }
    
}
