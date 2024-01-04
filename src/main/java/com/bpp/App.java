package com.bpp;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];

        Learner alice = new Learner(new Identity(firstName, lastName));

        System.out.println(String.format("%s %s <%s> (%s)", alice.firstName(), alice.lastName(),
                alice.email(), alice.username()));
    }
}
