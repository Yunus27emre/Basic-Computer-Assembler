package _23010310067_Yunus_Taskesen;

import java.io.BufferedReader;
import java.io.IOException;

public class FileRead {
	String[] take;

	public void readFile(BufferedReader temp, int cap) throws IOException {
		String line;
		int i = 0;
		take = new String[cap];
		while ((line = temp.readLine()) != null) {
			if (line.trim().isEmpty())
				continue;
			take[i] = line;
			i++;
		}

		System.out.println("Program.txt dosyası okundu.");
	}

}
