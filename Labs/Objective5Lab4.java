import java.util.Scanner;

public class Objective5Lab4 {
    public static void main(String[] args) {
      Scanner zoom = new Scanner(System.in);
      int num;

      System.out.println("Please enter a number: ");
      num = zoom.nextInt();

      if(num % 2 == 0){
        System.out.println("Number is even");
      }
      else {
        System.out.println("Number is odd");
      }
      zoom.close();
    }
  }