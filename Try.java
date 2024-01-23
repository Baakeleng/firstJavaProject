//BAAKELENG
import java.util.Scanner;
public class Try{
	
	public static void main (String args[]) {
			//Declaring variables
			String NameOfStud;
			String studNo;
			double markClassTestOne;
			double markClassTestTwo;
			double markSemTestOne;
			double markSemTestTwo;
			
		Scanner input = new Scanner(System.in);	
			
		System.out.print("please enter the student name: ");
		NameOfStud = input.nextLine();
	
		System.out.println("Enter the student number: ");
		studNo = input.nextLine(); 
		
		System.out.println("Enter marks for class test one: ");
		markClassTestOne = input.nextDouble();
		
		System.out.println("Enter marks for class test two: ");
		markClassTestTwo = input.nextDouble();
		
		System.out.println("Enter marks for semester test one: ");
		markSemTestOne = input.nextDouble();
		
		System.out.println("Enter marks for semester test two: ");
		markSemTestTwo = input.nextDouble();
		
		
	
				double predicate;
				double examMark = 0;
				double finalMark;
			    String results = "null";
		
			predicate = (markClassTestOne * 0.2) + (markClassTestTwo * 0.2 )+ (markSemTestOne * 0.25) +
			(markSemTestTwo * 0.35); // used your method
			if (predicate >= 40.0){
			System.out.println("Enter the exam mark: ");
			examMark = input.nextDouble();	
			}
				
  finalMark = predicate + examMark / 2;
  if (finalMark < 40){ 
  System.out.println("RESULT = FAIL"); 
	} else if (finalMark > 40 && finalMark < 49){

	System.out.println("RESULT = QUALIFY RE-EXAM"); 	
	} else if (finalMark > 50 && finalMark < 74){
	System.out.println("RESULT =PASS");

	}else if (finalMark > 75){ 
	System.out.println("RESULT = PASS WITH DISTINCTION");	
	}
	System.out.println("student name" + NameOfStud);
	System.out.println("student number " + studNo);
	System.out.println("class test one " + markClassTestOne);
	System.out.println("class test two "+ markClassTestTwo);
	System.out.println("semester test one" + markSemTestOne);
	System.out.println("semester test two" + markSemTestTwo);
	System.out.println("predicate of the student" + predicate);
	System.out.println("exam mark" + examMark);
	System.out.println("the results" + results);
	}
}




