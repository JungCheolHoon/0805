
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
//		System.out.println(m.salary);
//		System.out.println(e.name);
//		System.out.println(e.salary);
		e.print();
	}
}
class Manager {	//class 가 파이널클래스이면 상속받을 수 없다.
	int salary = 1000000;
}
class Employee extends Manager{
	String name = "한지민";
	void print() {
		System.out.println(name);
	}
}
