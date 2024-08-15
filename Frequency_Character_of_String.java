
// java program for finding frequency of a character in a string

import java.util.Scanner;
class Frequency_Character_of_String  //classname should be same as filename
{
 public static void main(String arg[])
 {
  int i,len,count=0;
  String str,c;
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter a string : ");
  str = sc.nextLine();
  System.out.print("Enter the character for checking frequency : ");
  c = sc.next();
  len=str.length();
  for(i=len-1;i>-1;i--)
  {
   if(str.charAt(i) == c.charAt(0))
   {
    count++;
   }
  }
  System.out.println("Frequecy of "+c+" in, "+str+" = "+count);
 }
}
