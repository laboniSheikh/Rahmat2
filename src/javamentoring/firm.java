package javamentoring;

public class firm {  //variable types
	
	int number= 9; //instance or global variable
	int legs=4;
	
	static String firmanimal="drinkwater"; //class level variable or class variable or static 
	
 String name1="cow";
 String name2= "cat";
	public static void main(String[] args) {
		

		firm animal=new firm(); //object creating
		
		System.out.println(animal.legs);
		
		System.out.println(animal.number);
		
		 int eggs= 12;         //local variable
	String name="chicken"; //local variable
		
	System.out.println("my animal name is:"+ name);
		System.out.println(eggs);
		
	System.out.println(firmanimal);
    System.out.println(firm.firmanimal);
		System.out.println("my first firm animal is "+ animal.name1);
		
		System.out.println("my second firm animal is "+ animal.name2);
		
  firm animal1=new firm();
		 animal1.number=10;
		 animal1.legs= 12;
		 System.out.println(animal1.number);
		 System.out.println(animal1.legs);
  firm animal2=new firm ();
          animal2.number=14;
          animal2.legs= 11;
          System.out.println(animal2.number);
          System.out.println(animal2.legs);
          
          animal1.firm1();
          animal2.firm1();
          
          
	}

	public void firm1() {// we cannot create a method inside another method but we can call them
		
		System.out.println(firmanimal);
	}
	
	
}
