package week3.day1;

public class Students {
		public void getStudentInfo(int id) {
			System.out.println("Student id is:" +id);
		}
		public String getStudentInfo1(int id, String name) {
			System.out.println("Name is:" +name);
			return name;
		}
		public String getStudentInfo2(int id,String email) {
			System.out.println("email id is:" +email);
			return email;
		}
		public void getStudentInfo3(long phoneNumber) {
			System.out.println("phone number is:" +phoneNumber);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students Ss = new Students();
		Ss.getStudentInfo(205037);
		Ss.getStudentInfo1(205037, "Praveena");
		Ss.getStudentInfo2(205037, "praveenas.loganathan@gmail.com");
		Ss.getStudentInfo3(962992);
		
		
	}

}
