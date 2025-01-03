import java.util.ArrayDeque;

public class UsingDeque {
    
    public static void main(String[] args) {

        ArrayDeque ad = new ArrayDeque();
        
        ad.add(45);
        ad.add("java");
        ad.add(98.75);
        ad.add(true);

        System.out.println(ad);
    }
}