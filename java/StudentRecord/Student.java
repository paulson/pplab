//Student.java
//demonstrates student class
//to run this program : java Student
//date :2011/07/07
import java.io.*;
class StudentInfo
{
	int rollno,i,age,total=0;
	int mark[]=new int[3];
	int f=0;
	String s,name;
	public void getdata()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nRollNo:");
			s=br.readLine();
			rollno=Integer.parseInt(s);
			System.out.print("Name:");
			name=br.readLine();
			System.out.print("Age:");
			s=br.readLine();
			age=Integer.parseInt(s);
			System.out.print("Enter the Marks:");
			for(i=0;i<3;i++)
			{
				s=br.readLine();
				mark[i]=Integer.parseInt(s);
				total+=mark[i];
			}
		}
		catch(IOException e)
		{}
	}
	public void putdata()
	{
		System.out.print(rollno);
		System.out.print("\t"+name);
		System.out.print("\t"+age);
		System.out.print("\t"+total);
		System.out.print("\n");
	}
	public int search(int csn)
	{	
		int flag=0;
		if(csn==rollno)
		{
			System.out.print("Found\n");
			System.out.print("RollNo\tName\tAge\tTotal\n");
			putdata();
			return(flag);
		}
		else
			return(flag+1);
	}
}
//main class 
class Student
{
	public static void main(String arg[]) throws IOException
	{
		String s;
		int i,n,sn,flagm=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the no of Students:");
		s=br.readLine();
		n=Integer.parseInt(s);
		StudentInfo st[]=new StudentInfo[n];
		for(i=0;i<n;i++)
			st[i]=new StudentInfo();
		for(i=0;i<n;i++)
			st[i].getdata();
		System.out.print("\nRollNo\tName\tAge\tTotal\n");
		for(i=0;i<n;i++)
			st[i].putdata();
		System.out.print("\nEnter the RollNo to be searched:");
		s=br.readLine();
		sn=Integer.parseInt(s);
		for(i=0;i<n;i++)
			flagm+=st[i].search(sn);
		if(flagm==n)
			System.out.print("\nCould not find\n");
	}
}
/*
   OUTPUT
   ------
   paulson@paulson-Inspiron-1525:~/pplab/1$ javac Student.java 
   paulson@paulson-Inspiron-1525:~/pplab/1$ java Student

   Enter the no of Students:3

RollNo:1
Name:arun
Age:20
Enter the Marks:19
24
15

RollNo:2
Name:annie
Age:19
Enter the Marks:34
30
37

RollNo:3
Name:tintu
Age:21
Enter the Marks:12
17
23

RollNo	Name	Age	Total
1	arun	20	58
2	annie	19	101
3	tintu	21	52

Enter the RollNo to be searched:2
Found
RollNo	Name	Age	Total
2	annie	19	101
*/
