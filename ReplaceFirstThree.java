import java.util.Scanner;
import java .lang.*;//tring.replace();
public class ReplaceFirstThree{

public static void main(String[] args){
 Scanner input=new Scanner(System.in);
    System.out.println("enter nmae");
	String name=input.next();
	System.out.println("before string:"+name);
	char[] name1=name.toCharArray();
	name1 [0]='x';
	name1 [1]='y';
	name1 [2]='z';
	System.out.println(name1);
	}
	}
	