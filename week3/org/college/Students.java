package org.college;


	public class Students {
		
		public void getStudentInfo( int id1)
		{
			System.out.println("Enter the id1 :"+id1);
				
		}
		public void getStudentInfo( int id, String name)
		{
			System.out.println("Enter the id :"+id);
			System.out.println("Enter the name :"+name);
			
			
		}
		public void getStudentInfo( double pNumber, String email)
		{
			System.out.println("Enter the phone number :"+pNumber);
			System.out.println("Enter the name :"+email);
			
		}

		public static void main(String[] args) {
			Students obj=new Students();
			obj.getStudentInfo(21,"Sophia");
			obj.getStudentInfo(551706018,"jb.sophia@gmail.com");
			
					}

		

	}


