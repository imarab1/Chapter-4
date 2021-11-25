public class excersizefoureighteen{
    public static void main(String[] args){
        System.out.println(wordCount("hola")); //The start of my print rant, I print out statements by calling a method
        System.out.println(wordCount("I am very tired"));
        System.out.println(wordCount("I apologize, these are not the original words that we were asked to print"));
        System.out.println(wordCount("I had my very first mid term in Calc II, my brain is now gone, I havent seen it since the exam"));
        System.out.println(wordCount("I am currently listening to some fun music in hopes to motivate myself to finish this assignment"));
        System.out.println(wordCount("Thank you for reading my rant, and for grading my assignment :)/"));
    }
	public static int wordCount(String str){
		boolean num_word = false;
		int count = 0; //Starts number of words at zero, i.e. if we had it set to one, the word count would be off by one
		int i;
		for(i = 0;i < str.length(); i++){ // This gets the program to run however long the statement is
			if (str.charAt(i) == ' '){
				num_word = false;
			}
				
			else if (str.charAt(i) != ' ' && num_word == false){//This  gets the program to repeat and not count the spaces
				count++;
				num_word = true;
			}
		}
		return count;//returns the output
	}    
}
