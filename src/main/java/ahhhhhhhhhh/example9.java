package ahhhhhhhhhh;

import java.util.Formatter;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the ceiling? ");
        double length = input.nextDouble();
        System.out.print("What is the width of the ceiling? ");
        double width = input.nextDouble();
        double ceiling = length * width;

        Formatter fmt = new Formatter();
        fmt.format("%.0f", ceiling);
        System.out.println(ceiling);
        System.out.println("The ceiling is "+fmt+" square feet.\n1 gallon of paint covers 350 square feet.");
        double paint = ceiling / 350;
        int round = (int)Math.ceil(paint);
        System.out.println("You will need "+round+" gallons of paint to cover "+ceiling+" square feet.");
    }
}
