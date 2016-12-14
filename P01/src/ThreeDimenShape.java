
public abstract class ThreeDimenShape extends Shape{
	public abstract float getVolume();

	@Override
	public float getInfo() {
		return getVolume();
	}
}
