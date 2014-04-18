
public class EulerProblem7 {

	
	public static void main(String[] args) 
	{

		int x = 1 ;
		int y = 1 ;
		int count = 0 ;
		
		while(count != 10001)
		{
				while(x != y)
				{
					x++;
					
					if(y % x == 0 && (y == x && x != 1 ) )
						{
							count++;
							System.out.println("Le " + count + " nombre Premier égal à  " + x  );
						}
					else if( y % x == 0 &&  x != y )
						{
							break;
						}
						
				}
			
			x = 1 ;
			y++ ;
		}
	}
}
