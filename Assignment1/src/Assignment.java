import java.io.*;

public class Assignment {

	public static void main(String [] argv) throws IOException
	{
		BufferedReader stdin =
				   new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please input the number of sentences:"); 
		int numberOfString = Integer.parseInt(stdin.readLine()); 
		String [] readString = new String[numberOfString];
		System.out.println("Please start to input sentences:");
		for(int i = 0; i < numberOfString; i++) { 
            String input = stdin.readLine();
            readString[i] = input;
        }
		readString = bubbleSortString(readString);
		System.out.println("The sorting results:");
		for(int i = 0; i < numberOfString; i++) { 
			System.out.println(readString[i]); 
		}
	}

	private static String[] bubbleSortString(String[] readString) {
		int length = readString.length;
		while (length > 1) {
			length--;			
		    for (int i = 0; i < length; i++) {
		    	//switch two strings if later one bigger
		    	if(readString[i+1].compareTo(readString[i]) < 0) {
		    		String tmp = readString[i];
		    		readString[i] = readString[i+1];
		    		readString[i+1] = tmp;
		    	}

		    }
		}
		return readString;
		
	}

}
