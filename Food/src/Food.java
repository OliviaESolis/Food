import java.util.*;
public class Food
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your favorite kind of ethnic food: ");
		String guess = input.next();

		switch (guess)
		{
		case "Mexican":
			System.out.println("You should have Birria Tacos (tacos filled with fall apart juicy meant and the taco is dipped in a thin layer of fat. ");
			break;
		case "Italian":
			System.out.println("You should have Pesce Fritto Al Cono (A variaty of fried fish in a cone). ");
			break;
		case "Chinese":
			System.out.println("You should have Jiazozi (steamed dumplings filled with meat or vegies). ");
			break;
		case "Japanese":
			System.out.println("Your should have Takoyaki (golden balls filled with pieces of octopus). ");
			break;
		case "Vietnamese":
			System.out.println("You should have Ban Trang Tron (a salad with: rice paper, variations of frief protein, beef jerky, squid, shrimp, and mango). ");
			break;
		case "Korean":
			System.out.println("You should have Tteokbokki (Spicy stir-fried rice cakes). ");
			break;
		case "Thai":
			System.out.println("You should have Massaman curry (made with coconut milk, potatoes, and protiens. ");
			break;
		case "Greek":
			System.out.println("You should have Spanakopita (flaky pastry filled with spinach and feta cheese). ");
		case "Bolivian":
			System.out.println("You should have SSaltena (flaky pastry filled with spinach and feta cheese). ");
		default:
			System.out.println("I am not fimiliar with that kind");
		}
	}
}
