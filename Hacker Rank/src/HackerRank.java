import java.util.*;

public class HackerRank {

    public static void main(String[] args) {
	   
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c[]=new int[b];
        for(int d=0;d<b;d++) c[d]=a.nextInt();
        

        // Prints each sequential element in array a
        for (int e = 0; e < c.length; e++) {
            System.out.println(c[e]);
        }
    }
}