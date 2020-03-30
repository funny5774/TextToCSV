import java.io.*;


public class TextToCSV{

	public static void main(String args[]) throws Exception{

		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("sample.txt")));
		FileWriter out = new FileWriter("csvFile.csv");
		String line;

		while((line=in.readLine())!=null){
			out.append(line);
			out.append("\n");
		}

		out.flush();
		out.close();

	}
}

