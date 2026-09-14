public class Student {
   
       String name;
	   int  rollno;
       String Phnno;
       String address;

        public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public int getRollno() {
			return rollno;
		}




		public void setRollno(int rollno) {
			this.rollno = rollno;
		}




		public String getPhnno() {
			return Phnno;
		}




		public void setPhnno(String phnno) {
			Phnno = phnno;
		}




		public String getAddress() {
			return address;
		}




		public void setAddress(String address) {
			this.address = address;
		}        

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.name = "John";
		s1.rollno = 2;
		s1.Phnno = "8575986325";
		s1.address = "Mumbai";		
		
		Student s2 = new Student();
		s2.name = "Sam";
		s2.rollno = 3;
		s2.Phnno = "9765298572";
		s2.address = "Pune";
		
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.Phnno);
		System.out.println(s1.address);

		System.out.println(s2.name);
		System.out.println(s2.rollno);
		System.out.println(s2.Phnno);
		System.out.println(s2.address);

	}

}
