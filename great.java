 import java.util.*;
 public class great {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>b){
        System.out.println("a is greater");
      }
      else if(b>c){
        System.out.println("b is greater");
      }
      else if(c>a){
        System.out.println("c is greater");
      }
      else{
            return;
      }
    }

    
}
