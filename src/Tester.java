import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Test1> set = new HashSet<Test1>();
		Test1 t1 = new Test1.Test1Builder("p1", "p2").p3("p3").build();
		


		
		System.out.println(set.size());
		
		List<Test1> list = new ArrayList<Test1>();
		
		
	}

}
