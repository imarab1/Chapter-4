public class excersizefournineteen{
	public static void main(String[] args){
		System.out.println(quadrant(12.4, 17.8));//prints method with parameter inputs	            
		System.out.println(quadrant(-2.3, 3.5));               
		System.out.println(quadrant(-15.2, -3.1));             	 
		System.out.println(quadrant(4.5, -42.0));	               
		System.out.println(quadrant(0.0, 3.14));
	}
	public static int quadrant(double x, double y) {
		if(x > 0 && y > 0){ //if x is greater than zero and y is greater than zero it is in the first quadrant
			return 1;
		}
		if(x < 0 && y > 0){//if x is less than zero and y is greater than zero it is in the second quadrant
			return 2;
		}
		if(x < 0 && y < 0){//if x is less than zero and y is less than zero it is in the third quadrant
			return 3;
		}
		if(x > 0 && y < 0){//if x is greater than zero and y is less than zero it is in the fourth and final quadrant
			return 4;
		} 
		else{//basically if there is an input of 0 for x or y then it is on an axis line, so zero is returned 
			return 0;
		}
		
	}

}
