//Jec.java
//demonstrates Inheritance
//to run this program : java Jec
//date :2011/08/04
iimport java.io.*;
class College
{
	String name,location,principal,fd,code;
	int founded;
	void getCollegeInfo() throws IOException
	{
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the college:");
		name=br.readLine();
		System.out.println("Enter the code of college:");
		code=br.readLine();
		System.out.println("Enter the location of college:");
		location=br.readLine();
		System.out.println("Enter the name of principal:");
		principal=br.readLine();
		System.out.println("Enter the year college was founded:");
		fd=br.readLine();
		founded=Integer.parseInt(fd);
	}
}
class Department extends College
{
	String dept,hod,no;
	int stno;
	void getDepartmentInfo()throws IOException
	{
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of dept.:");
		dept=br.readLine();
		System.out.println("Enter name of hod:");
		hod=br.readLine();
		System.out.println("Enter no.of students in dept.:");
		no=br.readLine();
		stno=Integer.parseInt(no);
		super.getCollegeInfo();
	}
}
class Batch extends Department
{
	String ba,sem;
	int g;
	void getBatchInfo()throws IOException
	{
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the semester:");
		sem=br.readLine();
		System.out.println("Enter the batch of Student:");
		ba=br.readLine();
		System.out.println("Enter the no. of students in batch:");
		g=Integer.parseInt(br.readLine());
		super.getDepartmentInfo();
	} 
} 
interface Library
{
	void lib();
}
interface Hostel
{
	void hos(String stu1);
}
class Student extends Batch  implements Hostel,Library
{
	String stu,n,address1,address2,sex,rel,mail,lname,mob,honam,ward,kkl,bname,bauth;
	int rno,acc,bno;
	void getStudentInfo(int j)throws IOException
	{
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of student"+j+":");
		stu=br.readLine();
		System.out.println("Enter the roll no.:");
		n=br.readLine();
		System.out.println("Male/Female?:");
		sex=br.readLine();
		System.out.println("Religion:");
		rel=br.readLine();
		rno=Integer.parseInt(n);
		System.out.println("Enter the house name:");
		address1=br.readLine();
		System.out.println("Enter the post office name:");
		address2=br.readLine();
		System.out.println("Enter the e-mail id:");
		mail=br.readLine();
		System.out.println("Enter the mob no.:");
		mob=br.readLine();
		lib();
		hos(stu);
		super.getBatchInfo();
	}
	void display()
	{
		System.out.println();
		System.out.println("Name: "+stu);
		System.out.println("Roll No: "+rno);
		System.out.println("Sex: "+sex);
		System.out.println("Religion: "+rel);
		System.out.println("House Name: "+address1);
		System.out.println("Post Office: "+address2);
		System.out.println("E-mail id: "+mail);
		System.out.println("Mobile: "+mob);
		System.out.println("Semester: "+sem);
		System.out.println("Batch: "+ba);
		System.out.println("No. of students: "+g);
		System.out.println("Department: "+dept);
		System.out.println("Department HOD: "+hod);
		System.out.println("No.of stud in dept: "+stno);
		System.out.println("College: "+name);
		System.out.println("College Code: "+code);
		System.out.println("Location: "+location);
		System.out.println("Principal: "+principal);
		System.out.println("year founded: "+founded);
		System.out.println("Librarian: "+lname);
		System.out.println("Issued Book name "+bname);
		System.out.println("Issued Book author "+bauth);
		System.out.println("Hostel name: "+honam);
		System.out.println("Warden: "+ward);
		System.out.println("Hostel room no: "+acc);
	}
	public void lib()
	{
		try
		{
			System.out.println();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name of librarian:");
			lname=br.readLine();
			System.out.println("Enter book name:");
			bname=br.readLine();
			System.out.println("Enter author name:");
			bauth=br.readLine();
		}
		catch(Exception e){}
	}
	public void hos(String stu1)
	{
		try
		{
			System.out.println();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print(stu1+" in  hostel(y/n)?:");
			String hyn=br.readLine();
			if(hyn.equals("y")) 
			{
				System.out.println("Enter name of hostel:");
				honam=br.readLine();
				System.out.println("Enter name of warden:");
				ward=br.readLine();
				System.out.println("Enter room no.:");
				kkl=br.readLine();
				acc=Integer.parseInt(kkl);
			}
		}catch(Exception e){}
	}
}
public class Jec 
{
	public static void main(String avg[])throws IOException
	{
		int a,r;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of students:");
		a=Integer.parseInt(br.readLine());
		Student s[]=new Student[a];
		for(int i=0;i<a;i++)
		{ 
			s[i]=new Student();
			s[i].getStudentInfo(i+1);
		}
		for(int i=0;i<a;i++)
		{ s[i].display();
		}
	}
}
/* OUTPUT 
   ---------
   paulson@paulson-Inspiron-1525:/media/CACC3548CC352FD5/jec/pplab/java/3$ javac Jec.java
   paulson@paulson-Inspiron-1525:/media/CACC3548CC352FD5/jec/pplab/java/3$ java Jec
   Enter no. of students:2

   Enter the name of student1:
   Paulson
   Enter the roll no.:
   1
   Male/Female?:
   Male
   Religion:
   Christian
   Enter the house name:
   Thattil House
   Enter the post office name:
   Ollur
   Enter the e-mail id:
   paul@fastmail.fm
   Enter the mob no.:
   9895463512

   Enter name of librarian:
   Mr. Adarsh
   Enter book name:
   Simulation And Modeling
   Enter author name:
   Gordon A

   Paulson in  hostel(y/n)?:y
   Enter name of hostel:
   Santhome
   Enter name of warden:
   Mr. Santhosh
   Enter room no.:
   311

   Enter the semester:
   5
   Enter the batch of Student:
   2009 - 2013
   Enter the no. of students in batch:
   60

   Enter name of dept.:
   CSE
   Enter name of hod:
   Mr. Muralee
   Enter no.of students in dept.:
   240

   Enter the name of the college:
   Jyothi Engg College
   Enter the code of college:
   JEC
   Enter the location of college:
   Cheruthuruthy
   Enter the name of principal:
   Mr. Gylson
   Enter the year college was founded:
   2002

   Enter the name of student2:
   Annie
   Enter the roll no.:
   2
   Male/Female?:
   Female
   Religion:
   Christian
   Enter the house name:
   Alappat House
   Enter the post office name:
   Cherpu
   Enter the e-mail id:
   iamannie@fastmail.fm
   Enter the mob no.:
   9847345690

   Enter name of librarian:
   Mr. Adarsh
   Enter book name:
   The Land Of LISP
   Enter author name:
   Macworthy

   Annie in  hostel(y/n)?:n

   Enter the semester:
   5
   Enter the batch of Student:
   2009 - 2013
   Enter the no. of students in batch:
   60

   Enter name of dept.:
   CSE
   Enter name of hod:
   Mr. Muralee
   Enter no.of students in dept.:
   240

   Enter the name of the college:
   Jyothi Engg College
   Enter the code of college:
   JEC
   Enter the location of college:
   Cheruthuruthy
   Enter the name of principal:
   Mr. Gylson
   Enter the year college was founded:
   2002

   Name: Paulson
   Roll No: 1
   Sex: Male
   Religion: Christian
   House Name: Thattil House
   Post Office: Ollur
   E-mail id: paul@fastmail.fm
   Mobile: 9895463512
   Semester: 5
   Batch: 2009 - 2013
   No. of students: 60
   Department: CSE
   Department HOD: Mr. Muralee
   No.of stud in dept: 240
   College: Jyothi Engg College
   College Code: JEC
   Location: Cheruthuruthy
   Principal: Mr. Gylson
   year founded: 2002
   Librarian: Mr. Adarsh
   Issued Book name Simulation And Modeling
   Issued Book author Gordon A
   Hostel name: Santhome
   Warden: Mr. Santhosh
   Hostel room no: 311

   Name: Annie
   Roll No: 2
   Sex: Female
   Religion: Christian
   House Name: Alappat House
   Post Office: Cherpu
   E-mail id: iamannie@fastmail.fm
   Mobile: 9847345690
   Semester: 5
   Batch: 2009 - 2013
   No. of students: 60
   Department: CSE
   Department HOD: Mr. Muralee
   No.of stud in dept: 240
   College: Jyothi Engg College
   College Code: JEC
   Location: Cheruthuruthy
   Principal: Mr. Gylson
   year founded: 2002
   Librarian: Mr. Adarsh
   Issued Book name The Land Of LISP
   Issued Book author Macworthy
   Hostel name: null
   Warden: null
   Hostel room no: 0
*/

