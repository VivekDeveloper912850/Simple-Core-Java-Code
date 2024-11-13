

 public class Custom 
{
  public static void main(String [] args)
  {
  	Test t = new Test();
  	t.add("vivek");
  	t.add(10);
  	t.add('c');
  	t.add(10.5f);
  	t.add(34);
    System.out.println(t.capacity());
    System.out.println(t.size());
    System.out.println(t.get(3));

  }
}
class Test
{
	Object[] objArray = new Object[4];
	int elementcount = 0;
	public void add(Object obj)
	{
      if(elementcount == objArray.length)
      {
        IncreaseCapacity();

      }
      objArray[elementcount] = obj;
      elementcount++;
	}
  public void IncreaseCapacity()
  {
    int capacity = objArray.length * 2;
    Object[] newobj = new Object[capacity];
    for(int i = 0; i<objArray.length;i++)
    {
      newobj[i] = objArray[i];
    }
    objArray = newobj;

  }
  public Object capacity()
  {
    return objArray.length;
  }
  public int size()
  {
    return elementcount;
  }
  public Object get(int index)
  {
    if(index<0 || index>=size())
    {
      throw new IndexOutOfBoundsException();
    }
    return objArray[index];
  }

}