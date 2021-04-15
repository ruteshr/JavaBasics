package javapractice;
import java.util.Scanner;
import java.util.ArrayList;
public class String_No_of_UniqueChar {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String str=input.nextLine();//getting input from user
		int flag=0;
		ArrayList<Character> alist=new ArrayList<Character>();//creating alist to store not found character
		ArrayList<Character> blist=new ArrayList<Character>();//creating blist to store not found character
		
		//checking the sentence contain other than alphabets
		for(int i=0;i<str.length();i++){
			char temp =str.charAt(i);
			if(Character.isDigit(temp)||((Character.isLetter(temp)==false))&&(temp!=' ')){
				System.out.println("Invalid Sentence");
				flag=1;
				return;
			}
		}
		//checking for unique character
		for(int i=0;i<str.length();i++){
			char temp =str.charAt(i);
			
			if(alist.contains(temp)==false){
				alist.add(temp);//storing the char if it is not found in alist
			}
			else if(alist.contains(temp)==true){
				blist.add(temp);//storing the char if it found
			}
		}
		
		//removing alist character which is present in the blist 
		for(int j=0;j<blist.size();j++){
			char rem=blist.get(j);
			alist.removeIf( name -> name.equals(rem));
			alist.removeIf( name -> name.equals(' '));
		}
		if(alist.size()>0){
			for(char k:alist)
			System.out.println(k);
		}
		else{
			System.out.println("No unique character");
			return;
		}

	}

}
/*
**OUTPUT**
-----------------
Enter the sentence:
a a bc cb
No unique character
-----------------
Enter the sentence:
java is an object oriented programming language
v
s
b
c
d
p
l
u
--------------------------
Enter the sentence:
Welcome to 12house
Invalid Sentence
----------------------
*/
