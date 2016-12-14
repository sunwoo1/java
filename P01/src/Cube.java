
public class Cube extends ThreeDimenShape{
	float a,b,c;

	public Cube(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public float getVolume(){
		return a*b*c;
	}
}
