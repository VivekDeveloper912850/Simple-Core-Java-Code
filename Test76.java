class Test76{
	public static void main(String[] args) {
		Hello t=new Hello(10);
		Hello t1=new Hello(10);
		String s=new String("Hello world");
		Object o=new Hello();
		System.out.println(t.getClass());//class Hello
		System.out.println(o.getClass());// class Hello
		System.out.println(t);// 10
		System.out.println(t.toString());// 10
		System.out.println(t.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		//System.out.println(t.equals(s));//false
		//System.out.println(t.equals(t));//true
		System.out.println(t.equals(t1));//false
		System.out.println("t:  " + t + "t1:  " + t1);
	}
}
class Hello{ // extends Object
	int id;
	Hello(int id){
		this.id=id;
	}
	Hello(){}
	public boolean equals(Object obj){
		Hello t2=(Hello)obj;
		return (this.id == t2.id);
	}
	public int hashCode(){
		return 1;
	}
	public String toString(){
		return "" +id;
	}


}