package array;

public class array {

	public static void main(String[] args) {
		
		int[] yearStarWars = new int[5];
		yearStarWars[0] = 1977;
		yearStarWars[1] = 1980;
		yearStarWars[2] = 1983;
		yearStarWars[3] = 1999;
		yearStarWars[4] = 2002;
		
		for(int i=0; i < yearStarWars.length; i++) {
			System.out.println(yearStarWars[i]);
		}
		
		int[] yearStarWars2 = {1977,1980,1983,1999,2002};
		
		for(int i=0; i < yearStarWars2.length; i++) {
			System.out.println(yearStarWars2[i]);
		}
		
	}

}
