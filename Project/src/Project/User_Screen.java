package Project;

import java.util.Scanner;
import java.util.Set;

public class User_Screen {

	public  void disp() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("-----------This is a file managing system-------------------");
			System.out.println("-----------Created as a Project for Java FSD Phase1---------");
			System.out.println();
			System.out.println();
			System.out.println("There are 3 options in the application ");
			System.out.println();
			System.out.println();
			System.out.println("Option 1 will return the current file names in the directory ");
			System.out.println();
			System.out.println("Option 2 will make you do changes (add/delete and search) in the directory ");

			System.out.println();
			System.out.println("Option 3 will close the application");

			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("Please enter 1/2/3 to go to Option 1/ Option 2 and Option 3 respectively");

			System.out.println();
			String opt = sc.nextLine();

			System.out.println();
			
			
			
			if(!opt.equals("1") && !opt.equals("2") && !opt.equals("3")) {
				System.out.println("Please add a valid Input");
				continue;
			}
			
			
			int option = Integer.parseInt(opt);

			if(option ==1) {

				System.out.println("---");
				System.out.println("Option 1 is selected");

				System.out.println();
				
				System.out.println("Please enter the file path");

				System.out.println();
				
				String filePath = sc.nextLine();

				Screen1 screen1_object = new Screen1(filePath);
				Set<String> s1 = screen1_object.getList(filePath);
				if (s1 == null) {
					continue;
				}
				else if (s1.size()!=0){
					System.out.println("The files in directory are ---- >");
					for (String i:s1) {
						System.out.print(i+"; ");
					}
					System.out.println();
				}
				else {
					System.out.println("There are no files in the directory");
					System.out.println();
				}
			}
			if(option ==2) {
				int flag = 0;
				System.out.println("---Option 2 is Selected ------"); 
				System.out.println();
				
				System.out.println();
				System.out.println("Here you have 3 options available : ");
				System.out.println();
				System.out.println("Option 2.1 -- > Will add a file to the directory");
				System.out.println("Option 2.2 -- > Will delete a file from the directory");
				System.out.println("Option 2.3 -- > Will search for a file in the directory");
				System.out.println("Option 2.4 -- > Will get you back to the main screen ");
				
				System.out.println();
				System.out.println("Please enter 1/2/3/4 to go to Option 2.1/ Option 2.2/ Option 2.3 and Option 2.4 respectively");
				System.out.println();
				String opt2= sc.nextLine();
				if(!opt2.equals("1") && !opt2.equals("2") && !opt2.equals("3") && !opt2.equals("4")) {
					System.out.println("Please add a valid Input returning you to the main screen");
					continue;
				}
				

				int option2_option = Integer.parseInt(opt2);
				if (option2_option == 4) {
					continue;
				}
				System.out.println();
				System.out.println("Please enter the file path ");
				System.out.println();
				String filePath2 = sc.nextLine();
				
				if(option2_option == 1) {
					System.out.println("Option 2.1 is selected");
					Screen2 obj_s2 = new Screen2(filePath2);
					obj_s2.addFile();
				}
				if (option2_option == 2) {
					System.out.println("Option 2.2 is selected");
					Screen2 obj_s2_2 = new Screen2(filePath2);
					obj_s2_2.deleteFile();
				}
				if (option2_option == 3) {
					
					System.out.println("Option 2.3 is selected");
					Screen2 obj_s2_3 = new Screen2(filePath2);
					obj_s2_3.searchFile();
					
				}
				
			}
			
			if (option==3) {
				System.out.println("You have successfully exited the application. ");
				System.out.println("Thanks for joining in.");
				System.exit(0);
			}
		}
	}
}
