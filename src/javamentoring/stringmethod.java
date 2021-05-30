package javamentoring;

public class stringmethod {

	public static void main(String[] args) {
		
		String location= "Flushing";
		String city="Newyork is a big state";
		
		System.out.println(location.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println("the length is :"+city.length());
		System.out.println("fifth letter of city is: " + city.charAt(5));
		 System.out.println(city.substring(11, 21));
		 
		 if(location.startsWith("flushing"))
		 {
			 System.out.println("My destination");
		 }
		 else {
			 System.out.println("wrong destination");
		 }
		 if(city.endsWith("state")) {
			 System.out.println("correct");
		 }
		 else {
			 System.out.println("not correct");
			
		 }
		 System.out.println(location.concat(city));
		 System.out.println(location+city);
		 System.out.println(location +" "+city);


		

	}

}
