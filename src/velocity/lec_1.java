package velocity;

import java.util.Arrays;

public class lec_1 {

public static void main(String[] args) {
		
		/// array declaration 
		
		int ar []= new int [5];  

		// arrary initilazation 
		ar [0]= 40;                            // note = all the default vales are zero = 0 
		ar [1]= 50;
		ar [2]= 30;
		ar [3]= 80;
		ar [4]= 90;
		
		
		// array usage 
		System.out.println(ar.length);      // no of index mesure =5
		System.out.println(ar[4]); 
		
		Arrays.sort(ar); // import class arrays from java dictornary // 30 ,40,50,80,90
		System.out.println("-------------------");// use for printing only one index value 
		
		
		for (int i = 0; i<ar.length ; i++)   // or for (int i = 0; i < ar.legth  ; i++) 
		{
			System.out.println(ar[i]);
		}
	}
}
