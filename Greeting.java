import java.util.Scanner;
public class Greeting{
   public static void main(String[] args){
       int choice;
       System.out.println("Greet by saying: 1.Hii \n2.Hello\n3.Hey");
       Scanner s= new Scanner(System.in);
       choice=s.nextInt();
       switch(choice){
           case 1 : System.out.println("Hii lovely.");
               break;
          case 2 : System.out.println("Hello there");
               break;
          case 3 : System.out.println("Hey buddy");
               break;
}

}

}