/* The distance a vehicle travels can be calculated as follows:
Distance = Speed * Time
For example, if a train travels 40 miles-per-hour for 3 hours, the distance traveled is 120 miles. Write a program that asks for the spe
ed of a vehicle (in mph) and the number of hours i
t has traveled. Both values are assumed to be integers. It should use a loop to display the distance the vehicle has traveled for each ho
ur of the specified time period.
The following sample run shows an example of the program's output in which the user enters 40 for the vehicle's speed and 3 for the trave
ling time:
Enter vehicle speed (in mph): 40
Enter traveling time (in hours): 3
After 1 hour(s) the distance is 40 miles.
After 2 hour(s) the distance is 80 miles.
After 3 hour(s) the distance is 120 miles.
In the sample run shown above, look carefully at the wording of the messages and the placement of spaces and punctuation.
 Your program's output must match this.
Input Validation
Do not accept a negative number for speed and do not accept any value less than 1 for traveling time.
If the user enters an invalid number for speed, simply repeat the prompt "Enter vehicle speed (in mph): " and read the input again.
If the user enters an invalid number for time, simply repeat the prompt "Enter traveling time (in hours): " and read the input again.
For example, the following sample run shows what should happen when the user enters a negative number for speed:
Enter vehicle speed (in mph):  −
-
 1
Enter vehicle speed (in mph): 40
Enter traveling time (in hours): 3
After 1 hour(s) the distance is 40 miles.
After 2 hour(s) the distance is 80 miles.
After 3 hour(s) the distance is 120 miles.
As another example, the following sample run shows what should happen when the user enters an invalid number for time:
Enter vehicle speed (in mph): 40
Enter traveling time (in hours): 0
Enter traveling time (in hours): 3
After 1 hour(s) the distance is 40 miles.
After 2 hour(s) the distance is 80 miles.
After 3 hour(s) the distance is 120 miles.
Program Class Name: The name of your program's class should be Distance.**/
import java.util.Scanner;
public class Distance {
    public static void main (String[] args){
        System.out.println("Enter vehicle speed (in mph): ");
        Scanner keyboard = new Scanner(System.in);
        int speed = keyboard.nextInt();
        while (speed < 0){
            System.out.println("Enter vehicle speed (in mph): ");
            speed = keyboard.nextInt();
        }
        System.out.println("Enter traveling time (in hours): ");
        int travel_time = keyboard.nextInt();
        while (travel_time < 1) {
            System.out.println("Enter traveling time (in hours): ");
            travel_time = keyboard.nextInt();
        }
        for (int i = 1; i < travel_time; i++) {
            int distance = i * speed;
            System.out.println("After " + i + " hour(s) the distance is " + distance + " miles.");
        }
    }//end main method
}//end class
