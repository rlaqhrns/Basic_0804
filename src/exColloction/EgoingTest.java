package exColloction;

 
import java.util.ArrayList;
import java.util.HashSet;
 
import java.util.Iterator;
 
public class EgoingTest {
 
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
       for(String i : al) {
    	   System.out.println(i);
       }
         
        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        System.out.println("\nset");
        for(String i : hs) {
        	System.out.println(i);
        }
    }
 
}