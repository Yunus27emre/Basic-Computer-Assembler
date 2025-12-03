package _23010310067_Yunus_Taskesen;

public class Basic_Computer {

	public String basic_command(String command, String codes, String one_code) {
		Look_Error takes = new Look_Error();
		switch (command) {
		case "AND":
			takes.look_null(codes);
			codes = ("I".equals(one_code) ? "8" : "0") + codes;
			break;
		case "ADD":
			takes.look_null(codes);
			codes = ("I".equals(one_code) ? "9" : "1") + codes;
			break;
		case "LDA":
			takes.look_null(codes);
			codes = ("I".equals(one_code) ? "A" : "2") + codes;
			break;
		case "STA":
			takes.look_null(codes);
			codes = ("I".equals(one_code) ? "B" : "3") + codes;
			break;
		case "BUN":
			takes.look_null(codes);
			codes = ("I".equals(one_code) ? "C" : "4") + codes;
			break;
		case "BSA":
			takes.look_null(codes);
			codes = ("I".equals(one_code) ? "D" : "5") + codes;
			break;
		case "ISZ":
			takes.look_null(codes);
			codes = ("I".equals(one_code) ? "E" : "6") + codes;
			break;
		case "CLA":
			codes = "7800";
			break;
		case "CLE":
			codes = "7400";
			break;
		case "CMA":
			codes = "7200";
			break;
		case "CME":
			codes = "7100";
			break;
		case "CIR":
			codes = "7080";
			break;
		case "CIL":
			codes = "7040";
			break;
		case "INC":
			codes = "7020";
			break;
		case "SPA":
			codes = "7010";
			break;
		case "SNA":
			codes = "7008";
			break;
		case "SZA":
			codes = "7004";
			break;
		case "SZE":
			codes = "7002";
			break;
		case "HLT":
			codes = "7001";
			break;
		case "INP":
			codes = "F800";
			break;
		case "OUT":
			codes = "F400";
			break;
		case "SKI":
			codes = "F200";
			break;
		case "SKO":
			codes = "F100";
			break;
		case "ION":
			codes = "F080";
			break;
		case "IOF":
			codes = "F040";
			break;

		default:
			System.out.println("Geçersiz kod türü: " + command);
			System.out.print("Programdan çıkılıyor.");
			System.exit(0);
			break;
		}
		return codes;
	}
}
