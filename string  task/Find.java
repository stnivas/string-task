import java.util.Scanner;
public class Find{

public static void main(String[] args){
  Scanner input=new Scanner(System.in);
  
  System.out.println("enter the name");
  String  name=input.next();
  System.out.println("enter the any char");
  char letter=input.next().charAt(0);
  
  
  for(int i=name.length()-1; i>=0; i--){
    if(name.charAt(i)==letter){
	
	System.out.println(i);
	break;
	}else if(i==0){
		
	System.out.println("no search letter");
    }
	}
}
}