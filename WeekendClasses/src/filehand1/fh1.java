package filehand1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fh1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f=new File("C:\\Users\\Lenovo\\deepa\\eclipse-workspace\\WeekendClasses\\src\\filehand1\\ab.txt");
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("hi");
			bw.newLine();
			bw.write("2023");
			bw.newLine();
			bw.write('s');
			bw.newLine();
			bw.write("welcomes you");
			bw.close();
			
			
			
	}

}
