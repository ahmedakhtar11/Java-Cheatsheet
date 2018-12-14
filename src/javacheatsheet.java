import java.util.*; // Entire util Library
import java.util.Scanner; //Input
import java.util.Random;  //Random Class
import java.util.HashSet; //Creating Sets

public class Reference {


// Creating Methods (Called Later)
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
// Prints: "Hello World"
System.out.println("Hello World");

		   // Data Types

// Integers in Java
// Minimum value of -2 ^ 31 and a maximum value of 2^31
// Prints: 20
int looks = 10;
System.out.println(looks * 2);

// Characters in Java (One Letter)
// Prints: j
char letter = 'j';
System.out.println(letter);

// Can have a value of -28 to 127
// Prints: 28
byte lifeage = 28;
System.out.println(lifeage);

// Minimum value of -2 ^ 63 and a Maximum value of 2 ^ 63
//Prints: 12345678
long number = 12345678;
System.out.println(number);

// Minimum value of -32,768 and a Maximum value of 32,768
// Prints: 23000
short height = 23000;
System.out.println(height);

// Strings in Java
// Prints: My name is Ahmed Akhtar
String firstName, lastName;
		firstName = "Ahmed";
		lastName = "Akhtar";
System.out.println("My name is " + firstName +" "+lastName);

// Doubles in Java
// Prints: 5
double amount = 10;
System.out.println(amount/2);

// Booleans In Java
// Prints: true
boolean smart = true;
System.out.println(smart);

// Random Number using Math.Random
// Prints Random Number
int random = (int)(Math.random() * 10) + 1;
System.out.println(random);

//Random Number Using Random Class Java
/*50 is the maximum and the 1 is our 
minimum.*/
// Prints Random Number
Random rand = new Random();
int n = rand.nextInt(50) + 1;
System.out.println(n);

// Using Arrays
// Prints: Jerry
String [ ]myfriends = {"Jeff","Jerry","Bill"};
System.out.println(myfriends[1]);

// Multi-Dim Arrays ([array#][position#])
// Prints: 4
int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 
int y = sample[1][0];
System.out.println(y);

// User Input in Java
// Prints User Input
Scanner myVar = new Scanner(System.in);
System.out.println(myVar.nextLine());	

//If-then Statements
// Prints: Welcome!
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
// Prints: Saturday
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
// Prints: 1-5 & "For Loop Completed"
for(int x = 1; x <=5; x++) {
			System.out.println(x);
		}
System.out.println("For Loop Completed");
		
// While Loop
// Prints: 6-9 & "While Loop Completed"
int z = 6;

		while( z < 10 )
		{
			System.out.println(z);
			z++;
		}
System.out.println("While Loop Completed");

// Do While
// Prints Twice: Do While Loop Completed
int f = 3;
do {
System.out.println("Do While Loop Completed!");
			f++;
		} while(f < 5);


// Loop Controls
// Prints: 1-4 & "Loop Control Completed"
int g = 1;
		while(g > 0) {
			System.out.println(g);
			if(g == 4) {
System.out.println(" Loop Control Completed");
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
// ()Created on top, outside class)
// Prints "I am a Method" 
Methodexample();


// Calling a Method with Parameters
// ()Created on top, outside class)
// Prints "Hi Ahmed" 
sayHi("Ahmed");


// Creating Sets
// Prints: [A, B, C]
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);
	  
   }
}
