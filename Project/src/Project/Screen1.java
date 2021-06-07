package Project;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class Screen1 {
	String filePath;
	String[] file_List;
	public Screen1(String filePath) {
		this.filePath = filePath;
	}
	public Set<String> getList(String filePath) {

		Set <String> tree = new TreeSet<>();
		try {
			File f = new File(filePath);
			this.file_List = f.list();
			if(this.file_List.length!=0) {
				for (String i:this.file_List) {
					tree.add(i);
				}

			}

			return tree;
		} catch (Exception e) {
			
			// CREATE EXCEPTION
			System.err.println("Invalid file path");
		}
		return null;
		
		
	}
}
