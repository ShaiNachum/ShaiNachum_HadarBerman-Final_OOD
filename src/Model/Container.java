///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Model;

import java.util.Random;

public class Container extends AbstractContainer {
	private int r, g, b;
	private int width, height;
	//private boolean isMarked;
	private boolean isOnTruck;
	private IContState state;//new #6- state
	Command command;//new #7- Command

	public Container(int x, int y) {
		super(x, y);//new
		Random rnd = new Random();
		r = rnd.nextInt(255);
		g = rnd.nextInt(255);
		b = rnd.nextInt(255);
		width = 110;
		height = 45;
		//isMarked = false;
		isOnTruck = false;
		this.state = new MarkOff(this);//new
	}
	
	//new functionalities for #7- command
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void exectuteCommand() {
		command.execute();
	}
	//till here
	
	public boolean isMarked() {
		//return isMarked;
		return this.state.getStatus();
	}

	public void setMarked(int y) {
		if ((y >= this.y) && (y <= this.y + this.height)) {
			//isMarked = true;
			this.state.markOn();//new
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean getIsOnTruck() {
		return isOnTruck;
	}

	public void setMarked(boolean isMarked) {
		//this.isMarked = isMarked;
		//new from here
		if(isMarked == false)
			this.state.markOff();
		else
			this.state.markOn();
		//till here
	}
	
	//#6- state 
	public void setState(IContState state)
	{
		this.state = state;
	}

	//new 
	@Override
	public boolean isNull() {
		return false;
	}

}
