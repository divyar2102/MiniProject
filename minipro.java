package project;
import java.util.*;
import java.io.*;
public class minipro{
	
	public static void main(String args[]) {
				
		String username, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");// username:user
		username = sc.nextLine();
		System.out.println("Enter password:");// password:user
		password = sc.nextLine();
		
		if (username.equals("divya") && password.equals("divya")) {
			System.out.println("Authentication Successful");
		} else {
			System.out.println("Authentication Failed");
		}

		String answer1 = "";
		String answer2 = "";
		String answer3 = "";
		String answer4 = "";
		String answer5 = "";
		String answer6 = "";

		int numberCorrect = 0;
		int questions = 6;
		// Question 1
		System.out.println("Which component is used to compile, debug and execute the java programs?");
		System.out.println("a: JRE");
		System.out.println("b: JIT");
		System.out.println("c: JDK");
		System.out.println("d: JVM");
		answer1 = sc.nextLine();
		if (answer1.equals("c")) {
			System.out.println("Good job, that's correct");
			numberCorrect = numberCorrect + 1; // numberCorrect++
		} else {
			System.out.println("That's wrong! Try next Question");
			System.out.println("Explanation: JIT optimizes bytecode to machine specific language code by compiling similar bytecodes at the same time. "
					+ "This reduces overall time taken for compilation of bytecode to machine specific language."
				);
		}
		
		// Question 2
		System.out.println("What is the extension of java code files?");
		System.out.println("a: .js");
		System.out.println("b: .txt");
		System.out.println("c: .class");
		System.out.println("d: .java");
		answer1 = sc.nextLine();
		if (answer1.equals("d")) {
			System.out.println("Good job, that's correct");
			numberCorrect = numberCorrect + 1; // numberCorrect++
		} else {
			System.out.println("That's wrong ");
			System.out.println("Explanation: The java file is saved by .java extension");
		}

		// Question 3
		System.out.println("Which of the following is not an OOPS concept in Java?");
		System.out.println("a: Polymorphism");
		System.out.println("b: Inheritance");
		System.out.println("c: Compilation");
		System.out.println("d: Encapsulation");
		answer1 = sc.nextLine();
		if (answer1.equals("c")) {
			System.out.println("Good job, that's correct");
			numberCorrect = numberCorrect + 1; // numberCorrect++
		} else {
			System.out.println("That's wrong ");
			System.out.println("Because there are 4 OOPS concepts in Java, and they are: "
					+ "Inheritance, Encapsulation, Polymorphism, And Abstraction, Compilation is not a part of the OOPS concept in Java.");
		}

		// Question 4
		System.out.println("Which of the following is not a Java features?");
		System.out.println("a: Dyanamic");
		System.out.println("b: Architectural Neutral");
		System.out.println("c: Use of Pointers");
		System.out.println("d: Object-Oriented");
		answer1 = sc.nextLine();
		if (answer1.equals("c")) {
			System.out.println("Good job, that's correct");
			numberCorrect = numberCorrect + 1; // numberCorrect++
		} else {
			System.out.println("That's wrong ");
			System.out.println("Explanation: Pointers is not a Java feature. Java provides an efficient abstraction layer for developing without using a pointer in Java. "
					+ "Features of Java Programming are Portable, Architectural Neutral, Object-Oriented, Robust, Secure, Dynamic and Extensible");
		}

		// Question 5
		System.out.println("Which one of the following is not an access modifier?");
		System.out.println("a: Protected");
		System.out.println("b: Void");
		System.out.println("c: Public");
		System.out.println("d: Private");
		answer1 = sc.nextLine();
		if (answer1.equals("b")) {
			System.out.println("Good job, that's correct");
			numberCorrect = numberCorrect + 1; // numberCorrect++
		} else {
			System.out.println("That's wrong ");
			System.out.println("Explanation: Public, private, protected and default are the access modifiers.");
		}

		// Question 6
		System.out.println("Evaluate the following Java expression, " + "if x=3, y=5, and z=10:++z + y - y + z + x++");
		System.out.println("a: 24");
		System.out.println("b: 23");
		System.out.println("c: 20");
		System.out.println("d: 25");
		answer1 = sc.nextLine();
		if (answer1.equals("d")) {
			System.out.println("Good job, that's correct");
			numberCorrect = numberCorrect + 1; // numberCorrect++
		} else {
			System.out.println("That's wrong ");
			System.out.println("Explanation: The correct evaluated answer of the given JAVA expression is, i.e., 25");
		}
			
		System.out.println("no of Correct Ans: "+numberCorrect);
		
		double avg = (numberCorrect /6.0);
		System.out.println("Average: "+avg);
		int per = (int) (avg * 100);
		System.out.println(username+"has scored "+per+"%");


		char grade;
		//grading system
		if(per>=80){
	         grade = 'A';
	      }else if(per>=60 && per<80){
	         grade = 'B';
	      }
	      else if(per>=40 && per<60){
	         grade = 'C';
	      }
	      else {
	         grade = 'D';
	      }

	      switch(per) {
	         case 'A' :
	            System.out.println("Excellent!");
	            break;
	         case 'B' :
	        	 System.out.println("Good");
	        	 break;
	         case 'C' :
	        	 System.out.println("Well Done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	            break;
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	        
	      }
	      System.out.println("Your grade is " + grade);
		
	}
}//answer: - cdccbd