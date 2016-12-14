
public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle(10);
		Rectangle rec = new Rectangle(100,200);
		Triangle tri = new Triangle(100,200);
		
		
//		TwoDimenShape[] arr = {c,rec,tri};
//		
//		for(int i=0; i<arr.length; i++){
//			System.out.println(arr[i].getArea());
//		}
		
		Cube cb = new Cube(10,10,10);				
		Sphere sp = new Sphere(10);
		Cylinder cy = new Cylinder(10,100);
		
//		ThreeDimenShape[] arr2 = {cb,sp,cy};
//		
//		for(int i=0; i<arr2.length; i++){
//			System.out.println(arr2[i].getVolume());
//		}
		
		Shape[] shapeArr = {c, rec, tri, cb, sp, cy};
		for(int i=0; i<shapeArr.length; i++){
			System.out.println(shapeArr[i].getInfo());
		}
	}

}
