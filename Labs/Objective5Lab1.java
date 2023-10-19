import java.util.Scanner;

public class Objective5Lab1 {
  public static void main(String[] args) {
  	boolean bool1, bool2;
  	int num1 = 5;
  	int num2 = 15;
	Scanner kb = new Scanner(System.in);

  	if(num1 > num2) {
  	System.out.println(num1 + " is greater than " + num2);
  	bool1 = (num1 > num2);
  	kb.nextInt();
  	}
  	else if(num2 > num1) {
  	System.out.println(num2 + " is greater than " + num1);
  	bool2 = (num2 < num1);
  	
  	Scanner.close()
  	}
  }
}