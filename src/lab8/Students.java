package lab8;

import java.util.ArrayList;

public class Students {
	
	public static ArrayList<ArrayList> javaClass() {//***returns raw type data
		ArrayList<ArrayList> javaClass = new ArrayList<ArrayList>();

		//////////////to add student copy to bottom of method x = next sequential number
		//////////////replace Strings with student's data
		//////////////String title can be changed in student0
//		ArrayList studentx = new ArrayList();
//		studentx.add(0, "First Name");
//		studentx.add(1, "Surname");
//		studentx.add(2, "Nickname");
//		studentx.add(3, "Gender");
//		studentx.add(4, "beard presence");
//		javaClass.add(x, studentx);
		
		ArrayList student0 = new ArrayList();
		student0.add(0, "First Name");
		student0.add(1, "Surname");
		student0.add(2, "Nickname");
		student0.add(3, "Gender");
		student0.add(4, "beard presence");
		javaClass.add(0, student0);

		ArrayList student1 = new ArrayList();
		student1.add(0, "Krzysztof");
		student1.add(1, "Grabka");
		student1.add(2, "Kristoff... because some of us have difficulty pronouncing Krzysztof.");
		student1.add(3, 'M');
		student1.add(4, false);	
		javaClass.add(1, student1);

		ArrayList student2 = new ArrayList();
		student2.add(0, "Cynthia");
		student2.add(1, "Turner");
		student2.add(2, "Cyn");
		student2.add(3, 'F');
		student2.add(4, false);	
		javaClass.add(2, student2);

		ArrayList student3 = new ArrayList();
		student3.add(0, "Luke");
		student3.add(1, "Lorenger");
		student3.add(2, "Big Daddy");
		student3.add(3, 'M');
		student3.add(4, true);	
		javaClass.add(3, student3);

		ArrayList student4 = new ArrayList();
		student4.add(0, "Carl");
		student4.add(1, "Scozzari");
		student4.add(2, "Carl");
		student4.add(3, 'M');
		student4.add(4, true);
		javaClass.add(4, student4);

		ArrayList student5 = new ArrayList();
		student5.add(0, "Michael");
		student5.add(1, "Alexander II");
		student5.add(2, "Mike");
		student5.add(3, 'M');
		student5.add(4, false);	
		javaClass.add(5, student5);

		ArrayList student6 = new ArrayList();
		student6.add(0, "Lauren");
		student6.add(1, "Mattes");
		student6.add(2, "Kitty");
		student6.add(3, 'F');
		student6.add(4, false);	
		javaClass.add(6, student6);

		ArrayList student7 = new ArrayList();
		student7.add(0, "Norvell");
		student7.add(1, "Robinson");
		student7.add(2, "Vell");
		student7.add(3, 'M');
		student7.add(4, false);	
		javaClass.add(7, student7);

		ArrayList student8 = new ArrayList();
		student8.add(0, "Thomas");
		student8.add(1, "Hagey");
		student8.add(2, "Tom");
		student8.add(3, 'M');
		student8.add(4, true);	
		javaClass.add(8, student8);

		ArrayList student9 = new ArrayList();
		student9.add(0, "Kyle");
		student9.add(1, "Dixon");
		student9.add(2, "Dixie");
		student9.add(3, 'M');
		student9.add(4, true);	
		javaClass.add(9, student9);

		ArrayList student10 = new ArrayList();
		student10.add(0, "Derek");
		student10.add(1, "Quinn");
		student10.add(2, "Dereq");
		student10.add(3, 'M');
		student10.add(4, false);
		javaClass.add(10, student10);

		ArrayList student11 = new ArrayList();
		student11.add(0, "Sunceray");
		student11.add(1, "Patterson");
		student11.add(2, "Star");
		student11.add(3, 'F');
		student11.add(4, false);
		javaClass.add(11, student11);

		ArrayList student12 = new ArrayList();
		student12.add(0, "Schuyler");
		student12.add(1, "von Oeyen");
		student12.add(2, "Schuyler (pronounced: Skyler)");
		student12.add(3, 'M');
		student12.add(4, false);
		javaClass.add(12, student12);

		ArrayList student13 = new ArrayList();
		student13.add(0, "Nicholas");
		student13.add(1, "Meshkin");
		student13.add(2, "Nick");
		student13.add(3, 'M');
		student13.add(4, true);	
		javaClass.add(13, student13);

		ArrayList student14 = new ArrayList();
		student14.add(0, "Theo");
		student14.add(1, "Eisenstein");
		student14.add(2, "Einstein");
		student14.add(3, 'M');
		student14.add(4, false);	
		javaClass.add(14, student14);

		ArrayList student15 = new ArrayList();
		student15.add(0, "George");
		student15.add(1, "Icsman");
		student15.add(2, "dependent upon precise moments in time.");
		student15.add(3, 'M');
		student15.add(4, false);	
		javaClass.add(15, student15);

		ArrayList student16 = new ArrayList();
		student16.add(0, "Jason");
		student16.add(1, "Westbrook");
		student16.add(2, "J");
		student16.add(3, 'M');
		student16.add(4, false);
		javaClass.add(16, student16);
		
		ArrayList student17 = new ArrayList();
		student17.add(0, "Kathleen");
		student17.add(1, "Harrell");
		student17.add(2, "Katie");
		student17.add(3, 'F');
		student17.add(4, false);
		javaClass.add(17, student17);
		
		return javaClass;
	}	
	
	public static ArrayList getStudent(int index) {//returns indexed student's data
		return javaClass().get(index);
	}
	
	public static String getFirstName(int index) {//returns indexed student's name
		ArrayList student = getStudent(index);
		return (String) student.get(0);
	}
		
}
