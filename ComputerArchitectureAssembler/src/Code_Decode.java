package _23010310067_Yunus_Taskesen;

public class Code_Decode {
	private String[] code;
	private Basic_Computer command;
	private Look_Error look;

	public Code_Decode(String[] code) {
		this.code = code;
		this.look = new Look_Error();
		this.command = new Basic_Computer();
	}

	public void Take_Decode() {
		for (int i = 0; i < code.length; i++) {
			String temp = code[i];
			Decode_control(temp.trim().split(" "));
		}
	}

	public void Decode_control(String[] codes) {
		look.command_number(codes.length);

		if (codes.length == 2) {
			look.hex_control(codes[0]);
			if (codes[1].length() == 4)
				look.hex_control(codes[1]);
		} else if (codes.length == 3) {
			look.hex_control(codes[0]);
			look.hex_control(codes[2]);
		} else if (codes.length == 4) {
			look.hex_control(codes[0]);
			look.hex_control(codes[2]);
		}

		if (codes.length == 2 && codes[1].length() == 4) {
			Code_Print(codes);
		} else {
			String[] last = new String[2];
			String temp;
			if (codes.length == 2) {
				temp = command.basic_command(codes[1], null, null);
			} else if (codes.length == 3) {
				temp = command.basic_command(codes[1], codes[2], null);
			} else {
				temp = command.basic_command(codes[1], codes[2], codes[3]);
			}
			last[0] = codes[0];
			last[1] = temp;
			Code_Print(last);
		}

	}

	public void Code_Print(String[] finally_code) {

		wait_command();
		System.out.print("\n"+finally_code[0] + "   ");
		hexToBinary(finally_code[1]);
		System.out.println(String.format(" (%s)", finally_code[1]));

	}

	public void hexToBinary(String hex) {
		int decimal = Integer.parseInt(hex, 16);
		String binary = Integer.toBinaryString(decimal);

		while (binary.length() < 16) {
			binary = "0" + binary;
		}
		System.out.print(binary.replaceAll("(.{4})", "$1 "));
	}

	public void wait_command() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.print("Error: " + e.getMessage());
		}
	}
}
