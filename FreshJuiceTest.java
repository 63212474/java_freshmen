class FreshJuice{
 enum FreshJuiceSize{ SMALL, MDIUM, LARGE}
 FreshJuiceSize  size;
 }
public class FreshJuiceTest{
	public static void main(String[] args) 
	{
		FreshJuice juice = new FreshJuice();
		juice.size=FreshJuice.FreshJuiceSize.MEDIUM;
	}
}
