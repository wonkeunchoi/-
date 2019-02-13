package 좀비Game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 무기 {
	Scanner scanner = new Scanner(System.in);
	int 총알;

	public 무기 (int 총알) {
		this.총알 = 총알;

		BufferedReader bReader = null;

		try {

			String s;
			File file1 = new File("권총무기.txt");
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

		/*  System.out.println("=======+정보+==========");
        System.out.println(" 총기  : 콜트M1911      ");
        System.out.println(" 공격력 : 30 ");
        System.out.println("======================");
		 */

		System.out.println("총알갯수 확인하기 Enter");

		scanner.nextLine();
		System.out.println("남은 총알갯수 : " +총알);
	}
}


