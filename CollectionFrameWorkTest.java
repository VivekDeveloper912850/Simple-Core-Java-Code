package com.training;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionFrameworkTest {

	public static void main(String[] args) {
		
		  ArrayList arrayList=new ArrayList(8); 
		  arrayList.add("Tanweer");
		  arrayList.add(10); 
		  arrayList.add(true); 
		  arrayList.add(10.9f);
		  arrayList.add("Tanweer");
		  
		  ArrayList arrayList1=new ArrayList(8); 
		  arrayList1.add("Tanweer");
		  arrayList1.add(10); 
		  
		  System.out.println("Before Retain:" +arrayList);
		  
		  Hello hello=new Hello();

		 // System.out.println(hello.getClass().getName());
		 // arrayList.clear();
		  
		 // System.out.println("After clear:" );
		  
		  
		  for(int i=0;i<arrayList.size();i++) {
			    System.out.print(" " +arrayList.get(i));
		  }
		  System.out.println();
		  ListIterator listIterator=arrayList.listIterator();
		  
		  while(listIterator.hasNext()) {
			  System.out.print(" " +listIterator.next());
		  }
		   
     	/*
		 * Object object[]=new Object[5]; object[0]="Mustafa"; object[1]=10;
		 * object[2]=true; object[3]=10.9f;
		 * 
		 * for(int i=0;i<object.length;i++) { System.out.print(" " +object[i]);
		 * 
		 * }
		 */       
       
	}

}

class Hello{
}
		