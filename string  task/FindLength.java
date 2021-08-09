import java.util.Scanner;
public class FindLength{

public static void main(String[] args){
Scanner input=new Scanner(System.in);
String name;
System.out.println("enter  your name");
name=input.next();
int lengthOfName=name.length();
System.out.println("length of your name:"  +lengthOfName);
}
}
