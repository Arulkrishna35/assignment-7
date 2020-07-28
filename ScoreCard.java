
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreCard {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter runs Scored by the :\nRahane,\nRahul,\nKolhi,\nDhoni,\nRahul");
		for (int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();

		map.put("Rahane", arr[0]);
		map.put("Rahul", arr[1]);
		map.put("Kohli", arr[2]);
		map.put("Dhoni", arr[3]);
		map.put("Rahul", arr[4]);

		int maxScore = 0, sum = 0;

		for (Map.Entry<String, Integer> me : map.entrySet()) {
			
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
			if (maxScore < me.getValue()) {
				maxScore = me.getValue();
			}
			sum = sum + me.getValue();
		}
		System.out.println("Total Score: "+sum);
		System.out.println("The maximum run is"+ maxScore);
		scan.close();
		
		

	}

}