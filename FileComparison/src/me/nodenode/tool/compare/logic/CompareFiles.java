package me.nodenode.tool.compare.logic;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import me.nodenode.tool.compare.gui.FrontEnd;


public class CompareFiles {

	private String lineOne = null ;
	private String lineTwo = null;

	private static FileInputStream firstFile = null;
	private static FileInputStream secondFile= null;
	
	/** "" ""
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream f;
		try {
			
			FrontEnd gui = new FrontEnd();
			
			gui.entryPoint();
			
			 firstFile = new FileInputStream("firstfile.txt");
			 secondFile= new FileInputStream("secondfile.txt");
			
			BufferedReader bfReaderOneFile    = new BufferedReader(new InputStreamReader(new DataInputStream(firstFile)));
			BufferedReader bfReaderSecondFile = new BufferedReader(new InputStreamReader(new DataInputStream(secondFile)));

			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}



	}


	private String readFile(FileInputStream fileOne, FileInputStream fileSecond){



		return null;
	}



}
