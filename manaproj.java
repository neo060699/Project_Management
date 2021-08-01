import java.util.*;
public class manaproj {

	public static void main(String[] args) {
		
		
		System.out.println("Select option:");
		System.out.println("np - New Project \ndd - change due date \ntap - Change total Amount Paid \nfp - Finalize Project \ncd - update Contractor Details");
				

		
		
		ArrayList<project> Projects = new ArrayList<project>();
		ArrayList<User> Client = new ArrayList<User>();
		ArrayList<User> Contractor = new ArrayList<User>();
		ArrayList<User> Architect = new ArrayList<User>();
		String name;
		int fee_charge;
		int fee_paid = 0;
		int project_num = 0;
		String status;
		int erf_num;
		String due_date = "";
		String building_type;
		String building_address;
		long phone_num;
		String email;
		String address;
		String role;
		boolean another = true;
		String loop_proj;
		
		Scanner s = new Scanner(System.in);
		String option = s.nextLine();
		System.out.println("option = " + option);
		
		
		if (option.equals("np")) {
			while (another = true) {
				
				System.out.println("Building Type:	");
				building_type = s.nextLine();
			
				System.out.println("Name your Project.");
				
				name = s.nextLine();
				if (name == "") {
					name = name + building_type;
				}
				
				
				System.out.println("Enter Deadline.");
				due_date = s.nextLine();
				
				
				System.out.println("What is the Total Fee?");
				fee_charge = s.nextInt();
				
				
				System.out.println("How Much has been paid? .");
				fee_paid = s.nextInt();
				
		
				System.out.println("What is the Project Number?	");
				project_num = s.nextInt(); // Program skips this line for some reason so I've requested input twice.
				project_num = s.nextInt();
				
				
				System.out.println("Has the project been finalised? (Yes/No).");
				status = s.nextLine();
				
				
				System.out.println("Enter Address:	");
				building_address = s.nextLine();
				
				
				System.out.println("What is the erf number? .");
				erf_num = s.nextInt();	
				
				project proj1 = new project(name, due_date, fee_charge, fee_paid, status, project_num, building_type, building_address, erf_num); 
				
				System.out.println(proj1.toString());
				
				
				System.out.println("Architects name: ");			// Info for Architect
				name = s.nextLine();
				
				System.out.println("Architect Telephone Number: ");
				phone_num = s.nextInt();
				
				System.out.println("Architect E-mail address: ");
				email = s.nextLine();
				
				System.out.println("Architect Home Address: ");
				address = s.nextLine();
				
				role = "architect";
				
				User arch1 = new User(name, phone_num, email, address, project_num, role);
				
				
				System.out.println("Contractor name: ");					//Info for contractor
				name = s.nextLine();
				
				System.out.println("Contractor Telephone Number: ");
				phone_num = s.nextInt();
				
				System.out.println("Contractor E-mail address: ");
				email = s.nextLine();
				
				System.out.println("Contractor Home Address: ");
				address = s.nextLine();
				
				role = "contractor";
				
				User cont1 = new User(name, phone_num, email, address, project_num, role);
				
				System.out.println("Customer name: ");					//Info for contractor
				name = s.nextLine();
				
				System.out.println("Customer Telephone Number: ");
				phone_num = s.nextInt();
				
				System.out.println("Customer E-mail address: ");
				email = s.nextLine();
				
				System.out.println("Customer Home Address: ");
				address = s.nextLine();
				
				role = "customer";
				
				User cust1 = new User(name, phone_num, email, address, project_num, role);
				
				Projects.add(proj1);
				Client.add(cust1);
				Contractor.add(cont1);
				Architect.add(arch1);
				
				System.out.println("Would you like to add another project?  (Yes/No)");
				loop_proj = s.nextLine();
				if (loop_proj.equals("no")) {
					another = false;
					
				}
			}
			

			} else if (option.equals("dd")) { 
			 
				System.out.println("Enter project Number:	");
				int temp = s.nextInt();
				if (project_num == temp) {
					System.out.println(project_num);
					
			}
			
			System.out.println(); //"Enter new Due Date"
			due_date = s.nextLine();
			
			
		} else if (option.equals("tap")) {
			
			System.out.println("Enter Total amount Paid:	");
			int temp = s.nextInt();
			if (fee_paid == temp) {
				System.out.println(fee_paid);
				
		}
				System.out.println("Enter new Total Amount");
				fee_charge = s.nextInt();
		
		} else if (option.equals("fp")) {
			

			
			System.out.println("Finalize Project? (Yes/No)");
			status = s.nextLine();
			
		} else if (option.equals("cd")) {
	
			
			System.out.println("Finalize Project? (Yes/No)");
			status = s.nextLine();
		}
		
				
	}
	
	
	
}
