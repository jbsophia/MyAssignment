package week3.day2;

public class ReverseStringAmazon {

	public static void main(String[] args) {

		String input = "Amazon development center, Chennai";

		String[] inputArray = input.split(" ");

//inputArray.length = 4

		for (int i = inputArray.length - 1; i >= 0; i--) {

			System.out.println(inputArray[i]);
		}
		
		
		String newInput = input.replace("Chennai", "Trichy");
		System.out.println(newInput);
		
		newInput = input.replace("Chennai", "");
		System.out.println(newInput);
		
		newInput = input.replace("n", "B");
		System.out.println(newInput);

	}

}
