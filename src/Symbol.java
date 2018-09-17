
public class Symbol {
	
	public boolean symbol(String input, String symbol) 
	{
		//ArrayList<String>  newlist = new ArrayList <String>(); 
		String [] list = input.split(""); 
		String[] check = symbol.split("");
		for(int i = 0; i < list.length; i++)
		{
			if(check.length < 2)
			{
				return false; 
			}
			
			if(list[i].toLowerCase().equals(check[0].toLowerCase()))
			{
				{
					for(int j = i + 1; j < list.length; j++)
					{
						if(list[j].equals(check[1]))
						{
							return true; 
						}	
					}
					return false;  
				}
			}
		
		
		if(check[0].toLowerCase().equals(check[1]))
			{
				int count = 0; 
				System.out.println("checked that they are equal");
				System.out.println("count before the if if" + count);
				
				if(list[i].toLowerCase().equals(check[0].toLowerCase()))
				{
					count += 1;
					System.out.println(count);
				}
				
				if (count >= 2)
				{
					return true; 
				}
			}
		}
		return false; 
	}
			
	
}
