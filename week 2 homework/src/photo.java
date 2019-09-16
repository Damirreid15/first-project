
public class photo {
private float height;
private float width;
@Override
public String toString() {
	return "photo [height=" + height + ", width=" + width + "]";
}
public photo(float height, float width) {
	super();
	this.height = height;
	this.width = width;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public float getWidth() {
	return width;
}
public void setWidth(float width) {
	this.width = width;
}




}
