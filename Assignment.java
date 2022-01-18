package Day_1;

public class Assignment {
	
	static void calculator(int a,int b, char c) {
		if (c == '+') {
			System.out.println(a+b);
		}
		else if (c == 'o') {
			System.out.println(a|b);
		}
		else if (c == '*') {
			System.out.println(a+b);
		}
		else {
			System.out.println("Not a valid operator");
		}
	}
	
	static boolean checkprime(int n) {
		 if (n <= 1)
	            return false;
		 for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
		 return true;
	}
	
	static boolean leapyear(int l) {
		if (l % 4 == 0) {
		      if (l % 100 == 0) {
		        if (l % 400 == 0)
		          return true;
		        else
		          return false;
		      }
		      
		      else
		        return true;
		    }
		    
		    else
		      return false;
	}
	
	static void sum10() {
		int s = 0;
		for (int i = 1; i<11; i++) {
			s += i;
		}
		System.out.println(s);
	}
	
	static void check_day(int d) {
		switch (d) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Input");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator(10,20,'o');
		System.out.println(checkprime(12));
		System.out.println(leapyear(2020));
		sum10();
		check_day(1);

		

	}

}
