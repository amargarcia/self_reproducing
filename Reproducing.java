public class Reproducing {
	public static void main(String[] args) {
		final char s[] = new char[]{'\t', '\n', '"', ';', '\\'};
		final String program_text = "public class Reproducing { public static void main(String[] args) { final char s[] = new char[]{'\\t', '\\n', '\"', ';', '\\'}; final String program_text = public class Reproducing { public static void main(String[] args) { System.out.println(program_text.substring(0,26)); System.out.println(s[0] + program_text.substring(27,67)); System.out.print(s[0]); System.out.println(s[0] + program_text.substring(68,119) + s[4] + program_text.substring(119,123)); System.out.print(s[0]); System.out.println(s[0] + program_text.substring(124,152) + s[2] + program_text.substring(0,98) + s[4] + program_text.substring(98, 104) + s[4] + program_text.substring(104, 109) + s[4] + program_text.substring(109, 120) + s[4] + program_text.substring(120) + s[2] + s[3] + s[1] + s[0] + s[0] + program_text.substring(220,269) + s[1] + s[0] + s[0] + program_text.substring(270,327) + s[1] + s[0] + s[0] + program_text.substring(328,351) + s[1] + s[0] + s[0] + program_text.substring(352,451) + s[1] + s[0] + s[0] + program_text.substring(452,475) + s[1] + s[0] + s[0] + program_text.substring(476,1168) + s[1] + s[0] + program_text.substring(1168,1169) + s[1] + program_text.substring(1169));}}";
		System.out.println(program_text.substring(0,26));
		System.out.println(s[0] + program_text.substring(27,67));
		System.out.print(s[0]);
		System.out.println(s[0] + program_text.substring(68,119) + s[4] + program_text.substring(119,123));
		System.out.print(s[0]);
		System.out.println(s[0] + program_text.substring(124,152) + s[2] + program_text.substring(0,98) + s[4] + program_text.substring(98, 104) + s[4] + program_text.substring(104, 109) + s[4] + program_text.substring(109, 120) + s[4] + program_text.substring(120) + s[2] + s[3] + s[1] + s[0] + s[0] + program_text.substring(220,269) + s[1] + s[0] + s[0] + program_text.substring(270,327) + s[1] + s[0] + s[0] + program_text.substring(328,351) + s[1] + s[0] + s[0] + program_text.substring(352,451) + s[1] + s[0] + s[0] + program_text.substring(452,475) + s[1] + s[0] + s[0] + program_text.substring(476,1168) + s[1] + s[0] + program_text.substring(1168,1169) + s[1] + program_text.substring(1169));
	}
}
