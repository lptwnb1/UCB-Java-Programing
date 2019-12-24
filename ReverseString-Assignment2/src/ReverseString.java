import java.io.*;

public class ReverseString {
	public static void main(String [] argv) throws IOException{
        
		System.out.println("Please input the sentence you want to reverse:"); 
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String input = stdin.readLine();
        String revertedInput = reverse(input);
		System.out.println("The reverted sentence is:");
		System.out.println(revertedInput);
    }
	
	static String reverse(String s) {
		int len = s.length();
		String revertStr;
		
		// return the s itself, if length is less than 1
		if(len <= 1)
			return s;
		
		// recursive call if the length is larger than 2
		// if the length is not larger than 2(which implies the length is 2)
		// then reverse the string
		if(len > 2) {
			revertStr = s.charAt(len-1) + reverse(s.substring(0, len-1));
		}else {
			revertStr = "" + s.charAt(len-1) + s.charAt(len-2);
		}
		return revertStr; 
	}
}
