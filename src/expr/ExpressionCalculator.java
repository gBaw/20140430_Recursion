package expr;
import java.util.Scanner;

/**
   This program calculates the value of an expression 
   consisting of numbers, arithmetic operators, and parentheses.
*/
public class ExpressionCalculator
{
   public static void main(String[] args) {
       for (;;) {
           try         {
               Scanner in = new Scanner(System.in);
               System.out.print("Enter an expression: ");
               String input = in.nextLine();
               Evaluator e = new Evaluator(input);
               double value = e.getExpressionValue();
               System.out.println(input + "=" + value);
           }
           catch (Exception e) {
           }
       }
   }
}
