package com.tiy.ssa.weekthree.day1.prework;

import java.io.*;
import java.nio.file.*;

public class Monday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LocalDateTime //some random shit we'll get to eventually
		
		Path ourNewPath = Paths.get("\\Users\\admin\\Desktop\\anewtextfile.txt");
		File aNewFileObj = ourNewPath.toFile();
		
		try (
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFileObj, true)))) {	
			
			out.println("Raderman");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(BufferedReader in = new BufferedReader(new FileReader(aNewFileObj))) {
			String peopleInClassroom;
			
			while ((peopleInClassroom = in.readLine()) != null) {
				System.out.println(peopleInClassroom);
			}
			
		}catch (IOException f) {
			f.printStackTrace();
		}
		
	}//main
	
}//class
