import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// Printing a string
		String a ="abc";
		System.out.println(a);
		//Compares totrimFunction ="
		String z = "Ramsha";
		String x= "Warsi";
		System.out.println(z.compareTo(x));
		System.out.println(String.valueOf(z));
		String unTrim ="               abc    ";
		System.out.println(unTrim.trim());
		System.out.println(unTrim.toUpperCase());
		String upperCase = unTrim.toUpperCase();
		System.out.println(upperCase);
		System.out.println(upperCase.trim());
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		System.out.println(lowerCase.trim());
		String fullName ="Ramsha Warsi";
		String[] splitName = fullName.split("a");
		System.out.println(Arrays.toString(splitName));
		for (String part : splitName) {
            System.out.println(part);
        }
		
		String substring = fullName.substring(2, 8);
		System.out.println(substring);
		System.out.println(a.startsWith(substring, 'r'));
		

	}

}
