import java.util.Scanner;
import java.util.Random;


public class Program {


// Creating Methods
static void Methodexample() {
		System.out.println("I am a Method!");
	}
	
// Creating Methods with Parameters
static void sayHi(String name) {
		System.out.println("Hi " + name);
	}


	public static void main(String []args) {


			// Main Code:
			 

// Hello World in Java
System.out.println("Hello World");

		   // Data Types

// Integers in Java
int looks = 10;
System.out.println(looks * 2);

// Characters in Java
char letter = 'j';
System.out.println(letter);

// Strings in Java
String firstName, lastName;
		firstName = "David";
		lastName = "Williams";
System.out.println("My name is " + firstName +" "+lastName);

// Doubles in Java
double amount = 10;
System.out.println(amount/2);

// Booleans In Java
boolean smart = true;
System.out.println(smart);

// Random Number using Math.Random
int random = (int)(Math.random() * 10) + 1;
System.out.println(random);

 
//Random Number Using Random Class Java
/*50 is the maximum and the 1 is our 
minimum.*/
Random rand = new Random();
int n = rand.nextInt(50) + 1;
System.out.println(n);

// Using Arrays
String [ ]myfriends = {"Javi","Salko","Chem"};
System.out.println(myfriends[1]);

// Multi-Dim Arrays ([array#][position#])
int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 
int y = sample[1][0];
System.out.println(y);

// User Input in Java
Scanner myVar = new Scanner(System.in);
System.out.println(myVar.nextLine());	

//If-then Statements
int age = 25;
		if(age <= 0) {
			System.out.println("Error");
		} else if(age <= 16) {
			System.out.println("Too Young");
		} else if(age < 100) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Really?");
		}
		

//Switch Statements
int day = 6;

		switch(day) {
		
			case 6:
System.out.println("Saturday");
			break;
				
		   case 7:
System.out.println("Sunday");
			break;
				
			default:
System.out.println("Weekday");
}

// For Loop
for(int x = 1; x <=5; x++) {
			System.out.println(x);
		}
System.out.println("For Loop Completed");
		
// While Loop
int z = 6;

		while( z < 10 )
		{
			System.out.println(z);
			z++;
		}
System.out.println("While Loop Completed");

// Do While
int f = 3;
do {
System.out.println("Loop Control Completed!");
			f++;
		} while(f < 5);


// Loop Controls
int g = 1;
		while(g > 0) {
			System.out.println(g);
			if(g == 4) {
System.out.println("Do While Loop Completed");
				break;
			}
			g++;
		}
		

// Java Inheritance
class Animal {
	protected int legs;
	protected boolean gooddog;
	public void bark() {
		System.out.println("Bark Bark");
	}
}

class Dog extends Animal {
	Dog() {
		legs = 4;
		gooddog = true;

	}
}
		Dog d = new Dog();
		d.bark();
		System.out.println("Inherited Legs: " + d.legs);
		
		
// Exception Handling Try Catch
// System error occurs when dividing by 0 
	  try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
	  } 

	  catch (Exception e) {
			System.out.println("Exception caught in catch block");
	  }

	  finally {
			System.out.println("Code Block Executed");
	  }
	  
	  
// Calling a Method
Methodexample();


// Calling a Method with Parameters
sayHi("Ahmed");
		
// Creating Sets
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);
	  
   }
}

