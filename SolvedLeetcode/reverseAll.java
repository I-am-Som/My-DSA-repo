import java.util.*;
public class reverseAll {
    public static void main(String[] args) {
       
        String[] sentence = { "Learning", "Java", "is", "really", "fun" };
        
        totalReverse(sentence);
    }
    
    public static void totalReverse(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                temp += arr[i].charAt(j);
            }
            arr[i] = temp;
        }
        
        for (int i = 0; i < arr.length /2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println(al.toString());
    }
}