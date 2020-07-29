import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class States {
	public static void main(String[] args) throws IOException {
		String st = null;
		LinkedHashSet<String> sta = new LinkedHashSet<String>();
		File file = new File("C:\\Users\\elcot\\Desktop\\New_folder\\states.txt");
		BufferedReader bufr = new BufferedReader(new FileReader(file));
		
		while((st = bufr.readLine()) != null)
			sta.add(st);
		System.out.println("The no of states = " + (sta.size()));
		sta.remove("Delhi");
		System.out.println("The states which have name starting with K :");
		Iterator<String> itr = sta.iterator();
		while(itr.hasNext()) {
			st = itr.next();
			if(st.charAt(0)=='K')
				System.out.println(str);
		}
		System.out.println("The states in sorted order :");
		TreeSet<String> ts = new TreeSet<String>(sta);
		System.out.println(ts);
		bufr.close();
		
	}
}