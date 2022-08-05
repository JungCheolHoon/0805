
public class Mammal extends Object{	//모든 class는 object의 자식으로 생략되어 있을 때 기본값이 설정되어 있음
	private String name;
//	public Mammal() {}
	public Mammal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
