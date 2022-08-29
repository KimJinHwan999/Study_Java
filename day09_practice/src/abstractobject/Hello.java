package abstractobject;

public abstract class Hello{
	
	private String msg;
	
	public Hello(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg){
		System.out.println(msg);
	}
	
	public abstract void sayHello();
	
}