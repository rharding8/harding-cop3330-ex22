/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package base;

import java.util.Scanner;

public class CompareNum {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    CompareNum numbers = new CompareNum();
    int a = numbers.getOne();
    int b = numbers.getTwo();
    int c = numbers.getThree();

    System.out.printf("The largest number is %d.%n", numbers.getMax(a, b, c));
  }

  public int getOne() {
    System.out.print("Enter the first number: ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Amount! Try Again.");
      return getOne();
    }
    return Integer.parseInt(n);
  }

  public int getTwo() {
    System.out.print("Enter the second number: ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Amount! Try Again.");
      return getTwo();
    }
    return Integer.parseInt(n);
  }

  public int getThree() {
    System.out.print("Enter the third number: ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Amount! Try Again.");
      return getThree();
    }
    return Integer.parseInt(n);
  }

  public int getMax(int a, int b, int c) {
    int max;
    max = b > a ? b : a;
    max = c > max ? c : max;
    return max;
  }
}
