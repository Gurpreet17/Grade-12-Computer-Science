
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune","Pluto"};
		insertSort (planets);
		System.out.println("ORDERED LIST OF PLANETS:");
		for (int x = 0; x < planets.length; x++)
			System.out.println(planets[x]);
		
		
	}
    public static void insertSort (String [] list) {
    	
    	for (int x = 1; x < list.length; x++) {
			String item = list[x];
			int i = x;
			
			while (i > 0 && item.charAt(0) < list[i-1].charAt(0)) {
				list [i] = list[i-1];
				i--;
			}
			list[i] = item;
			System.out.println("PASS " + x);
			for (int y = 0; y < list.length; y++)
				System.out.print(list[y] + " ");
			System.out.println();
		}
    }

}
