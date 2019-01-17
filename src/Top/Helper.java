package Top;

import java.io.*;
import java.util.Scanner;

public class Helper {
	public Helper(){

	}
	public String[] readData(File dataFile){
		String[] dataArry = new String[lineCounter(dataFile)]; //gets the number of lines in the data file provided and initializes the array with that value

		try {
			BufferedReader dataReader = new BufferedReader(new FileReader(dataFile));
			int i= 0;
			while (dataReader.readLine() != null){
				dataArry[i] = dataReader.readLine();
				i++;
			}
			return dataArry;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	private int lineCounter(File f){
		int lines = 0;
		try (Scanner infile = new Scanner(f)) {
			while (infile.hasNextLine()){
				lines++;
				infile.nextLine();
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return lines;
	}
}
