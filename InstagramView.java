package com.instagram.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class InstagramView {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("****Welcome to Instagram****");
		System.out.println("Press 1 to create your page");
		System.out.println("Press 2 to delete your page");
		System.out.println("Press 3 to update your page");
		System.out.println("Press 4 to view a page");
		System.out.println("Press 5 to view all page");
		System.out.println("Press 6 to view with page with an email ID");
		int in = 0;
		try {
			in = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InstagramControllerInterface IC=InstagramController.createObject();
		switch(in) {
		case(1):
			IC.createPage();
			break;
		case(2):
			IC.deletePage();
			break;
		case(3):
			IC.updatePage();
			break;
		case(4):
			IC.viewAPage();
			break;
		case(5):
			IC.viewAllPage();
			break;
		case(6):
			IC.search();
			break;
		default:
			System.out.println("Invalid input");
		}
		
		
		
		
		
	}

}
