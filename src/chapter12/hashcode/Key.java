package chapter12.hashcode;

public class Key {
	
	public int number;
	public String name;
	public int addr;
	
	public Key(int number) {
		this.number = number;
	}
	
	public Key(String name) {
		this.name = name;
	}

	// 물리적인 주소
	@Override
	public int hashCode() {
//		return super.hashCode();
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number) {
				return true;
			}
		} else {
			return false;
		}
		
		return super.equals(obj);
	}
}
