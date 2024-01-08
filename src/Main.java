import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int age, type;
        double distance, ageDiscount, typeDiscount;

        System.out.print("Please enter the distance in kilometers: ");
        distance = inp.nextDouble();

        System.out.print("Please enter your age: ");
        age = inp.nextInt();

        System.out.print("Please select your journey type. Press 1 for one-way, and 2 for round-trip: ");
        type = inp.nextInt();

        if ((distance > 0) && (age > 0) && (type == 1 || type == 2)) {
            double amount = distance * 0.10;
             if (age < 12) {
                 ageDiscount = amount * 0.5;
             } else if ((age >= 12) && (age <= 24)) {
                 ageDiscount = amount * 0.10;
                 } else if (age > 65) {
                     ageDiscount = (amount * 0.30);
                 } else ageDiscount = 0;

            amount -= ageDiscount;

            if (type == 2){
                typeDiscount = amount * 0.20; // 20% discount
                amount = (amount - typeDiscount) * 2; // Subtract the discount, *2 the result because it is a round-trip
            }

            System.out.println("Total amount: " + "$" + amount);

        } else {
            System.out.println( "The values you entered are missing or incorrect!");
        }
    }
}