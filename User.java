package net.Torntep;

import java.util.Objects;

public class User {

    public static void setGender(String gender, double weight, long height) {
        if(Objects.equals(gender, "male")) {
            male(weight, height);
        } else if(Objects.equals(gender, "female")) {
            female(weight, height);
        }
    }

    public static void male(double weight, long height) {
        if(weight-100 > height) {
            System.out.println("You should exercise.");
        } else {
            System.out.println("You're an excellent man.");
        }
    }

    public static void female(double weight, long height) {
        if(weight-110 > height) {
            System.out.println("You should exercise.");
        } else {
            System.out.println("You are a wonderful woman.");
        }
    }

}