package Day_4;

public class PracticeQuestions_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Length of string
		
		String st = "Hello";
		System.out.println("Length of string: "+st.length());
		
		// Binary Search
		
		int arr[]= {30, 80, 10, 40, 100};
		
		int l = 0;
		int h = arr.length-1;
		int sear = 700; 
		int mid = l+h/2;
		boolean flag = false;
		
		while(mid>-1 && mid<arr.length && arr[mid]!=sear) {
			if (arr[mid] == sear){
				System.out.println("Found element");
				flag = true;
				break;
			}
			else if (arr[mid]<sear) {
				l = mid + 1;
			}
			else {
				h = mid - 1;
			}
			mid = l+h/2;
		}
		if (!flag){
			System.out.println("Not Found");
		}
		
		// Pattern
		
		for(int i = 1; i<6;i++) {
			for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
		// Reverse Pattern
		
		for(int i = 1; i<6;i++) {
			for(int j=0;j<6-i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}

