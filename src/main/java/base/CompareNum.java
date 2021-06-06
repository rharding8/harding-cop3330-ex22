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
    return input.nextInt();
  }

  public int getTwo() {
    System.out.print("Enter the second number: ");
    return input.nextInt();
  }

  public int getThree() {
    System.out.print("Enter the third number: ");
    return input.nextInt();
  }

  public int getMax(int a, int b, int c) {
    int max;
    max = b > a ? b : a;
    max = c > max ? c : max;
    return max;
  }
}
