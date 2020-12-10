import com.opencsv.CSVReader;
import java.util.Arrays;
import java.io.FileReader;


public class Program4 {


	public static void main(String[] args) throws Exception {
		try {
		CSVReader reader = new CSVReader(new FileReader("foreing_names.csv"));
	      String[] nextLine;
	      while ((nextLine = reader.readNext()) != null) {
	         if (nextLine != null) {
	            
	         }
	       }
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
