package polymorphism;

public class Student {

	
		String name ;
		int age ;
		String coll ;
		int roll ;
		int yop ;
		
		
		public Student() {
			// TODO Auto-generated constructor stub
		}


		public Student(String name, int age, String coll, int roll, int yop) {
			super();
			this.name = name;
			this.age = age;
			this.coll = coll;
			this.roll = roll;
			this.yop = yop;
		}
		
		public String toString()
		{
			return "[Name : "+ name +"age:"+age+"coll:"+coll+"]" ;
		}
}

