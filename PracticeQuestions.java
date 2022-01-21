package Day_4;

public class PracticeQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {11,10, 20, 30, 30};
		
		// Print all the values of an array
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		// Print elements in reverse order
		
		for(int i = a.length-1; i>-1; i--) {
			System.out.print(a[i]+" ");
		}
		
		// Print duplicate values in an array
		
		System.out.print("\nDulplicate Elements: ");
		
		for(int i = 0; i<a.length-1; i++) {
			for (int j = i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]);
				}
			}
		}
		
		System.out.println();
		
		// Sort the array
		
		System.out.print("Sorted Elements: ");
		
		int temp;
		for(int i = 0; i<a.length-1; i++) {
			for (int j = i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		/// Reverse Six digit No.
		
		int n = 230958;
		int res = 0;
		
		while(n!=0) {
			res = res*10 + (n%10);
			n/=10;
		}
		
		System.out.println("Reverse of number: "+res);

	}

}

