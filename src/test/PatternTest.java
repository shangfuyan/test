package test;

import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		Pattern patt = Pattern.compile("[^a-z[c-g]]");
		Pattern patt2 = Pattern.compile("[^A-Za-z]");
		boolean flag = patt.matcher("h").matches();
		boolean flag2 = patt2.matcher("a").matches();
		System.out.println(flag+"...................."+flag2);
	}
}
