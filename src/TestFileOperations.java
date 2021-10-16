 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Properties;
import java.util.Vector;

public class TestFileOperations {
	public static void main(String args[]) throws Exception {
		// deserialization
		// transfering object from persistent storage (HDD) into java memory
		File createf=new File("D:\\Tutorial\\object.txt");	// initialize file object with file path
		FileInputStream fis=new FileInputStream(createf);
		ObjectInputStream ois=new ObjectInputStream(fis);
		StudentCol obj=(StudentCol)(ois.readObject());
		System.out.println(obj.name);
		System.out.println(obj.grade);
		
		/*
		StudentCol sc=new StudentCol("john",1);
		// serialization is a process to permanently store
		// java object in persistent storage
		
		
		File createf=new File("D:\\Tutorial\\object.txt");	// initialize file object with file path
		FileOutputStream fos=new FileOutputStream(createf);
		ObjectOutputStream oo=new ObjectOutputStream(fos);
		oo.writeObject(sc);
		oo.close();
		
		// RAM - short term memory - java programs
		// HDD - long term memory, persistent storage
		
		/*
		File createf=new File("D:\\Tutorial\\newfile.txt");	// initialize file object with file path
		FileReader fr=new FileReader(createf);
		BufferedReader br=new BufferedReader(fr);
		try {
			String s=br.readLine();
			while(s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
		}catch(Exception e) {}
		finally {
			br.close();
		}
		
		File createbf=new File("D:\\Tutorial\\newfile.png");	// initialize file object with file path
		FileInputStream fis=new FileInputStream(createbf);
		BufferedInputStream bis=new BufferedInputStream (fis);
		int i=bis.read();
		while(i!=-1) {
			System.out.println(i);
			i=bis.read();
		}
		bis.close();
		//createf.createNewFile();			// check if file does not exist
		//FileWriter
// contructor.... 
// 1) file location = written data will be replaced with original content
// 2) file location, true = written data will be APPENDED with original content
		/*
		FileWriter fw=new FileWriter(createf,true);
		BufferedWriter bw=new BufferedWriter(fw);
		// line at a time
		// transfer group of charater = string (character array)
		String data="\n hi how are you \n welcome to java \n byebye";
		bw.write(data);
		bw.flush();
		bw.close(); 
		
		FileOutputStream ow=new FileOutputStream(createf,true);
		BufferedOutputStream bos=new BufferedOutputStream (ow);
		// line at a time
		// binary - bytes 1/0
		// transfer group of bytes = byte array
		byte[] imageBinContent=new byte[1024];
		bos.write(imageBinContent);
		bos.flush();
		bos.close();
		

		// connection open between program and destination
		// CLOSED - connections are consuming procesing CPU power
		// unclosed connections - writing and not saved yet
		*/
	}

}
