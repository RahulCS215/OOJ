class stringConstructor {
	public static void main(String[] args) {

		System.out.println("question 1 : "); 
		// type 1 
		String s1 = new String(); 
		s1 = "BMSCE"; 
		System.out.println("type 1 : "+s1); 

		// type 2 
		String s2 = new String("BMSCE"); 
		System.out.println("type 2 : "+s2); 

		// type 3 
		char chars[] = {'B', 'M', 'S', 'C', 'E'};
		String s3 = new String(chars); 
		System.out.println("type 3 : "+s3); 

		// type 4 
		char chars1[] = {'B', 'M', 'S', 'C', 'E'}; 
		String s4 = new String(chars, 1, 2); 
		System.out.println("type 4 : "+s4);
		
		// type 5 
		byte bytes[] = {97,98,99,100}; 
		String s5 = new String(bytes); 
		System.out.println("type 5 : "+s5);

		System.out.println("question 2 : "); 
		// string length. 
		System.out.println("length of s1 : "+s1.length());

		// string concat. 
		System.out.println("concatenation of s1 and s2 : "+s1.concat(s2));

		System.out.println("question 3 : ");
		// toString. 
		Integer a = 10; 
		System.out.println("toString() : "+ a.toString());

		// getChars. 
		String s6 = new String("welcome to bmsce college of engineering"); 
		char[] dest = new char[50]; 
		s6.getChars(11, 16, dest, 0); 
		System.out.println("getChars() : "+ dest);

		//question 5
		System.out.println("question 5 : ");
		String s7="ABCDEFG";  
		byte[] barr=s7.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);  
		}

		String s8 = "BMSCE";
       		char[] g = s8.toCharArray();
        	for (int i = 0; i < g.length; i++) {
            	System.out.println(g[i]);
        	}		
	}
}