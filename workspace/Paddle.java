import java.awt.*;

public class Paddle {

	//your code here!

	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int velocity;
	private int height;
	
	//constructor(s):
	
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		velocity=1;
	}
	//methods:
	//this will draw the paddle; colouring and filling in an rectangle so that it can be seen and tracked
//precondition: color is not black, and the height and width is not 0; the position, or x and y are places in not a specific point that makes it imposssible for the blocks to be hit/for the ball to interact
//not under the y pos of the paddle (if colour is smae as background, then what's the point of drawing it)
//postcondition the paddle is to become blue will be magenta, and will be at a size and place that is assigned when the constructor is used. colours must be valid, and the paddle musn't be too large.

	void draw(Graphics g){
		g.setColor(Color.yellow);
			g.setColor(Color.blue);
           g.fillRect(x, y, width, height);
	} 
	public int getVelocity(){
		return velocity;
		}
	public void setVelocity(int velocity){
		this.velocity = velocity;
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
		public int getWidth() {
			return width;
		}
	
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
	
		public void setHeight(int height) {
			this.height = height;
		}
		// preconditions: variables must be ints and must have been previously created- and must add to an int (cannot become so large that it cannot be an int)
		// postcondition: the paddle will move from side to side (as the user dictates, but thats another piece of code)
		public void move(){
		x +=  velocity;
		}
		// preconditions: variables must be ints and must have been previously created- and must add to an int (cannot become so large that it cannot be an int)
		// postcondition: I acutally am not 100% sure what this is for- it appeared on the error, but it doesn't seem to appear on the code now that i look at it 
		public void addVelocity(int addVelocity) {
			x += addVelocity;
		}
}
