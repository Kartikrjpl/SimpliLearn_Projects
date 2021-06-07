package Project;

import java.awt.List;
import java.io.File;
import java.util.Scanner;

public class Screen2 {
	String filePath;
	public Screen2(String filePath){
		this.filePath = filePath;
	}
	public void addFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name of the file to be created");
		System.out.println("*The name you will enter is case sensitive");
		System.out.println();
		String fileName = sc.nextLine();
		try {
			File dir = new File(this.filePath+"//"+fileName);
			if(dir.createNewFile()) {
				System.out.println("New file is created");
			}
			else {
				System.out.println("File alerady exsists returning you to the main screen");
			}
			
		}
		catch(Exception e){
			System.out.println("Please add a valid file path. Returning you to the main screen");
		}
	}
	
	public void deleteFile() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the name of the file to be deleted");
		System.out.println("*The name you will enter is case sensitive");
		System.out.println();
		String fileName = sc.nextLine();
		
		try {
			File dir = new File(this.filePath+"//"+fileName);
			boolean b = dir.delete();
			if(b) {
				System.out.println("File deleted successfully");
			}
			else {
				System.out.println("File does not exsist");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void searchFile() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the name of the file to be searched");
		System.out.println("*The name you will enter is case sensitive");
		System.out.println();
		String fileName = sc.nextLine();
		try {
			File f = new File(filePath);
			String[] file_List = f.list();
			
			if(file_List.length!=0) {
				int flag = 0;
				for (String i:file_List) {
					if(i.equals(fileName)) {
						System.out.println("File Found");
						flag = 1;
						break;
					}
				}
				if (flag==0) {
					System.out.println("No file found");
				}
			}
			else {
				System.out.println("No file found");
			}
			
		}
		catch ( Exception e) {
			System.out.println("Invalid File Path. Returning you to the main screen");
		
		}
	}
	
}
