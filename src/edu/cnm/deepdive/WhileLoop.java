package edu.cnm.deepdive;

public class WhileLoop {

  public static void main(String[] args) {
    int spaceOnHdd = 5;

    while (spaceOnHdd > 0) {
      spaceOnHdd--;
      System.out.println("spaceOnHdd = " + spaceOnHdd);
    }
    int x = 2;
    int y = 5;


    //careful: easy to create infinitive loops with 'while'. See below: x is never updated.
    while (x < 10) {
      y++;
    }
    System.out.println("x = " + x + " and y = " + y);// this will never print because the loop will
    //never end.

    int a = 5;
    int b = 7;

    // since a < 6, the while loop will never execute.
    while (a > 6) {
      b += 2;
      a++;
    }

    a = a > 6 ? a++ : b--;
    // false so we use the second condition.
    // we assign b to a so a becomes 7.
    // we decrement b after it has been assigned to a so b becomes 6.
    System.out.println(a + "' " + b);
  }





}
