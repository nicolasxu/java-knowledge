package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String args[])
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int c;
			do {
				c = in.read();
				out.write(c);
			} while (c!= -1);
		} catch (IOException e) {
			System.out.println("IOException: "+e.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
			if (out != null) {
				if (in != null) { in.close(); }
				try {
					out.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
