package net.Torntep;

import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender: "); String gender = sc.nextLine();
        System.out.print("Enter your weight: "); double weight = sc.nextDouble();
        System.out.print("Enter your height: "); long height = sc.nextLong();

        User.setGender(gender, weight, height);


    }
}