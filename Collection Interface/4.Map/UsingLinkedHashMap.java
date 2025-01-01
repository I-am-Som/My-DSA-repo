import java.util.HashMap;
import java.util.LinkedHashMap;

public class UsingLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap<>();
        
        lhm.put(45, "Hello");
        lhm.put(96, "How");
        lhm.put(23, "are");
        lhm.put(93, "you");
        lhm.put(12, "doing?");

        System.out.println(lhm);        
    }
}
