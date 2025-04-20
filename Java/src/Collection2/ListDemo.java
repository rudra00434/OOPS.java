package Collection2;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //ArrayList arr=new ArrayList();
       Vector arr=new Vector();
       arr.add(10);
       arr.add(15);
       arr.add(30);
       arr.add(40);
      // arr.add("sumon");
       System.out.println(arr);
       arr.add(2,20);
       System.out.println(arr);
       arr.remove(2);
       System.out.println(arr);
       Collections.sort(arr);
       for(Object o:arr)
       {
    	   System.out.println(o);
       }
       System.out.println("traverse the element with iterator");
       Iterator Itr=arr.iterator();
       while(Itr.hasNext())
       {
    	   System.out.println(Itr.next());
       }
	}

}
