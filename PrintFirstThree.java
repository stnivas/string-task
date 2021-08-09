import java.util.Scanner;
public class PrintFirstThree{

public static void main(String[] args){
 Scanner input=new Scanner(System.in);
    System.out.println("enter nmae");
	String name=input.next();
	System.out.println("before string:"+name);
	for(int i=0; i<3;i++){
	System.out.print("after string:" +name.charAt(i));
	}
	}}