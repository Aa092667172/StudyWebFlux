package webscoket.domain;

public class Result {
	private boolean flag;
	private String message;
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Result [flag=" + flag + ", message=" + message + "]";
	}
	
}