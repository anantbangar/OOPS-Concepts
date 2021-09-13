import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test 
{
	public static List<String> show(List<String> list)
	{
		Collections.sort(list);
		Collections.reverse(list);
		
		
		return list;
	}
	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("10.50");
		list.add("bde");
		list.add("12.10");
		list.add("xyz");
		list.add("abc");
		list.add("50");
		
		System.out.println(list);
		System.out.println(test.show(list));
								
		for(String str : list)
		{
			System.out.print(" ");
			char[] ch=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]=='.')
				{
					break;
				}
				else
				{
					System.out.print(ch[i]);
					
				}
					
			}
			
		}
		
			
	}
}