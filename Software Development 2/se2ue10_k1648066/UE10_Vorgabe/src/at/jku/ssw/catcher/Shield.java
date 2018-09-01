package at.jku.ssw.catcher;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
* This class is a concrete Decoratoor the Alien class. It will add 
* and draw up to three points inside the Alien before hitting it.
* @variable point the array that stores the points
* @author Francisco Litvay
*/
public class Shield extends AlienDecorator {
		Point[] point = new Point[3];
		int counter = 0;
		/**
		* This class is for setting the points with a 
		* specific location
		* @posX the X position of the point
		* @posY the Y position of the point
		* @author Francisco Litvay
		*/
		public class Point{
			int posX;
			int posY;
			public Point(int x, int y) {
				this.posX = x;
				this.posY = y;
			}
		}
		public Shield(Alien component) {
			super(component);
		}
		/**
		 * Same as for the normal hit, but before marking
		 * as captured it checks for the existence of the 
		 * points. If they don't exist yet, it creates them
		 * @param x
		 * the x coordinate for testing the hit
		 * @param y
		 * the y coordinate for testing the hit
		 */
		@Override
		public void hit(int x, int y) {
			if(isHit(x, y)) {
				if (counter < 2) {
					for (int i = 0; i < 3; i++) {
						if (point[i] == null) {
							point[i] = new Point(x, y);
							counter++;
							break;
						}
						else if(!isHit(point[i].posX, point[i].posY)){
							point[i] = new Point(x, y);
							break;
						}
					}
				}
				else super.hit(x, y);
			}
		}
		
		/**
		 * Same as for the normal paint, but adds the points
		 * inside the Aliens
		 * @param the 2D graphics context
		 */
		@Override
		public void paint(Graphics2D graphics2d) {
			  super.paint(graphics2d);
			  graphics2d.setPaint(Color.BLACK);
			  graphics2d.setStroke(new BasicStroke(4));
			  for(int i = 0; i < 3; i++) {
				  if(point[i] != null && isHit(point[i].posX, point[i].posY)) {
							graphics2d.setPaint(Color.BLACK);
							Ellipse2D ellipse = new Ellipse2D.Double(point[i].posX, point[i].posY, 2, 2);
							graphics2d.fill(ellipse);
							graphics2d.draw(ellipse);
				  }
				  else if(point[i] != null) {
					  point[i] = null;
					  counter--;
				  }
			}			
		}

}
