package Collection2;
import java.util.*;
import java.util.stream.Stream;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] x=new int[3];
		x[0]=100;
		x[1]=200;
		x[2]=300;
        System.out.println(x[0]);*/
		String[] names= {"rudra","nil","tatai"};
		System.out.println("using for loop");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		for(String x:names)
		{
			System.out.println(x);
		}
		System.out.println("using stream api");
		Stream.of(names).forEach(System.out::println);
	}

}
