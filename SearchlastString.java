public class SearchlastString
{
	public static void main(String[] args) 
	{String strOring="Hello world,Hello Runoob";
	int lastIndex = strOring.lastIndexOf("Runoob");
	if(lastIndex == - 1){
		System.out.println("û���ҵ��ַ���Runoob");}
		else
			{System.out.println("Runoob�ַ��������ֵ�λ�ã� "+ lastIndex);
	}
}
}