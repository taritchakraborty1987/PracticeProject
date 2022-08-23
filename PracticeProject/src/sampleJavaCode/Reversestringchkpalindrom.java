package sampleJavaCode;

public class Reversestringchkpalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		String chk ="";
		char c;
		System.out.println("Taken String: "+s);
		for(int i=0; i<s.length(); i++) {
			c = s.charAt(i);
			chk=c+chk;
		}
		System.out.println("Reverse String is: "+chk);
		
		if(chk.equalsIgnoreCase(s)==true) {
			System.out.println("String is Palindrom.");
		}else {
			System.out.println("String is not a Palindrom.");
		}
		if(s.contains("ami")==true) {
			System.out.println("Contains.");
		}else {
			System.out.println("Not Contains.");
		}

	}

}
