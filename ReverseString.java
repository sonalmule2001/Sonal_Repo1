//Write a program to reverse the string
class ReverseString
{
public static void main(String[] args)
{
String str="Ketan is living in Pune";

String revString="";
int n=str.length();  
  for(int i=n-1;i>=0;i--) 
  {
   revString=revString+str.charAt(i);
   }
System.out.println(revString);
}
}