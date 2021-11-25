public class excersizefourtwelve{
	public static void main(String[] args){
		printTriangleType(5, 7, 7); //Prints method with parameter inputs
		printTriangleType(6, 6, 6);
		printTriangleType(5, 7, 8);
		printTriangleType(2, 18, 2);
	}

	
	public static void printTriangleType(int un, int deux, int trois){ //Method with some fun parameters
		if(un == deux && deux == trois){
			System.out.println("equilateral"); //conditions for equilateral
		} 
		else if(un == deux || deux == trois || un == trois){
			System.out.println("isosceles"); //conditions for isosceles
		} 
		else{//if they don't match, it must be scalene
			System.out.println("scalene");
		}
	}
}
