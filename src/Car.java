import java.util.Date;

public class Car {
	private String name,maker;
	private int price;
	private Date today;
	private final double PI;
	
	public Car(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
		System.out.println("방금 객체가 생성되었습니다.");
	}
	
	{	//Initialization Block
		System.out.println("Hello, World");
		this.today = new Date();
		this.PI = 3.141596;
	}
	
	@Override
	public String toString() {		//메소드 재정의
		return "오늘은 " + this.today + "입니다.";
	}
}
