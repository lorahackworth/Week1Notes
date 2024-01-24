public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");

        int lowTemperature = 32;

        // double || skips over second option if first option is already true
        System.out.println(true || (lowTemperature += 5) > 0);
        System.out.println(lowTemperature);

        // only | automatically checks the second option even if the first is true, this takes
        // up more time and space, though
        System.out.println(true | (lowTemperature += 5) > 0);
        System.out.println(lowTemperature);

        int currentTemperature = 3;
        int warmThreshold = 60;
        if (currentTemperature > warmThreshold) {
            System.out.println("It's warm outside.");
        }
        //curly braces are not needed for single line code
        else
            System.out.println("It's cold outside.");

        String windDirection = "west";
        switch (windDirection) {
            //this is just a bunch of else if's, this is a much cleaner and professional way
            // of solving a problem where there is many options.
            case "north":
                System.out.println("The wind is blowing from the north.");
                break;
            case "south":
                System.out.println("The wind is blowing from the south.");
                break;
            case "east":
                System.out.println("The wind is blowing from the east.");
                break;
            case "west":
                System.out.println("The wind is blowing from the west.");
                //break allows for next case or default
                break;
            //if no other conditions are met, default will run
            default:
                System.out.println("I do not know where the wind is blowing.");
        }

        //String [] --> String array, or a list
        String[] words = {"Hello", "How", "Are", "You"};

        System.out.println(words[0]);


        //prints every word in the list, i=0 begins the list
        // Hello = 0, how = 1, are = 2, you = 3, i<4 makes it run through every word up until 1
        // away from 4
        // i++ stands for i PLUS one

        //or--->  for(int i=0; i<words.length; i++){
        /*for(int i=0; i<4; i++){
            System.out.println(words[i]);
        }*/

        //eachWord is a variable created within the for loop, and is designed to be called later
        // hence, it doesn't need to be initialized to run

        //does the same thing as the above code

        for(String eachWord:words){
            System.out.println(eachWord);
        }

        int j = 10;
        while(j>=0){
            System.out.println(j);
            j--;
        }

        // post-check loop, checks at the end instead of at the beginning
        int k = 0;
        do{
            System.out.println(k);
            k+=2;
        }while(k<10);

        //in-class challenge "Take the numbers from the list below and print out whether
        //the integer is negative or positive"-> got it
        int[] integers = {1, 2, 3, 4, -1, -2, 10};

        // goes through entire list of integers
        // fori is shortcut for below
        for(int i=0; i<integers.length; i++){
            //checks if integer is less than 0, hence, negative
            if (integers[i] <= 0)
                System.out.println(integers[i] + " is negative.");
            //checks if integer is more than 0, hence, positive
            if (integers[i] >= 0)
                System.out.println(integers[i] + " is positive.");
        }


        //in-class challenge "Take your name and subtract the first and last letter, then make it
        // possible to do with any name" -> got it
        String name = "Gracie";
        System.out.println(name);
        System.out.println(name.substring(1, name.length()-1));


    }
}