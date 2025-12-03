package _23010310067_Yunus_Taskesen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Look_Error {

	public int ErrorFile() throws IOException {
		String line;
		int i = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Program.txt"));
			while ((line = reader.readLine()) != null) {
				if (line.trim().isEmpty())
					continue;
				i++;
			}
			reader.close();
			return i;
		} catch (FileNotFoundException e) {
			System.out.println("Dosya hatası: " + e.getMessage());
			System.out.print("Program kapatılıyor.");
			System.exit(0);
			return i;
		}
	}

	public void command_number(int capacity) {
		if (capacity > 4) {
			System.out.println("Fazla alan var: " + capacity);
			System.out.println("Program kapatılıyor.");
			System.exit(0);
		}
	}

	public void hex_control(String s) {
		if (s == null || s.length() == 0) {
			System.out.println("Boş değer.");
			System.out.print("Programdan çıkılıyor.");
			System.exit(0);
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			boolean digit = (c >= '0' && c <= '9');
			boolean letter = (c >= 'A' && c <= 'F');

			if (!(digit || letter)) {
				System.out.println("Yanlış hex kodu: " + s);
				System.out.print("Programdan çıkılıyor.");
				System.exit(0);
			}
		}

	}

	public void look_null(String a) {
		if (a == null) {
			System.out.println("Adres yazmalı buyruğun adresi yok.");
			System.out.print("Program kapatılıyor.");
			System.exit(0);
		}
	}
}
