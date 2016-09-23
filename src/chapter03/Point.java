package chapter03;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	public boolean equals2(Object obj) {
		if(this == obj){
			return true;
		}
		if(this.getClass() != obj.getClass() ){
			return false;
		}
		
		Point other = (Point)obj;
		if(this.x != other.getX()){
			return false;
		}
		if(this.y != other.getY()){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
//	hash는 항상 equals랑 같이 오버라이드(오작동할수있음)
//	제네레이트에 같이 있는이유는 주소기반의 해시코드를 내용기반의 해시코드로 
//	변경하고 비교하기 위함.(성능의 차이)
	
//	오버라이드가 되있으면 내용기반의 비교(오버라이드로 인한 주. 안되있음 
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

//	public String toString(){
//		return "Point[x=" + x + ",y=" + y + "]";
//	}
	
	
	
}
