package nube.model;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserManagement extends Users{
	 private List<Users> register;

	public UserManagement(String firstName, String lastName, String studentID, String department, String email, int year, String contact) {
		super(firstName, lastName, studentID, department, email, year, contact);
		register = new ArrayList<>();
		readFile();
	}
	
	private void readFile() {
	    try (BufferedReader reader = new BufferedReader(new FileReader("registration.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] itemInfo = line.split(",");
	            if (itemInfo.length >= 7) {
	                String firstName = itemInfo[0];
	                String lastName = itemInfo[1];
	                String studentID = itemInfo[2];
	                String dept = itemInfo[3];
	                String email = itemInfo[4];
	                int year = Integer.parseInt(itemInfo[5]);
	                String contact = itemInfo[6];

	                Users user = new Users(firstName, lastName, studentID, dept, email,  year, contact);
	                register.add(user);
	            } else {
	                System.err.println("Invalid line: " + line);
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    
    public void addUsers(Users users) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("registration.txt"))) {
            pw.println(users.getFirstName() + "," + users.getLastName() + ","+ users.getStudentID() + "," + users.getDepartment() + "," + users.getEmail() + "," + users.getYear() + "," + users.getContact());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getStudentID() {
    	for (Users user: register) {
    		return user.getStudentID();
    	}
		return null;
    	
   }
    
    public String getName() {
        for (Users user : register) {
            String firstName = user.getFirstName();
            String lastName = user.getLastName();
            if (firstName != null && lastName != null) {
                return firstName + " " + lastName;
            }
        }
        return "";
    }
    
    public String getEmail() {
    	for (Users user: register) {
    		return user.getEmail();
    	}
		return null;
    	
   }
   
    public String getDepartment() {
    	for (Users user: register) {
    		return user.getDepartment();
    	}
		return null;
    }
    	
   
    
    public int getYear() {
    	for (Users user: register) {
    		return user.getYear();
    	}
		return 0;	
   }
    
    public String getContactNo() {
    	for (Users user: register) {
    		return user.getContact();
    	}
		return null;
    	
   }
    
}
