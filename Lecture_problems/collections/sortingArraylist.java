package collections; 
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner; 
public class sortingArraylist { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> a = new ArrayList<>(); 
        System.out.println("Enter numbers (enter -1 to stop):");
        while (true) {
            int input = sc.nextInt(); 
            if (input == -1) { 
                break; 
            } 
            a.add(input); 
        }
        System.out.println("Original List: " + a); 
        int s = a.size(); 
        for (int process = 0; process <= s - 2; process++) { 
            boolean flag = true;
            for (int cmp = 0; cmp <= s - 2 - process; cmp++) { 
                if (a.get(cmp) > a.get(cmp + 1)) { 
                    Collections.swap(a, cmp, cmp + 1);
                    flag = false;
                } 
            } 
            if (flag) {
                break;
            }
        } 
        System.out.println("Sorted List: " + a);
    } 
}
