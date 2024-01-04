package com.bpp;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];

        Learner learner = new Learner(new Identity(firstName, lastName));

        System.out.println(String.format("%s %s <%s> (%s)", learner.firstName(), learner.lastName(),
                learner.email(), learner.username()));
    }
}
