//repo created by detara you can also return a method
package acess_control;

public class Loki {
//private static 
 static int i=6;
 static
 {
	 System.out.println("hi its me gooddevil");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("");
access kind=new access();
int j=kind.in();
System.out.println(j);
	}

}
class access
{
	Loki one=new Loki();
int doi()
	{
	one.i=9;
	return one.i;
	}
int in()
{
	return doi();
}
	}
