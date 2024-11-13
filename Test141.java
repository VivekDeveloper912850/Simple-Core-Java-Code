class Hello141
{

}

class Hai141 extends Hello141
{

}

class Test141
{
	public static void main(String args[]){
		Hai141 hai  = new Hai141();
		Hello141 h1 = new Hello141();
		Hello141 h2=new Hello141();
		//Hai141 hai1 = new Hello141();
		Hai141 hai2 = (Hai141)new Hai141();
		Hello141  h3=hai;
		//Hai141 hai3=hai;
		//Hai141 hai4=(Hai141)h1;
	}
}

