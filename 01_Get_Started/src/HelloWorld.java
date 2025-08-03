public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(Style.GREEN + "\n\n\n ********* Get started *********\n" + Style.RESET);
        System.out.println("Hello World!");
        System.out.println("From Estonia!");
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.\n\n");
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        System.out.println(3 + 3); // This is a comment too

        // This is a comment

        /* A multiline comment: The code below will print the words Hello World
to the screen, and it is amazing */
        System.out.println("After the comments!");

        // Variables
        System.out.println(Style.GREEN + "\n\n\n ********* Variables *********\n" + Style.RESET);

        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        final int myNum3 = 15; // Constant
        // myNum3 = 20;  This would generate an error: cannot assign a value to a final variable

        int myNum4 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        String name2 = "John";
        System.out.println("Hello " + name2);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int a = 5;
        int b = 6;
        System.out.println(a + b); // Print the value of x + y

        // Declare multiple variables
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        // Float and double
        float myNumf = 5.75f;
        System.out.println(myNumf);
        double myNumd = 19.99d;
        System.out.println(myNumd);

        // Scientific numbers
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // Booleans
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        // Chars
        char myGrade = 'B';
        System.out.println(myGrade);

        // Chars with ASCII values
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Strings
        String greeting = "Hello World";
        System.out.println(greeting);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("\nNumber of items: " + items);
        System.out.println("Cost per item: " + currency + costPerItem);
        System.out.println("Total cost = " + currency + totalCost);

        // Type Casting
        /*
         * Widening Casting (automatically) - converting a smaller type to a larger type size
         * byte -> short -> char -> int -> long -> float -> double
         *
         * Narrowing Casting (manually) - converting a larger type to a smaller size type
         * double -> float -> long -> int -> char -> short -> byte
         */

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        // Set the maximum possible score in the game to
        // 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }
}
