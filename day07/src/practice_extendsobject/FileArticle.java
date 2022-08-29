package practice_extendsobject;

public class FileArticle extends Article{

	String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String toString() {
		return "FileArticle [ 글번호 : " + getNum() + ", 글제목 : " + 
	getTitle() + ", 첨부파일 : " + getFileName() + " ]";
	}
}
