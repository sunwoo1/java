
public class Circle extends TwoDimenShape{
	final float pi = 3.14f;
	float r;
	
	public Circle(float r) {
		this.r = r;
	}

	public float getArea(){
		return pi*r*r;
	}
}
