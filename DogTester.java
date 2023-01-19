package Class11;
import java.util.Scanner;
public class DogTester {
    public static void main(String[] args) {
        // creating an actual object from the class Scanner
        //Scanner scanner=new Scanner(System.in);
        //scanner.nextInt();
        // this is how we create the objects of a class
        Dog jacky=new Dog();
       // Cat cat =new Cat(); wrong because is not present in any class
        jacky.bark();
        jacky.sleep();
        jacky.eat();
        }
    }


