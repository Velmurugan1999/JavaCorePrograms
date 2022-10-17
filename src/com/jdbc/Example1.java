package com.jdbc;

import java.util.Scanner;
// CRUD Operation
public class Example1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CrudOperations obj=new CrudOperations();
		while(true)
		{
			System.out.println("Enter \n1->Print all Details\n2->Insert new Detail\n3->Delete the employee\n4->update");
			int i=Integer.parseInt(sc.nextLine());
			if(i==1)
				obj.printall();
			else if(i==2)
				obj.insert();
			else if(i==3)
				obj.delete();
			else if(i==4)
				obj.update();
			else
				break;
			
		}
		System.out.println("Exited................");
		System.out.println("Thank you!!!!!!!!!");
		sc.close();
		obj.closeCon();
	}

	
}


/*if(i==0)
{
	System.out.println("Enter \n1->Print all Details\n2->Insert new Detail\n3->Delete the employee");
	i=sc.nextInt();
}
if(i==1)
{
	printall();
	i=0;
}

else if(i==2)
{
	insert();
	i=0;
}
else if(i==3)
{
	delete();
	i=0;
}
else
	break;*/
		
