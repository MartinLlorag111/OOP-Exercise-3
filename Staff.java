public class Staff
{
	public static void main(String[] args) { 
			Coach coach1, coach2; 
			basketballTeam Before, After; 

			coach1 = new Coach(); 
			coach1.setName("Steve Kerr"); 
			coach1.setTeam("Golden State Warriors"); 
			 
			coach2 = new Coach(); 
			coach2.setName("Mark Jackson"); 
			coach2.setTeam("Golden State Warriors"); 

			Before =new basketballTeam();
			Before.setHandler((coach1));
			Before.activeplayer((434));
			
			After = new basketballTeam();
			After.setHandler((coach2));
			After.activeplayer((121));

			 
			 
			System.out.println(Before.toString()); 
			System.out.println(" Year: 2015-2023:"); 
			System.out.println(" Star Players: Curry, Thompson, Green" + "\n"); 
			 
			System.out.println(After.toString()); 
			System.out.println(" Year: 2012-2014:"); 
			System.out.println(" Stars: Lee, Curry" + "\n"); 
			
		} 
	
}
