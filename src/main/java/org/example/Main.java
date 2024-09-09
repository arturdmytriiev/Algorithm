package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dynamic dynamic = new Dynamic();
        Iteration iteration = new Iteration();
        Rekurzive rekurzive = new Rekurzive();
        System.out.println("dynamic.fibonacci(5) = " + dynamic.fibonacci(10));
        System.out.println("iteration.fibonacci(5) = " + iteration.fibonacci(8));
        System.out.println("rekurzive.fibonacci(5) = " + rekurzive.fibonacci(15));
    }
}