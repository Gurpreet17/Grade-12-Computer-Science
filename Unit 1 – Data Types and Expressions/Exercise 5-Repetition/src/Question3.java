
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int animals = 10;
		int tempAnimals = 0;
		int food = 1000;
		int tempFood = 0;
		int hour =0;
		do {
			tempAnimals = animals*2;
			animals = tempAnimals;
			tempFood = food+4000;
			food = tempFood;
			hour++;
			System.out.println("There are " + animals + " animals and enough food for " + food + " animals in " + hour + " hour");
			
		}
		while (animals<food);


	}

}
