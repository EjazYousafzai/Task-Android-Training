import java.util.Scanner;
public class LibraryManagementSystem {
	public void setPersonalInfo(){
	    String name="Ejaz Yousafzai";
	    String fatherName="Shams ur Rehman";
	    int universityId=22333;
	        System.out.println("\nUser Name: "+name+"\t\t\t  University ID: "+universityId+"\nFather Name: "+fatherName);
	}
	String Dept1,Dept2,Dept3;
	    public void setDepart1(String Engineering){
	        Dept1=Engineering;
	    }
	    public void setDepart2(String Medical){
	        Dept2=Medical;
	    }
	    public void setDepart3(String Businness){
	        Dept3=Businness;
	    }

	    public String getDepart1(){
	        return Dept1;
	    }
	    public String getDepart2(){
	        return Dept2;
	    }
	    public String getDepart3(){
	        return Dept3;
	    }

	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);    
	    System.out.println("******************    LIBRARY MANAGEMENT SYSTEM     *******************\n");
	    System.out.print("Enter User ID: ");        //UserID = 1234
	    int userID=sc.nextInt();
	    
	    if (userID == 1234){
	    	LibraryManagementSystem info=new LibraryManagementSystem();
	        info.setPersonalInfo();
	        System.out.println();
	        LibraryManagementSystem dep=new LibraryManagementSystem();
	    
	    System.out.println("\t******Books of Different Departments******\n"
	    		+ "\t------------------------------------------\n\n"
	    		+ "Press 1 Books for Engineering Department\n"
	    		+ "Press 2 Books for Medicle Department\n"
	    		+ "Press 3 Books for Business Department");
	   int dept=sc.nextInt();
	        System.out.println();
	        
	    int d1 = 1;
	    int d2 = 2;
	    int d3 = 3;
	        
	        if (dept == d1){
	            dep.setDepart1("***Books of ENGINEEING Department***\n");
	            System.out.print(dep.getDepart1());
	            System.out.print("--------------------------------------\n");
	                String arr[]=new String [14];
	                arr[0]="Digital Computer Logic";
	                arr[1]="Object Oriented Programming";
	                arr[2]="AutoCad";
	                arr[3]="Computer Architecture & Organisation";
	                arr[4]="Design & Analysis Of Algorithm";
	                arr[5]="Artificial Intelligence";
	                arr[6]="Computer Graphics & Animation";
	                arr[7]="Digital Image Processing";
	                arr[8]="Web Programming Languages";
	                arr[9]="Analog Electronics";
	                arr[10]="Didcrete Math";
	                arr[11]="Data Structure";
	                arr[12]="Calculus";
	                arr[13]="Complex Variable and Integral Transformation";
	                    for(int i=0; i<arr.length; i++) {
	                        System.out.print("* "+arr[i]+".\n");
	                    }
	                System.out.println();
	        }
	        
	        else if(dept == d2 ){
	            dep.setDepart2("***Books of MADICAL Department***\n");
	            System.out.print(dep.getDepart2());
	            System.out.print("------------------------------------\n");
	         
	            String arr[]=new String[12];
	                arr[0]="Physical Pharmacy";
	                arr[1]="Bio Chemistry";
	                arr[2]="Anatomy";
	                arr[3]="Pharmacology";
	                arr[4]="Organic Chemistry";
	                arr[5]="Physiology";
	                arr[6]="Pharmacognosy";
	                arr[7]="Bio Chemistry";
	                arr[8]="Polymer Chemistry";
	                arr[9]="InOrganic Chemistry";
	                arr[10]="Fundamentals of Chemistry";
	                arr[11]="ISC Chemistry";
	                    for(int i=0; i<arr.length; i++) {
	                        System.out.print("* "+arr[i]+".\n");
	                    }
	                System.out.println();    
	        }
	        
	        else if(dept == d3){
	            dep.setDepart3("***Books of BUSINESS Department***\n");
	            System.out.print(dep.getDepart3());
	            System.out.print("------------------------------------\n");
	            
	            String arr[]=new String [10];
	                arr[0]="Human Resources Management";
	                arr[1]="Marketing Management";
	                arr[2]="Operation Management";
	                arr[3]="Business Statistics";
	                arr[4]="Financial Accounting";
	                arr[5]="Data Analysis";
	                arr[6]="Managerial Finance";
	                arr[7]="Business Comunication";
	                arr[8]="Business Laws";
	                arr[9]="Business Environment";
	                    for(int i=0; i<arr.length; i++) {
	                        System.out.print("* "+arr[i]+".\n");
	                    }
	        }
	        else {System.out.print("Not Avialable");}
	    
	    }
	    else{
	    System.out.println("User ID invalid!");
	    }
	    System.out.println("\n \t\t-------------------\t\t \n");
	}

}

