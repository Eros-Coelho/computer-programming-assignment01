/* Name: Eros Lima Coelho - ID: 3151957
   Date of submission: 24th March 2024 */

package griffith;

import java.util.Scanner;

public class Lab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Task 1: Volume and area of the ball using the diameter given by the user

        System.out.print("Please enter the diameter of the ball in cm: ");
        double diameter = scanner.nextDouble();

        double radius = diameter / 2;

//        The code asks for the diameter, then a variable called radius is created, which is half the diameter

        double volume = (4 * (3.14) * radius * radius * radius) / 3;
        double roundOff = Math.round(volume * 100.0) / 100.0;

//        The volume is then calculated and rounded off using Math.round
//        The same process is done with the area, just using the appropriate formula

        System.out.println("The volume of the ball is " + (roundOff) + " cubic centimetres");

        double area = 4 * (3.14) * radius * radius;
        double roundOff2 = Math.round(area * 100.0) / 100.0;
        System.out.println("The surface area of the ball is " + roundOff2 + "square centimetres");

//        Task 2: Use Caesar Cipher to encode letters

        System.out.print("Enter the amount of positions to shift: ");
        int shift = scanner.nextInt();

        System.out.print("Please enter the character to be encoded: ");
        char ch = scanner.next().charAt(0);

/*
        The program will ask for the user to enter a character, then it will convert that character into a number
        Finally, it will add the positions to be shifted to that number/character, and encode the character as desired
*/

        System.out.println(ch + " encoded is " + (char) ((int) ch + shift));



        /* Task 3: How many tins of paint are necessary to paint a wall using width and height given by the user */

        System.out.print("Please enter the width of the wall in metres: ");
        double width = scanner.nextDouble();

        System.out.print("Please enter the height of the wall in metres: ");
        double height = scanner.nextDouble();

        double areaWall = width * height;
        double roundOff3 = Math.round(areaWall * 100.0) / 100.0;
        System.out.println("The area of the wall is " + roundOff3 + " square centimetres");

        /* 1 tin has enough paint to cover 32.5cm2 of a wall, so divide the area by this number and then round up */
        double tins = areaWall / 32.5;
        double roundUp = Math.ceil(tins);

        System.out.println("You will need " + (roundUp) + " tins of paint");

        /* Task 4: Dividing a restaurant bill plus the service charges */

        System.out.print("Please enter the amount for the bill: $");
        float bill = scanner.nextFloat();

        System.out.print("Please enter how many people are splitting the bill: ");
        float people = scanner.nextFloat();

        System.out.print("Please enter the service charge (e.g., 15 for 15%): ");
        float serviceCharge = scanner.nextFloat();

        /* The code first calculates the percentage that should be added for the service charge */

        float percentage = ((serviceCharge * bill) / 100);

        /* Then it displays the total to be paid, yet to be divided */

        float total = bill + percentage;
        System.out.println("Total bill including service charge: $" + total);

        /* Then finally shows how much each person should pay, dividing the total amount by the number of people */

        float each = total / people;
        System.out.println("Each person should pay: $" + String.format("%.2f", each));

        /* Task 5: Show the difference in years and months between two people with their birth years and months */

        System.out.println("Please enter the year and month of birth for the 1st person: ");
        double year1 = scanner.nextDouble();
        double month1 = scanner.nextDouble();

        System.out.println("Please enter the year and month of birth for the 2nd person: ");
        double year2 = scanner.nextDouble();
        double month2 = scanner.nextDouble();

/*
        If the birth month of the 1st person is greater than the one from the 2nd, the code will subtract month 1 by 12 (which is how many months are missing to complete 1 year) then subtract from month 2
        Then it will subtract the years, but take 1 more from it, since the remaining months will add to the year
*/

        if (month1 > month2) {
            double monthDifference = (Math.abs((month1 - 12.0)) + month2);
            double yearDifference = (Math.abs(year1 - year2)) - 1.0;

            System.out.println("The difference is " + yearDifference + " years and " + monthDifference + " months");
        }
/*
        If month 2 is greater than month 1, then the code will simply subtract month 1 by month 2, then year 1 by year 2
        Always using Math.abs to get rid of the negative results
*/
        else if (month2 > month1) {
            double monthDifference = (Math.abs(month2 - month1));
            double yearDifference = (Math.abs(year1 - year2));

            System.out.println("The difference is " + yearDifference + " years and " + monthDifference + " months");
        }
    }
}