import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class Main {
	public static void main(String[] args){
		File file = new File("numbers.num");
		BufferedReader reader;
		int[][] numbers = new int[100][50];
		String line;
		int count = 0;
		int lineSum = 0;
		
		//Load the file into an array.
		try{
			reader = Files.newBufferedReader(file.toPath(), Charset.forName("US-ASCII"));
			while((line = reader.readLine()) != null){
				for(int x = 0; x < 50; x++){
					numbers[count][x] = Character.getNumericValue(line.charAt(x));
				}
				count += 1;
			}
		}catch(IOException e){
			System.err.println("The file was not loaded correctly!");
			e.printStackTrace();
			System.exit(1);
		}
		
		//Add each column and carry over.
		for(int x = 49; x > -1; x--){
			for(int y = 0; y < 100; y++){
				lineSum += numbers[y][x];
			}
			System.out.println(lineSum);
			lineSum = 0;
		}
	}
}
