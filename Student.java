
class Student
{
	private int userId;
	private String name;
	private char grade;
       Student(int userId,String name,char grade)
	{
		this.userId=userId;
		this.name=name;
		this.grade=grade;

	}
	public int UserId()
	{
		return userId;

	}
	public String Name()
	{
		return name;

	}
	public char Grade()
	{
		return grade;

	}


}
class Test
{
	public static void main(String[] args) {
		
		 Student t=new Student(args[0]);
		 Student t1=new Student(args[1]);
		 Student t2=new Student(args[2]);
		 //System.out.println(args[0]);
		 //System.out.println(args[1]);
		// System.out.println(args[2]);
         int a=t.UserId();
         String b=t.Name();
         char c=t.Grade();
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		
		
	}
}