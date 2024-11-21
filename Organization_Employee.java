package task;

interface Personal_Details{ 

void information(); 

default void contact_details() { 

String organization_name = "Steam"; 

System.out.println("Organization Name : "+ organization_name); 

System.out.println("------------------------------------"); 

} 

static void permanent_Information() { 

System.out.println("Organization Location : United_States"); 

} 

} 

public class  Organization_Employee implements Personal_Details { 

@Override 

public void information () { 

String name ="Kumar"; 

String organization_role = "Developer"; 

System.out.println("Personal Information"); 

System.out.println("Name : "+name); 

System.out.println("Organization_Role : "+ organization_role); 

} 

@Override 

public void contact_details () { 

String organization_name = "Hi Hello  Steam"; 

System.out.println(organization_name); 

System.out.println("------------------------------------"); 

} 

public static void main(String args[]) { 

Organization_Employee  product = new Organization_Employee (); 

System.out.println("Default method inside interface"); 

product. contact_details (); 

System.out.println("Overide method of Interface"); 

product. information(); 

} 

} 