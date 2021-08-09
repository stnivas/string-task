import java.util.Scanner;

public  class CheckEnd{

public static void main (String [] args){
  Scanner input =new Scanner(System.in);
  System.out.println("enter name");
  String name=input.next();
  
  
	
        if(name.charAt(name.length()-2)=='l' && name.charAt(name.length()-1)=='e' ){
		
		System.out.println("true");
		}
		else{
		System.out.println("false");
		}
		}
		}
		