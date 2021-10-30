///////////////////////////////////////////////////////////////////////////////////////////
//Main.java
//Nicholas LeBlanc
//12/30/20
//Count the number of even numbers entered
///////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int count = 0;

    while(num != 0){
      if(num % 2 == 0)
        count++;
      num = scan.nextInt();
    }
    System.out.println("There were " + count + " even numbers entered");
  }
}