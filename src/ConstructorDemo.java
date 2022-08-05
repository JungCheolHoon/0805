import java.util.Arrays;

public class ConstructorDemo {
	public static void main(String[] args) {
		
		int [] arrays = {1,2,3,4,5};
		Car car = new Car("Sonata","Hyundai",30_000_000);
		System.out.println(car.toString());
		
		
		
		System.out.println(Arrays.toString(arrays));
		
	}
}

/*
 * 생성자의 역할은 맴버 변수 또는 맴버 상수의 초기화
 * 생성자를 통해서 또는 Initialization Block을 통해서 초기화 한다.
 */
 