package org.Learning;

public class TODO {
	public static void main(String[] arge) {
		String s = "Sahubar1356Sathik2515";
		String[] part=s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		System.out.println(part[0] + " " + part[2]);
		
		String s1= "sahubar1234sathik%&!";
		String alpha ="";
		String num ="";
		String spl ="";
		char[] ch  = s1.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			
			if(Character.isAlphabetic(ch[i])) {
				alpha=alpha+ch[i];
				
			}else if(Character.isDigit(ch[i])) {
				num=num+ch[i];
			}else {
				spl=spl+ch[i];
			}
			
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spl);
		
				

	}
}
