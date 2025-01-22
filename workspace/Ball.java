/*
 * Author: Yuna Cho, but mostly Mr. Menchukov
 * Date: 1/22/2025
 * Description: This component is the moving ball which the user will need use to kill bricks by hitting them
 * The ball will bounce across the walls in such a way that itś the reverse of the velocty by which itś been hit. it will be magenta, 
 * though I was thinking that maybe I hsould do it yellow, but now it's magenta and no one can do anything about it
 */
import java.awt.*;

public class Ball {
	//your code here!
	private int x;
	private int y;
	private int size;
	private int xVelocity;
	private int yVelocity;
	//don't forget you need instance variables:
	
	
	//constructor(for ball):
	public Ball(int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
		xVelocity=1;
		yVelocity=1;
	}

	//methods:
//this will draw the ball; colouring and filling in an elipse or "oval" which is to be the ball so that it can be seen and tracked
//precondition: color is not black, and the size is not 0; the position, or x and y are places in not a specific point that makes it imposssible for the blocks to be hit/for the paddle to interact
//not under the y pos of the paddle
//postcondition the ball will be magenta, and will be at a size and place that is assigned when the constructor is used. colours must be valid, and the ball musn't be too large.
	void draw(Graphics g){
		g.setColor(Color.yellow);
			g.setColor(Color.magenta);
           g.fillOval(x, y, size, size);
	} 
	public int getXpos() {
		return x;
	}

	public void setXpos(int x) {
		this.x = x;
	}

	public int getYpos() {
		return y;
	}

	public void setYpos(int y) {
		this.y = y;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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
	//precondition: the xvelocity must be an int and must have been created
	//postcondition:when called upon, the x velocity will become negative, which makes it reverse its direction
	
	public void reverseX(){
	    xVelocity = -xVelocity;
	}
	//precondition: yVelocity must be an int and must be created
	//postcondition: when called upon, the y velocity will become negative, which makes it reverse its direction
	public void reverseY(){
		yVelocity = -yVelocity;
	}
	//precondition: variables must have been created, and must be ints
	//postcondition:moves the ball- the x and y velocity will increase or decrease as fast as the velocity dictates
	public void move(){
		y += yVelocity;
		x += xVelocity;
	}
	public int getYVelocity(){
return yVelocity;
	}
	public void setYVelocity(int yVelocity){
this.yVelocity = yVelocity;
	}
	public int getXVelocity(){
return xVelocity;
	}
	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}
}
