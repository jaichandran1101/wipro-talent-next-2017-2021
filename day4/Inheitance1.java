import java.util.*;
import java.io.*;
public class Inheitance1  
{
    public static void main(String[] args)
    {
        Animal anim=new Animal();
        Bird bir=new Bird();
        System.out.println();
        anim.sleep();
        anim.eat();
        bir.eat();
        bir.sleep();
        bir.fly();
    }
}
class Animal
{
        public void sleep()
        {
            System.out.println("Animal Sleeps in the forest");
        }
        public void eat()
        {
            System.out.println("Animal eats other animals");
        }
 }
 class Bird extends Animal
    {
        public void fly()
        {
            System.out.println("Bird flies happily all around the world");
        }
        public void sleep()
        {
            System.out.println("Bird Sleeps in the Trees");
        }
        public void eat()
        {
            System.out.println("Bird eats fruits");
        }
    }


