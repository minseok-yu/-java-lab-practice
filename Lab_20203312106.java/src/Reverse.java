import java.io.*;
public class Reverse {
	public static void main(String[] args) throws IOException {
		/*BufferedReader reader = new BufferedReader("input.txt");
        BufferedWriter writer = new BufferedWriter("output.txt");
        String[] lines = new String[200];
        int index = 0;
        String line;
        while((line = reader.readLine()) != null) {
        	lines[index++] = line;
        }*/
		
		InputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr= new InputStreamReader(fis);
		BufferedReader br= new BufferedReader(isr);
		
		OutputStream fis1 = new FileOutputStream("output.txt");
		OutputStreamWriter isr1= new OutputStreamWriter(fis1);
		BufferedWriter br1= new BufferedWriter(isr1);
		
		String[] lines;
		lines = new String[1000];
		String line;
		int index = 0;
		line = new String();
		while((line = br.readLine() ) != null) {
			lines[index++] = line;
		}
		
		for(int i = index-1; i >= 0; i--) {
			br1.write(lines[i]);
			br1.write("\n");
		}
		br1.flush();
		fis.close();
		isr.close();
		br.close();
		
		fis1.close();
		isr1.close();
		br1.close();
		
	}
}
