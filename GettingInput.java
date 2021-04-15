import java.util.Scanner;
public class GettingInput {

	public static void main(String[] args) {

		Scanner inp=new Scanner(System.in);
		int i=inp.nextInt();
		long l=inp.nextLong();
		float f=inp.nextFloat();
		double d=inp.nextDouble();
		boolean b=inp.nextBoolean();
		String s=inp.nextLine()+inp.nextLine();//note
		char c=inp.next().charAt(0);//note
		 System.out.println("Integer :"+i);
		 System.out.println("Long :"+l);
		 System.out.println("Float :"+f);
		 System.out.println("double :"+d);
		 System.out.println("Boolean :"+b);
		 System.out.println("String:"+s);
		 System.out.println("Character :"+c);

	}

}
/* 
**INPUT**
120
147785233995
21.054
259.00100
true
hai i'am ragul
abc
**OUTPUT**
Integer :120
Long :147785233995
Float :21.054
double :259.001
Boolean :true
String:hai i'am ragul
Character :a
*/
