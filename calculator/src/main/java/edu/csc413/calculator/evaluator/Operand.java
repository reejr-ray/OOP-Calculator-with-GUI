package edu.csc413.calculator.evaluator;
/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
  /**
  * construct operand from string token.
  */
  int value;
  public Operand( String token ) {
    value = Integer.valueOf(token);
  }
  /**
   * construct operand from integer
   */
  public Operand( int value ) {
    this.value = value;
  }
  /**
   * return value of opernad
   */
  public int getValue() {
      return value;
  }
  /**
   * Check to see if given token is a valid
   * operand.
   */
  public static boolean check( String token ) {
    /* Using the Integer.parseInt(str) method, it will throw a NumberFormatException(seen below) if the str does not
     * contain a parsable integer. I catch that and return false if the exception is thrown.
     */
    try{
      Integer.parseInt(token);
      return true;
    }
    catch(NumberFormatException e){
      return false;
    }
  }
}
