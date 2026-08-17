package collections;
import java.util.ArrayList;
import java.util.List;
public class Arraylist {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("Hello");
		l.add(null);
		l.add(5);
		l.add(3.14);
		l.add("This is arraylist");
//		l.remove("Hello");
	    System.out.println(l);
	    System.out.println(l.getFirst());
	    System.out.println(l.size());
	    System.out.println(l.set(4, l));
	}
}
