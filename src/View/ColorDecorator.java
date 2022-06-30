///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669/////////////////////////////////////////////////////////////////////////
//new class
package View;

public abstract class ColorDecorator implements ShapeColor{
	
	protected ShapeColor decoratoredColor;
	
	public ColorDecorator(ShapeColor decoratoredColor) {
		this.decoratoredColor=decoratoredColor;
	}

}
