package javamentoring;

public class conditionalstatement {

	public static void main(String[] args) {
		
		
		int x=11;
		int y=3;
		int z=x%y;
	System.out.println("remainder:"+z);
		
	if (x%y==1) {
		System.out.println("evennumber");
	}
	else
		System.out.println("notevennumber");
		
		if(x==3) {
			System.out.println("three");
			}
		else if (x==6) {
			System.out.println("six");
		}
		
		else if (y==2) {
			System.out.println("two");
		}
		
		else if (y==4) {
			System.out.println("correct");
		}
		
		else {
			System.out.println("wrong statement");
		}
		

	}

}
