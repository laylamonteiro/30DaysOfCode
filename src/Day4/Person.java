package Day4;

import java.util.Scanner;

//Task
//Write a Person class with an instance variable, , and a constructor that takes an integer, ,
//as a parameter. The constructor must assign  to  after confirming the argument passed as  is not negative;
//if a negative argument is passed as , the constructor should set  to  and print Age is not valid, setting age to 0..
//In addition, you must write the following instance methods:
//
//yearPasses() should increase the  instance variable by .
//amIOld() should perform the following conditional actions:
//If , print You are young..
//If  and , print You are a teenager..
//Otherwise, print You are old..
//To help you learn by example and complete this challenge, much of the code is provided for you,
//but you'll be writing everything in the future. The code that creates each instance of your Person class is in the main method.
//Don't worry if you don't understand it all quite yet!
//
//Input Format
//Input is handled for you by the stub code in the editor.
//
//The first line contains an integer,
//(the number of test cases), and the  subsequent lines each contain an integer denoting the  of a Person instance.

public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String text = "";

        if (this.age < 13) {
            text = "You are young.";
        } else if (this.age < 18) {
            text = "You are a teenager.";
        } else {
            text = "You are old.";
        }

        System.out.println(text);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age = ++age;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}