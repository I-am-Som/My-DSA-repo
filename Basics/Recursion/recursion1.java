package Basics.Recursion;

public class recursion1 {

    public static void rfunct() {
        System.out.println("Hello");
        rfunct();
    }

    public static void main(String[] args) {
        rfunct();
    }
}