package javapractice;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Unique {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String input=in.nextLine();
		Map<Character,Integer> hashmap=new LinkedHashMap<>();
		for(int i=0;i<input.length();i++){
			if(Character.isAlphabetic(input.charAt(i))||input.charAt(i)==' '){
				if(hashmap.containsKey(input.charAt(i))){
					hashmap.put(input.charAt(i),hashmap.get(input.charAt(i))+1);
				}
				else{
					hashmap.put(input.charAt(i), 1);
				}
			}
			else{
				System.out.println("Invalid Sentence");
				return;
			}
		}
		int flag=0;
		ArrayList<Character> arr=new ArrayList<>();
		for(Map.Entry entry:hashmap.entrySet()){
			if((int)entry.getValue()==1){
				arr.add((char)entry.getKey());
				flag+=1;
			}
		}
		if(flag>0){
			System.out.println("Unique Characters:");
			for(int j=0;j<arr.size();j++){
				System.out.println(arr.get(j));
			}
		}
		else if(flag==0){
			System.out.println("No unique characters");
		}
		in.close();
	}

}
/*
**OUTPUT**
Enter the sentence:
hai iam good
Unique Characters:
h
m
g
d
*/
