package _23010310067_Yunus_Taskesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _23010310067_Yunus_Taskesen {

	public static void main(String[] args) throws IOException {

		Look_Error error = new Look_Error();
		int cap = error.ErrorFile();
		BufferedReader reader = new BufferedReader(new FileReader("Program.txt"));
		FileRead read = new FileRead();
		read.readFile(reader, cap);
		Code_Decode decode = new Code_Decode(read.take);
		decode.Take_Decode();

	}

}
