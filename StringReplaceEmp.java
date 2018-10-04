public class StringReplaceEmp 
{
	public static void main(String[] args) 
	{   String str="Hello World";
		System.out.println(str.replace('H','W'));
		System.out.println(str.replaceFirst("He","Ha"));
		System.out.println(str.replaceAll("He","Ha"));
	}
}
