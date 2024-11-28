// TODO: Step 2 - Import file input statements here
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		//TEST FOR STEP 1 (you can delete/comment this out after completing step 1)
		// Plant test = new Plant("Stinging Nettle,65,anti-inflammatory and culinary");
		// System.out.println("test plant:\n" + test + "\n\n");


		//TODO: Step 2 - Declare + initialize variables for file input here

		Scanner input = null;
		ArrayList<Plant> plantList = new ArrayList<Plant>();
		
		//TODO: Step 2 - Connect input stream to file (dont forget the try/catch!)

		try {
			input = new Scanner(new FileInputStream("Forage.csv"));
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error: Failed to open Forage.csv");
		}

		//TODO: Step 2 - create loop to read through whole file

		while (input.hasNextLine()) {

			//TODO: Step 3 - build Plant Objects and store into ArrayList

			Plant plant = new Plant(input.nextLine());
			plantList.add(plant);
			System.out.println("Added plant:\n" + plant.toString() + "\n");
		}
		
		System.out.println(plantList.size() + " plants added!\n");

		//TODO: Step 2 - close the input stream
		
		input.close();

		//TODO: Step 3 - print contents of ArrayList

		System.out.println("List of plants added:\n");
		for (int i = 0; i < plantList.size(); i++) {
			System.out.println("Plant " + (i + 1) + ":\n" + plantList.get(i).toString() + "\n");
		}

	}
}