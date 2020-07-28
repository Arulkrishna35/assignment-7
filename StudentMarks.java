
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> marks = new ArrayList<>();
	int s = 0;
	System.out.println("Enter number of Students");
	int noOfStudent = scan.nextInt();
	System.out.println("Enter marks");
	for (int i = 0; i < noOfStudent; i++) {
		marks.add(scan.nextInt());
	}
	int max = marks.get(0);
	Iterator<Integer> it= marks.iterator();
	while (it.hasNext()) {
		int check = it.next();
		if (max < check)
			max = check;
		s= s+check;
	}
	double avg = s/ noOfStudent;
	System.out.println("The Highest marks is :" + max);
	System.out.println("The average marks is : " + avg);
	System.out.println("Third student marks is " + marks.get(2));
	Collections.sort(marks);
	for (int i = 0; i < marks.size(); i++) {
		System.out.print(i+1 + "-" + marks.get(i)+" ");
	}
	scan.close();

}

}