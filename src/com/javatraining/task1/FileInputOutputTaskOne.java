package com.javatraining.task1;

import java.io.*;

public class FileInputOutputTaskOne {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("D:\\Spring Projects\\FileInputOutputTaskOne\\input.txt"));
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("D:\\Spring Projects\\FileInputOutputTaskOne\\output.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				StringBuilder words = new StringBuilder(); 
				for (char c : line.toCharArray()) {
                    if ("aeiou".contains(String.valueOf(c))) {
                        words.append(Character.toUpperCase(c));
                    } else {
                        words.append(c);
                    }
                }
				System.out.println(words.toString());
                writer.write(words.toString());
                writer.newLine();
			}
			reader.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
