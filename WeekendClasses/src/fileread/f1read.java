package fileread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class f1read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Lenovo\\Desktop\\read.txt");
		FileReader fw=new FileReader(f);
		BufferedReader bw=new BufferedReader(fw);
		String line;
		while((line=bw.readLine())!=null)
		{
			System.out.println(line);
		}
		bw.close();
	}

}
