import java.util.Scanner;
 public class MultipleLineWithoutSpace{
 
 public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   System.out.println("enter the  any words");
   String words=input.nextLine();
   String [] arr=words.split();
   System.out.println(arr);
   };
   }