package Collections;
import java.util.*;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,String> map=new HashMap<>();
       map.put(1, "Rudra");
       map.put(2, "nil");
       map.put(3, "tatai");
       System.out.println(map.containsKey(2));
       System.out.println(map);
       Set<Integer>keys=map.keySet();
       for(int i:keys)
       {
    	   System.out.println(map.get(i));
       }
	}

}
