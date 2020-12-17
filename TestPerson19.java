package overridingMethods19;

public class TestPerson19 {
	public static void main(String[] args) {
		Person19 person = new Person19(
				"Anna", 
				"zhk. Lozenets", 
				"0872345672", 
				"anna@abv.bg");
		Student19 student = new Student19(
				Student19.JUNIOR, 
				"Petya", 
				"zhk. Drujba",
				"0877658435", 
				"petya@abv.bg");
		Employee19 employee = new Employee19(
				"OBB", 
				1734 ,
				"Gabi", 
				"zhk. Liulin",
				"0873679104", 
				"gabi@abv.bg");
		Staff19 staff = new Staff19(
				"Secratary", 
				"BNR", 
				 564 ,
				"Mimi", 
				"zhk. Hadji Dimitur", 
				"0873971825",
				"mimi@abv.bg");
		Faculty19 faculty = new Faculty19(
				"8:30 - 19:00" ,
				"Principal" ,
				"SMG",
				2700 ,
				"Ali",
				"zhk. Nadezhda",
				"0876729043", 
				"ali@abv.bg");
		System.out.println(person.toString());
		System.out.println("\n"+ student.toString());
		System.out.println("\n"+ employee.toString());
		System.out.println("\n"+ staff.toString());
		System.out.println("\n"+ faculty.toString());
	}
}
