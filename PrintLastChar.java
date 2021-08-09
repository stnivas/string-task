import java.util.Scanner;

public   class PrintLastChar{

  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the words");
    String words=input.nextLine();
	 System.out.println("before string:"+words);
		System.out.println(words.substring(words.length()-5));
  //for(int i=words.length()-5; i<words.length(); i++){
  // System.out.print(words.charAt(i));
   //}
   }
   }
					
        