package string;

public class Main06 {

	public static void main(String[] args) {
		
		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있다.
		 * 다음의 형태로 출력, split() 사용 금지
		 * --------------------------------------------
		 * 파일이름	:	food
		 * 확장자		:	jpg
		 * 폴더명		:	D:/photo/2022/travel
		 */
		String data = "D:/photo/2022/travel/food.jpg";
		
		// 파일 이름
		String name = data.substring(data.lastIndexOf("/") + 1, data.lastIndexOf("."));
		System.out.println("파일 이름 : " + name);
		
		//확장자 추출
		String ext = data.substring(data.lastIndexOf(".") + 1);
		System.out.println("확장자 : " + ext);
		
		// 소스파일의 폴더 이름 추출
		System.out.println("폴더명 : " + data.substring(0, data.lastIndexOf("/")));
		
		
		/*
		String path = "D:/photo/2022/travel/food.jpg";
		
		int dot = path.indexOf(".");
		int last_slash = path.lastIndexOf("/");
		
		String name = path.substring(last_slash + 1, dot);
		String a = path.substring(dot + 1);
		String folder_name = path.substring(0, last_slash);
		
		System.out.println("파일이름 : " + name);
		System.out.println("확장자 : " + a);
		System.out.println("폴더명 : " + folder_name);
		*/
	}
}
