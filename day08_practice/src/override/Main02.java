package override;

class Hello2{
	Hello2(String msg){
		System.out.println(msg);
	}
}

class Korean2 extends Hello2{
	Korean2(String msg){
		super(msg);
	}
}

public class Main02{
	public static void main(String[] args) {
		Korean2 k = new Korean2("사용자");
		
	}
}