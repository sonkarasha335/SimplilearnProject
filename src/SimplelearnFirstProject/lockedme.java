package SimplelearnFirstProject;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

//import java.util.Scanner;

public class lockedme {

	public static void main(String[] args)throws Exception {
			
		System.out.println("*****************************************");
		System.out.println("******* Welcome to SimplelearnFirst Project  *********");
		System.out.println("*****************************************");
		System.out.println("***********Developer Details**************");
		System.out.println("___________Name: Asha Sonkar______________");
		System.out.println("___________Designation: Developer__________\n");
		System.out.println("Main Menu");
	while (true) {
	            System.out.println("Enter 1 : Display All file names in ascending order\n" +
	                    "Enter 2:  Select these Operation\n" +
	                    "Enter 3: Quit the Application");
	            Scanner scanner = new Scanner(System.in);
	            int option = scanner.nextInt();

	            if (option == 1) {
	            	File file = new File("C:\\workspace\\eclipse\\LockedMe.com\\filechecked\\");
	                String[] students = file.list();
	                Arrays.sort(students);
	                for (int i = 0; i< students.length; i++) {
	                    String filename = students[i];
	                    System.out.println(filename);
	                }
	            } else if (option == 2) {
	            	System.out.println("Option 2 is selected");
	                System.out.println("Enter 1 : add file");
	                System.out.println("enter 2:  Delete file"); 
	                System.out.println("enter 3:  Search file"); 
	                System.out.println("enter 4:  Go back");  
	                int input = scanner.nextInt();
	                switch (input) {
	                    case 1:
	                        System.out.println("Enter your file name");
	                        Scanner scanner1 = new Scanner(System.in);
	                        String name = scanner1.nextLine();
	                        File file = new File("C:\\workspace\\eclipse\\LockedMe.com\\filechecked\\" + name);
	                        if (file.createNewFile()) {
	                            System.out.println("File is created Successfully");
	                        } else {
	                            System.out.println("File is already exist");
	                        }
	                        break;
	                    case 2:
	                        System.out.println("Enter file name for delete");
	                        Scanner scanner2 = new Scanner(System.in);
	                        String name1 = scanner2.nextLine();
	                        File file1 = new File("C:\\workspace\\eclipse\\LockedMe.com\\filechecked\\" + name1);
	                        if(file1.delete())
	                            System.out.println("File is deleted Susseccfully");
	                        else
	                            System.out.println("File is not deleted or file is not found");
	                        break;
	                    case 3:
	                        System.out.println("Enter your file name to search");
	                        Scanner scanner3 = new Scanner(System.in);
	                        String fileName = scanner3.nextLine();
	                        File file2 = new File("C:\\workspace\\eclipse\\LockedMe.com\\filechecked\\" + fileName);
	                        if( file2.exists())
	                        {
	                            System.out.println("File is available");
	                        }
	                        else {
	                            System.out.println("File is not available");
	                        }
	                        break;
	                    case 4:
	                        System.out.println("Going to back menu");
	                        break;
	                    default:
	                        System.out.println("Please enter a valid option");
	                }
	            }
	            if (option == 3){
	               System.out.println("Thanks For Using my Project.");
	               
	               System.out.println("__________Happy Learning________");
	               System.exit(option);
	            }
	        }
	    }
	}
	        
	    
	

