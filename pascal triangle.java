import java.util.*;
public class pascal_triangle_method {

	public static void pascal(int order) {
		for (int i = 0; i < order; i++) {
    		int sayi = 1;
    		System.out.print(String.format("%" + (order - i) * 2 + "s", ""));
           for (int j = 0; j <= i; j++) {
               System.out.print(String.format("%4d", sayi));
               sayi = sayi * (i - j) / (j + 1);
           }
          System.out.println();
		 }
	}	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter an number");
	    int order=sc.nextInt();
	    pascal(order);
	}
}
