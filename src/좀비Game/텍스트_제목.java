package 좀비Game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 텍스트_제목 {

	public 텍스트_제목() {
		
	
					BufferedReader bReader = null;

			try {

				String s;
				File file1 = new File("제목.txt");
				bReader = new BufferedReader(new FileReader(file1));

				// 더이상 읽어들일게 없을 때까지 읽어들이게 합니다.
				while((s = bReader.readLine()) != null) {
					System.out.println(s);
				}
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(bReader != null) bReader.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}


		}
	}





