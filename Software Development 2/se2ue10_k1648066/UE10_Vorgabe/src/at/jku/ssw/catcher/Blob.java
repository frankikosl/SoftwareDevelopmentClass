package at.jku.ssw.catcher;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javafx.scene.shape.Circle;

/**
 * The concrete implementation for aliens which are painted,
 * shrink, then disappear or get captured.
 * @variable radius the radius of the circle
 * @variable x the position X of the blob
 * @variable y the position Y of the blob
 * @variable captured the boolean telling if the blob has been captured yet
 * @author Francisco Litvay
 * @version 1.0
 * @since 1.0
 */
public class Blob implements Alien{
	int radius;
	int x;
	int y;
	boolean captured = false;
	/**
	 * Initializes the blob. Parameters are 
	 * 	already described in the variables section
	 */
	public Blob(int x, int y, int radius) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	/**
	 * Try hitting the blob. If the blob is hit the blob gets captured.
	 * 
	 * @param x
	 *            the x coordinate for the hit
	 * @param y
	 *            the y coordinate for the hit
	 */
	@Override
	public void hit(int x, int y) {
		if(isHit(x, y)) {
			captured = true;
		}
	}
	/**
	 * Tests if the blob is hit by the given coordinates.
	 * 
	 * @param x
	 *            the x coordinate for testing the hit
	 * @param y
	 *            the y coordinate for testing the hit
	 * @return <code>true</code> if the coordinates are on the blob,
	 *         <code>false</code> otherwise.
	 */
	@Override
	public boolean isHit(int x, int y) {
		if(((x >= this.x - this.radius) && (x <= this.x + this.radius)) && ((y >= (this.y - this.radius)) && (y <= this.y + this.radius))) {
			return true;
		}
		return false;
	}
	/**
	 * Progresses the game state of the blob, e.g. shrink the size of the blob.
	 */
	@Override
	public void update() {
		--radius;
	}
	/**
	 * Tests if the blob is captured.
	 * 
	 * @return <code>true</code> if the blob has been captured (@see hit),
	 *         <code>false</code> otherwise.
	 */
	@Override
	public boolean isCaptured() {
		return captured;
	}
	/**
	 * Tests if the blob disappeared.
	 * 
	 * @return <code>true</code> if the blob has gone (e.g. shrunk to its minimal
	 *         size), <code>false</code> otherwise.
	 */
	@Override
	public boolean isGone() {
		if (this.radius < 10) return true;
		return false;
	}
	/**
	 * Paints a representation of the blob to the given graphics object.
	 * 
	 * @param the
	 *            2D graphics context
	 */
	@Override
	public void paint(Graphics2D graphics2d) {
		  graphics2d.setPaint(Color.BLUE);
		  graphics2d.setStroke(new BasicStroke(4));
		  graphics2d.fill(new Ellipse2D.Double(x, y, radius, radius));
          graphics2d.draw(new Ellipse2D.Double(x, y, radius, radius));
		
	}

}
