
public class User {
	//Attribute Section
		String name;
		long phone_num;
		String email;
		String address;
		int project_num;
		String role;
		
		
		public User(String name, long phone_num, String email, String address, int project_num, String role) {
			this.name = name;
			this.phone_num = phone_num;
			this.email = email;
			this.address = address;
			this.project_num = project_num;
			this.role = role;
		}
		
		public String setName() {
			return name;
		}
		
		public String getName() {
			return name;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String setEmail() {
			return email;
		}
		
		public String setAddress() {
			return address;
		}
		
		public String getAddress() {
			return address;
		}
		
		public int setProject_num() {
			return project_num;
		}
		
		public int getProject_num() {
			return project_num;
		}
		
		public String setRole( ) {
			return role;
		}
		
		public String getRole( ) {
			return role;
		}
		
		public String toString() { 
			String output = "Name: " + name;
			output += "Phone Number: " + phone_num;
			output += "E-mail: " + email;
			output += "Address: " + address;
			output += "Project Number: " + project_num;
			output += "Role:	" + role; 
			
			return output;
			
		}


}
