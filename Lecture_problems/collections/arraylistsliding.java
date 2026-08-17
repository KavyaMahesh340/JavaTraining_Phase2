package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylistsliding {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int input = sc.nextInt(); 
			if (input == -1) { 
				break; 
			} 
			a.add(input); 
		}
		int s_in, c_in = 0, temp;
		for (s_in = 0; s_in < a.size(); s_in++) {
			if (a.get(s_in) % 10 != 0) {
				temp = a.get(s_in);
				for (int itr = s_in; itr > c_in; itr--) {
					a.set(itr, a.get(itr - 1));
				}
				a.set(c_in, temp);
				c_in++;
			}
		}
		System.out.println(a);
	}
}
