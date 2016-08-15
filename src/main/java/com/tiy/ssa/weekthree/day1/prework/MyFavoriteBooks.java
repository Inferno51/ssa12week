package com.tiy.ssa.weekthree.day1.prework;

import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;

public class MyFavoriteBooks {

	public static void main(String[] args) {
		
		ArrayList<String> jonsFavBooks = new ArrayList<>();
		
		Path ourNewPath = Paths.get("\\Users\\admin\\Desktop\\myFavBooks.txt");
		File aNewFile = ourNewPath.toFile();
		
		try(BufferedReader in = new BufferedReader(new FileReader(aNewFile))) {
			
			String aBook; 
			
			while ((aBook = in.readLine()) != null){
				
				jonsFavBooks.add(aBook);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i<jonsFavBooks.size(); i++){
			System.out.println(jonsFavBooks.get(i));
		}
		
	}

}
